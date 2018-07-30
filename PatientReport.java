import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/*
 * PatientReport Class
 * Find the file and opens it
 * Displays the file to the user
 */

/**
 *
 * @author Sunny
 */
public class PatientReport extends javax.swing.JFrame {
    //patient information
    public String patient_first_name, patient_last_name, fileName;
    public  int patient_age;
    /**
     * Creates new form PatientReport
     */
    public PatientReport() {
        initComponents();
        openButton.setVisible(true);
        closeButton.setVisible(false);
    }
    //get the patient information to create the file name
    public void getFileName(String fName, String lName, int age){
        patient_first_name = fName;
        patient_last_name = lName;
        patient_age = age;
        fileName = patient_first_name + "_" + patient_last_name + "_Report.txt";
    }    

    @SuppressWarnings("unchecked")
    private void initComponents() {

        prPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportJTextArea = new javax.swing.JTextArea();
        openButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));

        prPanel.setBackground(new java.awt.Color(255, 255, 255));

        reportJTextArea.setEditable(false);
        reportJTextArea.setColumns(20);
        reportJTextArea.setFont(new java.awt.Font("Monospaced", 0, 18)); 
        reportJTextArea.setRows(5);
        jScrollPane1.setViewportView(reportJTextArea);

        openButton.setBackground(new java.awt.Color(255, 255, 255));
        openButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        openButton.setText("OPEN");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(255, 255, 255));
        closeButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        closeButton.setText("CLOSE");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout prPanelLayout = new javax.swing.GroupLayout(prPanel);
        prPanel.setLayout(prPanelLayout);
        prPanelLayout.setHorizontalGroup(
            prPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1125, Short.MAX_VALUE)
            .addComponent(openButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        prPanelLayout.setVerticalGroup(
            prPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prPanelLayout.createSequentialGroup()
                .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            JFileChooser chosenFile = new JFileChooser();
            chosenFile.showOpenDialog(this);
            FileReader file = new FileReader(chosenFile.getSelectedFile());
            reportJTextArea.read(file,null);
        }
        catch(IOException e){
            //handle exception
        }
        openButton.setVisible(false);
        closeButton.setVisible(true);
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //exit application
        System.exit(0);
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
            java.util.logging.Logger.getLogger(PatientReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientReport().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton closeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openButton;
    private javax.swing.JPanel prPanel;
    private javax.swing.JTextArea reportJTextArea;
}
