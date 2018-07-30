import java.awt.event.KeyEvent;


/*
 * PatientInformation class
 * Gets information about the patient
 * Offers user to use preset or custom constraints
 */

/**
 *
 * @author Sunny
 */
public class PatientInformation extends javax.swing.JFrame {
    //Variables for patient information
    public String firstName, lastName;
    public String fInput ="", lInput="", aInput="";
    public int age;
    public boolean fName, lName, pAge;
    /**
     * Creates new form PatientInformation
     */
    public PatientInformation() {
        initComponents();
        warningLabel.setVisible(false);
    }
    // Will close the old frame after new frame is opened
    public void close(){
       this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        piJPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        fnameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        constraintsLabel = new javax.swing.JLabel();
        presetButton = new javax.swing.JButton();
        customButton = new javax.swing.JButton();
        lastNameLabel = new javax.swing.JLabel();
        lnameTextField = new javax.swing.JTextField();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));

        piJPanel.setBackground(new java.awt.Color(78, 104, 132));
        piJPanel.setPreferredSize(new java.awt.Dimension(740, 521));

        firstNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("Patient's First Name:");

        fnameTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        fnameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnameTextFieldKeyTyped(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Patient's Age:");

        ageTextField.setFont(new java.awt.Font("Times New Roman", 1, 24));
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyTyped(evt);
            }
        });

        constraintsLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        constraintsLabel.setForeground(new java.awt.Color(255, 255, 255));
        constraintsLabel.setText("Constraints: ");

        presetButton.setBackground(new java.awt.Color(255, 255, 255));
        presetButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        presetButton.setText("Preset");
        presetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presetButtonActionPerformed(evt);
            }
        });

        customButton.setBackground(new java.awt.Color(255, 255, 255));
        customButton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        customButton.setText("Custom");
        customButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtonActionPerformed(evt);
            }
        });

        lastNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Patient's Last Name:");

        lnameTextField.setFont(new java.awt.Font("Times New Roman", 1, 24));
        lnameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnameTextFieldKeyTyped(evt);
            }
        });

        warningLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        warningLabel.setForeground(new java.awt.Color(153, 0, 0));
        warningLabel.setText("*Please fill in all required information");

        javax.swing.GroupLayout piJPanelLayout = new javax.swing.GroupLayout(piJPanel);
        piJPanel.setLayout(piJPanelLayout);
        piJPanelLayout.setHorizontalGroup(
            piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(piJPanelLayout.createSequentialGroup()
                .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(piJPanelLayout.createSequentialGroup()
                        .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(piJPanelLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(firstNameLabel)
                                        .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lastNameLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, piJPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(constraintsLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fnameTextField)
                            .addComponent(lnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addGroup(piJPanelLayout.createSequentialGroup()
                                .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(presetButton)
                                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(customButton))))
                    .addGroup(piJPanelLayout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(warningLabel)))
                .addContainerGap())
        );
        piJPanelLayout.setVerticalGroup(
            piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(piJPanelLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addGap(46, 46, 46)
                .addGroup(piJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presetButton)
                    .addComponent(customButton)
                    .addComponent(constraintsLabel))
                .addGap(41, 41, 41)
                .addComponent(warningLabel)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void customButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //if conditions are not met, display warning message
        if(!fName || !lName || !pAge){
            warningLabel.setVisible(true);
        }
        //open and send patient info to custom constrains and then closes
        else{
            CustomConstraints constraints = new CustomConstraints();
            constraints.getInformation(firstName, lastName, age);
            constraints.setVisible(true);
            close();
        }
    }

    private void presetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //if conditions are not met, display warning message
        if(!fName || !lName || !pAge){
            warningLabel.setVisible(true);
        }
        //open and send patient info to custom constrains and then closes
        else{
            Monitor monitor = new Monitor();
            monitor.getFileName(firstName, lastName, age);
            monitor.getValues(101, 59, 41, 34, 96, 92, 
                 160, 119, 100, 79);
            monitor.setVisible(true);
            close();
        }
    }

    private void fnameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        
        boolean allowInput = false;
        char input = evt.getKeyChar();
        try{
            //Allow letters to be entered
            if(!(Character.isLetter(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && fInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& fInput.length() >= 0)){
                    fInput = fInput.substring(0, fInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add letters to a String
            if(allowInput && Character.isLetter(input)){
                fInput+=input;
            }
            //check to see if there is anything in the textfield
            if(fInput.length() >= 0){
                fName = true;
            }
            //store String in a new String variable
            firstName = fInput;
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void ageTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        
        boolean allowInput = false;
        char input = evt.getKeyChar();
        try{
            //allow digits to be entered, max length 3 digits
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| aInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && aInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& aInput.length() >= 0)){
                    aInput = aInput.substring(0, aInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add digit to a String
            if(allowInput && Character.isDigit(input)){
                aInput+=input;
            }
            //check to see if anyhting in textfield
            if(aInput.length() >= 0){
                pAge = true;
            }
            try{
                //convert String to a int and store it in a new variable
                age = Integer.parseInt(aInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
       }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void lnameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;
        char input = evt.getKeyChar();
        try{
            //Allow letter to be entered
            if(!(Character.isLetter(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && lInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& lInput.length() >= 0)){
                    lInput = lInput.substring(0, lInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add letter to a String
            if(allowInput && Character.isLetter(input)){
                lInput+=input;
            }
            //check to see if anything in the textfield
            if(lInput.length() >= 0){
                lName = true;
            }
            //store String into a new String variable
            lastName = lInput;
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
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
            java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientInformation().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel constraintsLabel;
    private javax.swing.JButton customButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField fnameTextField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lnameTextField;
    private javax.swing.JPanel piJPanel;
    private javax.swing.JButton presetButton;
    private javax.swing.JLabel warningLabel;
}
