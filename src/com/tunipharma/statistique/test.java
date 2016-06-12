
package com.tunipharma.statistique;

import com.tunipharma.util.MyConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asma
 */
public class test {
    public static void main(String [] args) throws ClassNotFoundException, SQLException{
        try {
            System.out.println(StatMapDAO.getInstance().pharmaIdAddressAll());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
