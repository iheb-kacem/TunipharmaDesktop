
package com.tunipharma.statistique;

/**
 *
 * @author asma
 */
import com.tunipharma.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;

public class StatMapDAO {

    private Statement stat;                          // l objet statment execute les requete
    private ResultSet rs;
    private static StatMapDAO instanceStatMapDAO;

    private StatMapDAO() throws SQLException, ClassNotFoundException {
        // stat= ConnexionStat.getInstance().getCnx().createStatement();
        this.stat = MyConnection.getInstance().createStatement();
    }

    public static StatMapDAO getInstance() throws SQLException, ClassNotFoundException {
        if (instanceStatMapDAO == null) {
            instanceStatMapDAO = new StatMapDAO();
        }
        return instanceStatMapDAO;
    }

    public ArrayList<idef> pharmaIdAddressAll() throws SQLException {
        ArrayList<idef> phar = new ArrayList<idef>();

        String requete = "select ph.id, ph.codepostal,v.Gouvernorat,v.Delegation,ph.adresse\n"
                + "from pharmacie  as ph\n"
                + "inner join villes as v\n"
                + "on ph.codepostal=v.codepostal\n"
                + ";";
        rs = stat.executeQuery(requete);
        while (rs.next()) {
            idef i = new idef();
            i.setId(rs.getInt("id"));
            String str = "" + rs.getInt("codepostal") + "," + rs.getString("Gouvernorat") + "," + rs.getString("Delegation") + "," + rs.getString("adresse") + "," + "tunisie";
            i.setAddress(str);
            phar.add(i);

        }

        return phar;

    }

    public ResultSet phnoter(int id) throws SQLException {

        String requete = "SELECT pharmacie,jour,evaluation FROM tunipharma.commentaire where pharmacie=" + id;
        this.rs = stat.executeQuery(requete);
        return this.rs;
    }
}//ClassEND
