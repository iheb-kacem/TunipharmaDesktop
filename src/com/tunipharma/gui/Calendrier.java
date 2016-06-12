package com.tunipharma.gui;


import com.tunipharma.dao.GardeDAO;
import com.tunipharma.entities.Garde;
import com.tunipharma.entities.Pharmacie;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calendrier extends JPanel {
    
    private GardeDAO gardeDAO;
    private Pharmacie pharmacie;

    private Calendar today = new GregorianCalendar(); // Aujourd'hui
    private Calendar curday = new GregorianCalendar();// Jour courant
    private Calendar day = new GregorianCalendar();   // Jour de calcul

    // Diff�rentes actions
    private DateAction nextDayAction;	// Passage au jour suivant
    private DateAction prevDayAction;	// Passage au jour precedent
    private DateAction nextWeekAction;	// Passage � la semaine suivante
    private DateAction prevWeekAction;	// Passage � la semaine pr�c�dente
    private DateAction nextMonthAction;	// Passage au mois suivant
    private DateAction prevMonthAction;	// Passage au mois pr�c�dent
    private DateAction nextYearAction;	// Passage � l'ann�e suivante
    private DateAction prevYearAction;	// Passage � l'ann�e pr�c�dente

    // Diff�rentes vues partielles
    private BarView barView;   // Vue du mois et de l'ann�e avec les boutons
    private DayView dayView;   // Vue du jour 
    
    protected Calendrier view = this;
    public Calendrier(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
        if(pharmacie.getType().equals("Pharmacie de Nuit")){
            return;
        }
        gardeDAO = new GardeDAO();
        // R�pertoire contenant les images
        final String imagedir = "images/";
        // Ic�nes pour les boutons des actions
        ImageIcon prevMonthIcon = getIcon(imagedir + "prevMonth.png");
        ImageIcon nextMonthIcon = getIcon(imagedir + "nextMonth.png");
        ImageIcon prevYearIcon = getIcon(imagedir + "prevYear.png");
        ImageIcon nextYearIcon = getIcon(imagedir + "nextYear.png");

        // Construction des actions
        prevDayAction = new DateAction(Calendar.DAY_OF_MONTH, -1);
        nextDayAction = new DateAction(Calendar.DAY_OF_MONTH, 1);
        prevWeekAction = new DateAction(Calendar.DAY_OF_MONTH, -7);
        nextWeekAction = new DateAction(Calendar.DAY_OF_MONTH, 7);
        prevMonthAction = new DateAction(Calendar.MONTH, -1, prevMonthIcon);
        nextMonthAction = new DateAction(Calendar.MONTH, 1, nextMonthIcon);
        prevYearAction = new DateAction(Calendar.YEAR, -1, prevYearIcon);
        nextYearAction = new DateAction(Calendar.YEAR, 1, nextYearIcon);

            // Construction des vues partielles
        // Il est n�cessaire de les construiere apr�s les actions 
        // car elle les utilisent.
        // Vue du mois et de l'ann�e avec les boutons
        barView = new BarView();
        // Vue du jour 
        dayView = new DayView();
        setLayout(new BorderLayout());
        // Mise en place des vues partielles dans le panneau principal
        add(barView, BorderLayout.NORTH);
        add(dayView, BorderLayout.CENTER);

        // Liaison dans le panneau principal des touches aux actions
        KeyStroke key;	// Combinaison de touches utilis�e
        InputMap im = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        // Touche "Fl�che gauche" pour passer au jour pr�c�dent
        key = KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0);
        im.put(key, "prevDay");
        getActionMap().put("prevDay", prevDayAction);
        // Touche "Fl�che gauche" pour passer au jour suivant
        key = KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0);
        im.put(key, "nextDay");
        getActionMap().put("nextDay", nextDayAction);
        // Touche "Fl�che haut" pour passer � la semaine pr�c�dente
        key = KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0);
        im.put(key, "prevWeek");
        getActionMap().put("prevWeek", prevWeekAction);
        // Touche "Fl�che bas" pour passer � la semaine suivante
        key = KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0);
        im.put(key, "nextWeek");
        getActionMap().put("nextWeek", nextWeekAction);
        // Touche "Page up" pour passer au mois suivant
        key = KeyStroke.getKeyStroke(KeyEvent.VK_PAGE_UP, 0);
        im.put(key, "prevMonth");
        getActionMap().put("prevMonth", prevMonthAction);
        // Touche "Page down" pour passer au mois suivant
        key = KeyStroke.getKeyStroke(KeyEvent.VK_PAGE_DOWN, 0);
        im.put(key, "nextMonth");
        getActionMap().put("nextMonth", nextMonthAction);
        // Touche "Home" pour passer � l'ann�e pr�c�dente
        key = KeyStroke.getKeyStroke(KeyEvent.VK_HOME, 0);
        im.put(key, "prevYear");
        getActionMap().put("prevYear", prevYearAction);
        // Touche "End" pour passer � l'ann�e suivante
        key = KeyStroke.getKeyStroke(KeyEvent.VK_END, 0);
        im.put(key, "nextYear");
        getActionMap().put("nextYear", nextYearAction);

        // Mise en place de la date
        // update();
        // Mise � jour de la vue
        update();
        // Affichage de la vue
        setVisible(true);
    }

    // Mise � jour de la vue
    private void update() {
        // Mise � jour des vues partielles
        barView.update();
        dayView.update();
    }

    /**
     * Vue du mois et de l'ann�e avec des boutons
     */
    private class BarView extends JPanel {

        // Menu pour le choix du mois
        private JComboBox monthMenu;
        // Affichage de l'ann�e
        private JButton yearButton = new JButton();

        /**
         * Constructeur
         */
        protected BarView() {
            // Alignement horizontal
            this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            // Bouton ann�e pr�c�dente
            JButton prevYearButton = new JButton(prevYearAction);
            // Bouton ann�e suivante
            JButton nextYearButton = new JButton(nextYearAction);
            // Bouton mois pr�c�dent
            JButton prevMonthButton = new JButton(prevMonthAction);
            // Bouton mois suivant
            JButton nextMonthButton = new JButton(nextMonthAction);

            // Menu des mois avec une Combo-box
            String[] monthNames = new String[12];
            // Format pour les mois : nom en entier
            DateFormat df = new SimpleDateFormat("MMMM");
            // Premier mois de l'ann�e
            day.set(Calendar.MONTH, 0);
            for (int i = 0; i < 12; i++) {
                // R�cup�ration du nom d'un mois
                monthNames[i] = " " + df.format(day.getTime());
                // Passage au mois suivant
                day.add(Calendar.MONTH, 1);
            }
            monthMenu = new JComboBox(monthNames);
            // Contr�leur 
            monthMenu.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    curday.set(Calendar.MONTH,
                            monthMenu.getSelectedIndex());
                   view.update();
                }
            });

            // Bouton des ann�es
            yearButton.setMaximumSize(new Dimension(100, 50));
            // Contr�leur
            yearButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    // Affichage d'une fen�tre de saisie
                    String year
                            = JOptionPane.showInputDialog(view, "",
                                    new Integer(curday.get(Calendar.YEAR)));
                    // Tentative de lecture de la saisie
                    try {
                        curday.set(Calendar.YEAR,
                                Integer.parseInt(year));
                        view.update();
                    } // �chec de la lecture
                    catch (NumberFormatException exception) {
                    }
                }
            });

            // Ajouts des boutons et du menu dans le panneau
            this.add(prevYearButton);
            this.add(prevMonthButton);
            this.add(monthMenu);
            this.add(yearButton);
            this.add(nextMonthButton);
            this.add(nextYearButton);
        }

        // Mise � jour
        protected void update() {
            // Mise � jour du mois
            monthMenu.setSelectedIndex(curday.get(Calendar.MONTH));
            // Mise � jour de l'ann�e
            yearButton.setText(Integer.toString(curday.get(Calendar.YEAR)));
        }
    }

    /**
     * Vue du jour
     */
    private class DayView extends JPanel implements ActionListener {

        final int nlin = 6;	// Nombre de lignes
        final int ncol = 8;	// Nombre de colonnes
        DateFormat commandFormat;
        Color defaultColor; // Couleur par d�faut pour le fond
        JToggleButton[] days = new JToggleButton[nlin * (ncol-1)];
        JToggleButton[] week = new JToggleButton[6];

        protected DayView() {
            // Formateur utilis� pour les commandes des boutons
            commandFormat = DateFormat.getDateInstance(DateFormat.SHORT);
            // Grille de 7 sur 7
            setLayout(new GridLayout(nlin + 1, ncol));
                // Noms des jours de la semaine
            // Format des jours de la semaine : nom cours
            DateFormat df = new SimpleDateFormat("EEE");
            // Premier jour de la semaine : lundi
            day.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            add(new JLabel("WEEK", SwingConstants.CENTER));
            for (int i = 1; i < ncol; i++) {
                // Nom du jour 
                String dn = df.format(day.getTime());
                // Mise en majuscule de la premi�re lettre
                dn = dn.substring(0, 1).toUpperCase()
                        + dn.substring(1, Math.min(3, dn.length()));
                // Affichage centr�
                add(new JLabel(dn, SwingConstants.CENTER));
                // Passage au jour suivant
                day.add(Calendar.DAY_OF_WEEK, 1);
            }
            // Cr�ation des �tiquettes pour les num�ros des jours
            for (int i = 0; i < nlin * ncol; i++) {
                if (i % ncol == 0) {
                    // Construction du bouton
                    week[i / ncol] = new JToggleButton("");
                    // Alignement au centre du texte
                    week[i / ncol].setHorizontalAlignment(SwingConstants.CENTER);
                    // Pas de bord
                    week[i / ncol].setBorderPainted(false);
                    // Composant Opaque
                    week[i / ncol].setOpaque(true);
                    // �coute par la vue du bouton
                    week[i / ncol].addActionListener(this);
                    // Ajout dans le panneau
                    add(week[i / ncol]);
                } else {
                    // Construction du bouton
                    days[i - i / ncol - 1] = new JToggleButton("");
                    // Alignement au centre du texte
                    days[i - i / ncol - 1].setHorizontalAlignment(SwingConstants.CENTER);
                    // Pas de bord
                    days[i - i / ncol - 1].setBorderPainted(false);
                    // Composant Opaque
                    days[i - i / ncol - 1].setOpaque(true);
                    // �coute par la vue du bouton
                    days[i - i / ncol - 1].addActionListener(this);
                    // Ajout dans le panneau
                    add(days[i - i / ncol - 1]);
                }
            }
            // Couleur par defaut
            defaultColor = days[1].getBackground();
        }

        /**
         * Mise � jour de la vue
         */
        protected void update() {
            // Mois 
            int month = curday.get(Calendar.MONTH);
            // Premier jour du mois courant
            day.setTime(curday.getTime());
            day.set(Calendar.DAY_OF_MONTH, 1);
            // Calcul du premier jour de la semaine pr�c�dente
            int diff = Calendar.SATURDAY - day.get(Calendar.DAY_OF_WEEK);
            day.add(Calendar.DAY_OF_MONTH, diff < 0 ? diff : diff - 7);

            // Mise � jour
            for (int i = 0; i < nlin * ncol; i++) {
                if (i % ncol == 0) {
                    week[i / ncol].setSelected(false);
                    if (day.before(today)) {
                        week[i / ncol].setEnabled(false);
                    } else {
                        week[i / ncol].setEnabled(true);
                    }
                    week[i / ncol].setBackground(Color.yellow);
                    week[i / ncol].setForeground(Color.blue);
                    week[i / ncol].setText(Integer.toString(day.get(Calendar.WEEK_OF_YEAR)));
                    week[i / ncol].setActionCommand(commandFormat.format(day.getTime()) + "#");
                } else {
                    days[i - i / ncol - 1].setSelected(gardeDAO.pharmacieEnGarde(pharmacie, new Date(day.get(Calendar.YEAR)-1900, day.get(Calendar.MONTH), day.get(Calendar.DATE))));
                    if (day.before(today)) {
                        days[i - i / ncol - 1].setEnabled(false);
                    } else {
                        days[i - i / ncol - 1].setEnabled(true);
                    }
                    days[i - i / ncol - 1].setBackground(defaultColor);
                    if (sameDay(day, today)) {
                        days[i - i / ncol - 1].setForeground(Color.red);
                    } else if (day.get(Calendar.MONTH) == month) {
                        days[i - i / ncol - 1].setForeground(Color.black);
                    } else {
                        days[i - i / ncol - 1].setForeground(Color.gray);
                    }
                        // Commande
                    // La cha�ne de commande d'un bouton est la date associ�e
                    // � ce bouton.  Cette date est utilis�e lorsque le bouton
                    // est press�.
                    days[i - i / ncol - 1].setActionCommand(commandFormat.format(day.getTime()));
                    // Texte 
                    days[i - i / ncol - 1].setText(Integer.toString(day.get(Calendar.DAY_OF_MONTH)));
                    day.add(Calendar.DAY_OF_MONTH, 1);
                }
            }
        }

        /**
         * Test si deux dates sont dans le m�me jour
         */
        private boolean sameDay(Calendar d1, Calendar d2) {
            return d1.get(Calendar.YEAR) == d2.get(Calendar.YEAR)
                    && d1.get(Calendar.MONTH) == d2.get(Calendar.MONTH)
                    && d1.get(Calendar.DAY_OF_MONTH)
                    == d2.get(Calendar.DAY_OF_MONTH);
        }

        /**
         * Prise en compte d'un click sur un bouton
         */
        public void actionPerformed(ActionEvent event) {
            if (event.getActionCommand().contains("#")) {
                for (int i = 0; i < week.length; i++) {
                    if (week[i].getActionCommand().equals(event.getActionCommand()) && week[i].isSelected()) {
                        for (int j = 0; j < 7; j++) {
                            days[i * 7 + j ].setSelected(true);
                            String jour = days[i * 7 + j ].getActionCommand();
                            gardeDAO.insertGarde(new Garde(pharmacie, new Date(Integer.parseInt(jour.substring(6, 8))+2000,Integer.parseInt(jour.substring(3, 5))-1,Integer.parseInt(jour.substring(0, 2)))));

                        }
                    } else if (week[i].getActionCommand().equals(event.getActionCommand()) && week[i].isSelected() == false) {
                        for (int j = 0; j < 7; j++) {
                            days[i * 7 + j ].setSelected(false);
                            String jour = days[i * 7 + j ].getActionCommand();
                            gardeDAO.deleteGarde(new Garde(pharmacie, new Date(Integer.parseInt(jour.substring(6, 8))+2000,Integer.parseInt(jour.substring(3, 5))-1,Integer.parseInt(jour.substring(0, 2)))));

                        }
                    }
                }
            }else{
                for (int i = 0; i < days.length; i++) {
                    if (days[i].getActionCommand().equals(event.getActionCommand()) && days[i].isSelected()) {
                        gardeDAO.insertGarde(new Garde(pharmacie, new Date(Integer.parseInt(event.getActionCommand().substring(6, 8))+2000,Integer.parseInt(event.getActionCommand().substring(3, 5))-1,Integer.parseInt(event.getActionCommand().substring(0, 2)))));
                    } else if (days[i].getActionCommand().equals(event.getActionCommand()) && days[i].isSelected() == false) {
                        gardeDAO.deleteGarde(new Garde(pharmacie, new Date(Integer.parseInt(event.getActionCommand().substring(6, 8))+2000,Integer.parseInt(event.getActionCommand().substring(3, 5))-1,Integer.parseInt(event.getActionCommand().substring(0, 2)))));
                    }
                }
            }
        }
    }

    /**
     * Actions pour changer le jour courant
     */
    private class DateAction extends AbstractAction {

        int field; 		// Champ concern�
        int offset;		// Modification du champ

        /**
         * Construction sans icon
         */
        protected DateAction(int field, int offset) {
            init(field, offset);
        }

        /**
         * Construction avec icon
         */
        protected DateAction(int field, int offset, ImageIcon icon) {
            super("", icon);
            init(field, offset);
        }

        /**
         * Initialisation commune aux constructeurs
         */
        private void init(int field, int offset) {
            this.field = field;
            this.offset = offset;
        }

        // R�alisation de l'action (partie contr�leur de l'action)
        public void actionPerformed(ActionEvent e) {
            // Changement du jour courant
            curday.add(field, offset);
            // Mise � jour de la vue
            view.update();
        }
    }

    // M�thode permettant de r�cup�rer une image � partir du fichier
    private ImageIcon getIcon(String file) {
            // La fa�on normale est de faire "new ImageIcon(file);"
        // mais cette m�thode ne marche pas lorsque les fichiers
        // d'images sont inclus dans un fichier jar.
        return new ImageIcon(Calendrier.class.getResource(file));
    }
}
