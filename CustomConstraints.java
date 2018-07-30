import java.awt.event.KeyEvent;

/*
 * CustomConstraints Class
 * Allows the user to enter max and min constraints
 * Sends data to the monitor
 */

/**
 *
 * @author Sunny
 */
public class CustomConstraints extends javax.swing.JFrame {

    //Max and min variables for the vital signs
    public  int maxHR, minHR, maxTemp, minTemp, maxBOL, minBOL, maxBPS, minBPS,
            maxBPD, minBPD;
    //Input variables
    public String maxHRInput = "", minHRInput = "", maxTempInput = "", 
            minTempInput = "", maxBOLInput = "", minBOLInput = "", maxBPSInput = "", 
            minBPSInput = "", maxBPDInput = "", minBPDInput = "";
    //Boolean variables
    public boolean boolMaxHR, boolMinHR, boolMaxTemp, boolMinTemp, boolMaxBOL, 
            boolMinBOL, boolMaxBPS, boolMinBPS, boolMaxBPD, boolMinBPD;
    //Patient information variables
    public  String patient_first_name, patient_last_name;
    public  int patient_age;

    /**
     * Creates new form CustomConstraints
     */
    public CustomConstraints() {
        initComponents();
        warningLabel.setVisible(false);
    }
    // Will close the old frame after new frame is opened
    public void close(){
       this.setVisible(false);
    }
    //store patient information in variables from PatientInformation
    public void getInformation (String fName, String lName, int age){
        patient_first_name = fName;
        patient_last_name = lName;
        patient_age = age;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        ccJPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        hrLabel = new javax.swing.JLabel();
        maxHrLabel = new javax.swing.JLabel();
        maxHeartRateJTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        minHrLabel = new javax.swing.JLabel();
        minHeartRateJTextField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tempLabel = new javax.swing.JLabel();
        maxTempLabel = new javax.swing.JLabel();
        maxTemperatureJTextField = new javax.swing.JTextField();
        minTempLabel = new javax.swing.JLabel();
        minTemperatureJTextField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        bolLabel = new javax.swing.JLabel();
        maxBolLabel = new javax.swing.JLabel();
        MaxBolJTextField = new javax.swing.JTextField();
        MinBolLabel = new javax.swing.JLabel();
        minBolJTextField = new javax.swing.JTextField();
        bpLabel = new javax.swing.JLabel();
        maxBpsLabel = new javax.swing.JLabel();
        maxBpsJTextField = new javax.swing.JTextField();
        minBpsLabel = new javax.swing.JLabel();
        minBpsJTextField = new javax.swing.JTextField();
        continueButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        maxBpdLabel = new javax.swing.JLabel();
        maxBpdJTextField = new javax.swing.JTextField();
        minBpdLabel = new javax.swing.JLabel();
        minBpdJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));

        ccJPanel.setBackground(new java.awt.Color(78, 104, 132));
        ccJPanel.setPreferredSize(new java.awt.Dimension(740, 521));

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Fill in required information:");

        hrLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        hrLabel.setForeground(new java.awt.Color(255, 255, 255));
        hrLabel.setText("Heart Rate (beats/min)");

        maxHrLabel.setFont(new java.awt.Font("Times New Roman", 1, 16));
        maxHrLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxHrLabel.setText("Max: ");

        maxHeartRateJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        maxHeartRateJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxHeartRateJTextFieldKeyTyped(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        minHrLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        minHrLabel.setForeground(new java.awt.Color(255, 255, 255));
        minHrLabel.setText("Min: ");

        minHeartRateJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        minHeartRateJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minHeartRateJTextFieldKeyTyped(evt);
            }
        });

        tempLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        tempLabel.setForeground(new java.awt.Color(255, 255, 255));
        tempLabel.setText("Temperature (°C)");

        maxTempLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        maxTempLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxTempLabel.setText("Max: ");

        maxTemperatureJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        maxTemperatureJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxTemperatureJTextFieldKeyTyped(evt);
            }
        });

        minTempLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        minTempLabel.setForeground(new java.awt.Color(255, 255, 255));
        minTempLabel.setText("Min: ");

        minTemperatureJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        minTemperatureJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minTemperatureJTextFieldKeyTyped(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        bolLabel.setFont(new java.awt.Font("Times New Roman", 1, 18));
        bolLabel.setForeground(new java.awt.Color(255, 255, 255));
        bolLabel.setText("Blood Oxygen Level (%)");

        maxBolLabel.setFont(new java.awt.Font("Times New Roman", 1, 16));
        maxBolLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxBolLabel.setText("Max: ");

        MaxBolJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        MaxBolJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MaxBolJTextFieldKeyTyped(evt);
            }
        });

        MinBolLabel.setFont(new java.awt.Font("Times New Roman", 1, 16));
        MinBolLabel.setForeground(new java.awt.Color(255, 255, 255));
        MinBolLabel.setText("Min: ");

        minBolJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        minBolJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minBolJTextFieldKeyTyped(evt);
            }
        });

        bpLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        bpLabel.setForeground(new java.awt.Color(255, 255, 255));
        bpLabel.setText("Blood Pressure (mmHg)");

        maxBpsLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        maxBpsLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxBpsLabel.setText("Max Systolic: ");

        maxBpsJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        maxBpsJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxBpsJTextFieldKeyTyped(evt);
            }
        });

        minBpsLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        minBpsLabel.setForeground(new java.awt.Color(255, 255, 255));
        minBpsLabel.setText("Min Systolic: ");

        minBpsJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        minBpsJTextField.setToolTipText("");
        minBpsJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minBpsJTextFieldKeyTyped(evt);
            }
        });

        continueButton.setBackground(new java.awt.Color(255, 255, 255));
        continueButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        warningLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        warningLabel.setForeground(new java.awt.Color(153, 0, 0));
        warningLabel.setText("*Please fill in all required information");

        maxBpdLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        maxBpdLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxBpdLabel.setText("Max Diastolic:");

        maxBpdJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        maxBpdJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxBpdJTextFieldKeyTyped(evt);
            }
        });

        minBpdLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        minBpdLabel.setForeground(new java.awt.Color(255, 255, 255));
        minBpdLabel.setText("Min Diastolic:");

        minBpdJTextField.setFont(new java.awt.Font("Times New Roman", 1, 16));
        minBpdJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minBpdJTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout ccJPanelLayout = new javax.swing.GroupLayout(ccJPanel);
        ccJPanel.setLayout(ccJPanelLayout);
        ccJPanelLayout.setHorizontalGroup(
            ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ccJPanelLayout.createSequentialGroup()
                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ccJPanelLayout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(bpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ccJPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ccJPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ccJPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ccJPanelLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(hrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ccJPanelLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(maxHeartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(maxHrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minHrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ccJPanelLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(minHeartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(90, 90, 90)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ccJPanelLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(tempLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(maxTempLabel)
                                    .addGroup(ccJPanelLayout.createSequentialGroup()
                                        .addComponent(minTempLabel)
                                        .addGap(13, 13, 13)
                                        .addComponent(minTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(470, 470, 470)
                                .addComponent(maxTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ccJPanelLayout.createSequentialGroup()
                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ccJPanelLayout.createSequentialGroup()
                        .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(MaxBolJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ccJPanelLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(bolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(maxBolLabel)
                                    .addGroup(ccJPanelLayout.createSequentialGroup()
                                        .addComponent(MinBolLabel)
                                        .addGap(23, 23, 23)
                                        .addComponent(minBolJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ccJPanelLayout.createSequentialGroup()
                                .addComponent(maxBpsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addComponent(minBpsLabel)
                                .addGap(10, 10, 10))))
                    .addGroup(ccJPanelLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(continueButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(warningLabel)
                    .addGroup(ccJPanelLayout.createSequentialGroup()
                        .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(minBpsJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(maxBpsJTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ccJPanelLayout.createSequentialGroup()
                                .addComponent(maxBpdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addComponent(minBpdLabel)
                                .addGap(10, 10, 10)))
                        .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(minBpdJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(maxBpdJTextField))))
                .addGap(26, 26, 26))
        );
        ccJPanelLayout.setVerticalGroup(
            ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ccJPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(titleLabel)
                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ccJPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(hrLabel)
                                .addGap(18, 18, 18)
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxHeartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maxHrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minHrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minHeartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(tempLabel)
                                .addGap(18, 18, 18)
                                .addComponent(maxTempLabel)
                                .addGap(41, 41, 41)
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minTempLabel)
                                    .addComponent(minTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(maxTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(bolLabel)
                                .addGap(18, 18, 18)
                                .addComponent(maxBolLabel)
                                .addGap(41, 41, 41)
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MinBolLabel)
                                    .addComponent(minBolJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(minBpsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minBpsLabel)
                                    .addComponent(minBpdLabel)
                                    .addComponent(minBpdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(MaxBolJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ccJPanelLayout.createSequentialGroup()
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ccJPanelLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(bpLabel))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(maxBpsLabel)
                                    .addComponent(maxBpsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maxBpdLabel)
                                    .addComponent(maxBpdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addGroup(ccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warningLabel)))
                    .addGroup(ccJPanelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ccJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ccJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
    }

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //if all the requirements are not met, then send the warning label
        if(!boolMaxHR || !boolMinHR || !boolMaxTemp || !boolMinTemp || !boolMaxBOL || 
                !boolMinBOL || !boolMaxBPS || !boolMinBPS || !boolMaxBPD || 
                !boolMinBPD){
            warningLabel.setVisible(true);
        }
        //else send data to montior, close this frame, and open monitor frame
        else{
            Monitor monitor = new Monitor();
            monitor.getValues(maxHR, minHR, maxTemp, minTemp, maxBOL, minBOL, 
                 maxBPS, minBPS, maxBPD, minBPD);
            monitor.getFileName(patient_first_name, patient_last_name, patient_age);
            monitor.setVisible(true);
            close();
        }
    }

    private void maxHeartRateJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;        
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| maxHRInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && maxHRInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& maxHRInput.length() >= 0)){
                    maxHRInput = maxHRInput.substring(0, maxHRInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add digit to a string
            if(allowInput && Character.isDigit(input)){
                maxHRInput+=input;
            }
            //check to see if there is anything in the textfield
            if(maxHRInput.length() >= 0){
                boolMaxHR = true;
            }
            try{
                //convert string to int
                maxHR = Integer.parseInt(maxHRInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void minHeartRateJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;        
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| minHRInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && minHRInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& minHRInput.length() >= 0)){
                    minHRInput = minHRInput.substring(0, minHRInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add digit to a string
            if(allowInput && Character.isDigit(input)){
                minHRInput+=input;
            }
            //check to see if there is anything in the textfield
            if(minHRInput.length() >= 0){
                boolMinHR = true;
            }
            try{
                //convert string to int
                minHR = Integer.parseInt(minHRInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void maxTemperatureJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;        
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| maxTempInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && maxTempInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& maxTempInput.length() >= 0)){
                    maxTempInput = maxTempInput.substring(0, maxTempInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add digit to a string
            if(allowInput && Character.isDigit(input)){
                maxTempInput+=input;
            }
            //Checks if there is anything in the textfield
            if(maxTempInput.length() >= 0){
                boolMaxTemp = true;
            }
            try{
                //convert String to int
                maxTemp = Integer.parseInt(maxTempInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }        
    }

    private void minTemperatureJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;        
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| minTempInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && minTempInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& minTempInput.length() >= 0)){
                    minTempInput = minTempInput.substring(0, minTempInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //Add digit to a String
            if(allowInput && Character.isDigit(input)){
                minTempInput+=input;
            }
            //CHecks if there is anything in the textfield
            if(minTempInput.length() >= 0){
                boolMinTemp = true;
            }
            try {
                //convert String to int
                minTemp = Integer.parseInt(minTempInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void MaxBolJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;        
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| maxBOLInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && maxBOLInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& maxBOLInput.length() >= 0)){
                    maxBOLInput = maxBOLInput.substring(0, maxBOLInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add digit to a String
            if(allowInput && Character.isDigit(input)){
                maxBOLInput+=input;
            }
            //checking to see if anything in the textfield
            if(maxBOLInput.length() >= 0){
                boolMaxBOL = true;
            }
            try{
                //converting String to int
                maxBOL = Integer.parseInt(maxBOLInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void minBolJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;        
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| minBOLInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && minBOLInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& minBOLInput.length() >= 0)){
                    minBOLInput = minBOLInput.substring(0, minBOLInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //adds digit to a String
            if(allowInput && Character.isDigit(input)){
                minBOLInput+=input;
            }
            //checking to see if anything is in the textfield
            if(minBOLInput.length() >= 0){
                boolMinBOL = true;
            }
            try{
                //converting String to an int
                minBOL = Integer.parseInt(minBOLInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void maxBpsJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;        
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| maxBPSInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && maxBPSInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& maxBPSInput.length() >= 0)){
                    maxBPSInput = maxBPSInput.substring(0, maxBPSInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //adds digit to a String
            if(allowInput && Character.isDigit(input)){
                maxBPSInput+=input;
            }
            //checking to see if there is anything in the textfield
            if(maxBPSInput.length() >= 0){
                boolMaxBPS = true;
            }
            try{
                //convert the String to an int
                maxBPS = Integer.parseInt(maxBPSInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void minBpsJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false; 
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| minBPSInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && minBPSInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& minBPSInput.length() >= 0)){
                    minBPSInput = minBPSInput.substring(0, minBPSInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add digit to a String
            if(allowInput && Character.isDigit(input)){
                minBPSInput+=input;
            }
            //check to see if there anything in the textfield
            if(minBPSInput.length() >= 0){
                boolMinBPS = true;
            }
            try{
                //convert String to an int
                minBPS = Integer.parseInt(minBPSInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void maxBpdJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;        
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| maxBPDInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && maxBPDInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& maxBPDInput.length() >= 0)){
                    maxBPDInput = maxBPDInput.substring(0, maxBPDInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add digit to a String
            if(allowInput && Character.isDigit(input)){
                maxBPDInput+=input;
            }
            //check to see if there is anything in the textfield
            if(maxBPDInput.length() >= 0){
                boolMaxBPD = true;
            }
            try{
                //convert String to an int
                maxBPD = Integer.parseInt(maxBPDInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
        }
        catch(StringIndexOutOfBoundsException e){
            //handle exception
        }
    }

    private void minBpdJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean allowInput = false;       
        char input = evt.getKeyChar();
        try{
            //Allow only 1-3 digits to be entered
            if(!(Character.isDigit(input)) || (input == KeyEvent.VK_BACK_SPACE) || 
                (input == KeyEvent.VK_DELETE)|| minBPDInput.length() >= 3){
                evt.consume();
                if(((input == KeyEvent.VK_BACK_SPACE) && minBPDInput.length() >= 0)  || 
                    ((input == KeyEvent.VK_DELETE)&& minBPDInput.length() >= 0)){
                    minBPDInput = minBPDInput.substring(0, minBPDInput.length()-1);
                }
            }
            else { allowInput = true;
            }
            //add digit to a String
            if(allowInput && Character.isDigit(input)){
                minBPDInput+=input;
            }
            //check to see if there is anything in the testfield
            if(minBPDInput.length() >= 0){
                boolMinBPD = true;
            }
            try{
                //converting String to an int
                minBPD = Integer.parseInt(minBPDInput);
            }
            catch(NumberFormatException nfe){
                //handle exception
            }
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
            java.util.logging.Logger.getLogger(CustomConstraints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomConstraints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomConstraints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomConstraints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomConstraints().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JTextField MaxBolJTextField;
    private javax.swing.JLabel MinBolLabel;
    private javax.swing.JLabel bolLabel;
    private javax.swing.JLabel bpLabel;
    private javax.swing.JPanel ccJPanel;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel hrLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel maxBolLabel;
    private javax.swing.JTextField maxBpdJTextField;
    private javax.swing.JLabel maxBpdLabel;
    private javax.swing.JTextField maxBpsJTextField;
    private javax.swing.JLabel maxBpsLabel;
    private javax.swing.JTextField maxHeartRateJTextField;
    private javax.swing.JLabel maxHrLabel;
    private javax.swing.JLabel maxTempLabel;
    private javax.swing.JTextField maxTemperatureJTextField;
    private javax.swing.JTextField minBolJTextField;
    private javax.swing.JTextField minBpdJTextField;
    private javax.swing.JLabel minBpdLabel;
    private javax.swing.JTextField minBpsJTextField;
    private javax.swing.JLabel minBpsLabel;
    private javax.swing.JTextField minHeartRateJTextField;
    private javax.swing.JLabel minHrLabel;
    private javax.swing.JLabel minTempLabel;
    private javax.swing.JTextField minTemperatureJTextField;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel warningLabel;

}
