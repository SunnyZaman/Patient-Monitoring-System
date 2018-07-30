/*
 * MainMenu Class
 * Displays the menu to the user
 * Gives two options: instruction and start
 */

/**
 *
 * @author Sunny
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }
    // Will close the old frame after new frame is opened
    public void close(){
       this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        mmJPanel = new javax.swing.JPanel();
        pmsJLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        instructionsButton = new javax.swing.JButton();
        bgJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));

        mmJPanel.setLayout(null);

        pmsJLabel.setBackground(new java.awt.Color(0, 0, 0));
        pmsJLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); 
        pmsJLabel.setForeground(new java.awt.Color(255, 255, 255));
        pmsJLabel.setText("Patient Monitoring System");
        mmJPanel.add(pmsJLabel);
        pmsJLabel.setBounds(160, 210, 440, 70);

        startButton.setBackground(new java.awt.Color(255, 255, 255));
        startButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        mmJPanel.add(startButton);
        startButton.setBounds(400, 360, 71, 31);

        instructionsButton.setBackground(new java.awt.Color(255, 255, 255));
        instructionsButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        instructionsButton.setText("Instructions");
        instructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionsButtonActionPerformed(evt);
            }
        });
        mmJPanel.add(instructionsButton);
        instructionsButton.setBounds(200, 360, 130, 31);

        bgJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical img.jpg"))); 
        mmJPanel.add(bgJLabel);
        bgJLabel.setBounds(0, 0, 750, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mmJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mmJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void instructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //opens instructions and closes
        Instructions instructions = new Instructions();
        instructions.setVisible(true);
        close();
    }

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //opens up patientinformation and closes / starts application
        PatientInformation information = new PatientInformation();
        information.setVisible(true);
        close();
    }

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JLabel bgJLabel;
    private javax.swing.JButton instructionsButton;
    private javax.swing.JPanel mmJPanel;
    private javax.swing.JLabel pmsJLabel;
    private javax.swing.JButton startButton;
}
