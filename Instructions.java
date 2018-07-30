/*
 * Instructions Class
 * Gives the user a walkthrough of the application
 */

/**
 *
 * @author Sunny
 */
public class Instructions extends javax.swing.JFrame {

    /**
     * Creates new form Instructions
     */
    public Instructions() {
        initComponents();
    }
    // Will close the old frame after new frame is opened
    public void close(){
       this.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        instructionsJPanel = new javax.swing.JPanel();
        instructionsJLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructionsJTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));
        setPreferredSize(new java.awt.Dimension(747, 570));

        instructionsJPanel.setBackground(new java.awt.Color(78, 104, 132));
        instructionsJPanel.setForeground(new java.awt.Color(255, 255, 255));

        instructionsJLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); 
        instructionsJLabel.setForeground(new java.awt.Color(255, 255, 255));
        instructionsJLabel.setText("Instructions");

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        backButton.setText("Go Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        instructionsJTextArea.setEditable(false);
        instructionsJTextArea.setBackground(new java.awt.Color(51, 51, 51));
        instructionsJTextArea.setColumns(20);
        instructionsJTextArea.setFont(new java.awt.Font("Times New Roman", 0, 24));
        instructionsJTextArea.setForeground(new java.awt.Color(255, 255, 255));
        instructionsJTextArea.setRows(5);
        instructionsJTextArea.setText("There are two options in the main menu: Instructions \n(current page) and Start.\n\nThe Introductions option gives you a walkthrough \nof the application.\n\nThe Start option starts the simulation for the \nPatient Monitoring System.\n\nAfter starting the application, basic information regarding \nthe patient must be filled in.\n\nYou will have the option to choose Preset or Custom \nconstraints for the vital signs that the operator is monitoring.\n\nIf you choose to select Preset: you will directly go to the \nmonitor page.\n\nIf you choose to select Custom: you will have \nto enter the maximum and minimum values for Heart Rate, \nTemperature, Blood Oxygen Level, and Blood Pressure.\n\nOnce you enter all the required information, you will \nbe brought to the monitor page.\n\nOn the monitor page, there will be four small white \nscreens displaying numerical values in regards to the \npatient's Heart Rate, Temperature, Blood Oxygen Level, \nand Blood Pressure.\n\nFor the screens to work, the sensors must be enabled and \nthe start button must be clicked.\n\nIf you disable the sensors while the start button is enabled, \nthe screen will start flashing. Indicating you to enable the \nsensors.\n\nIf any value for Heart Rate, Temperature, Blood \nOxygen Level, and Blood Pressure are below their \nrespective minimum value and/or above their respective \nmaximum value, then the screen will start flashing.\n\nTo exit and get the report, you have to click stop, \ndisable sensors and then click the Exit & Get Report \nbutton. After clicking this button, the Report page will \nappear.\n\nTo get the report, click the Open button and find the file. \nThe file will be in the form of :\n                firstname_lastname_Report.txt.\n\nTo exit the application, click Close.");
        instructionsJTextArea.setCaretColor(new java.awt.Color(255, 255, 255));
        instructionsJTextArea.setCaretPosition(0);
        jScrollPane1.setViewportView(instructionsJTextArea);

        javax.swing.GroupLayout instructionsJPanelLayout = new javax.swing.GroupLayout(instructionsJPanel);
        instructionsJPanel.setLayout(instructionsJPanelLayout);
        instructionsJPanelLayout.setHorizontalGroup(
            instructionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionsJPanelLayout.createSequentialGroup()
                .addGroup(instructionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(instructionsJPanelLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(instructionsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(instructionsJPanelLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(instructionsJPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        instructionsJPanelLayout.setVerticalGroup(
            instructionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionsJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(instructionsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(instructionsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(instructionsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //opens menu and closes
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        close();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instructions().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton backButton;
    private javax.swing.JLabel instructionsJLabel;
    private javax.swing.JPanel instructionsJPanel;
    private javax.swing.JTextArea instructionsJTextArea;
    private javax.swing.JScrollPane jScrollPane1;
}
