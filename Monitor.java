
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JTextField;
import javax.swing.Timer;

/*
 * Monitor Class
 * Displays the simulation of the patient monitoring system.
 * Shows numerical values changing for the vital signs it is operating for.
 */

/**
 *
 * @author Sunny
 */
public class Monitor extends javax.swing.JFrame {
    //Integer variables for the max and min vital signs
    public int maxHeartRate, minHeartRate, maxTemperature, minTemperature, 
            maxBloodOxygenLevel, minBloodOxygenLevel, maxBloodPressureSystolic, 
            minBloodPressureSystolic, maxBloodPressureDiastolic, minBloodPressureDiastolic;
    //Integer variables for the vital signs
    public int heartRate,temperature, bloodOxygenLevel, bloodPressureSystolic,
            bloodPressureDiastolic;
    //boolean variable for switches, and dangerous level
    public static boolean sensorSwitch, powerSwitch, dangerousHigh,
            dangerousLow;
    //timer variables
    public Timer timer1,timer2, timer3;
    //counter variable
    public int count = 0, count2 = 0;
    //random number variables
    public int randomNum = 0, randomNumber = 0;
    //the variable for the name of the file
    public  String filename;
    //printwriter variable to write to a file
    public  PrintWriter fileWrite;
    //variables for patient information
    public  String patient_first_name, patient_last_name;
    public  int patient_age;

    /**
     * Creates new form Monitor
     */
    public Monitor() {
        initComponents();
        warningJLabel.setVisible(false);
    }
    //Generate a random number
    public int randomNumberGenerator(){
       //random number is in the form of:
       //randomNum = (int) (Math.random() * (((max - (min)) + 1) + min)));
       return (randomNum = (int) (Math.random() * (((3 - (0)) + 1) + 0)));
    }
    //Get the values for the vital signs
    public void getValues(int maxHRate, int minHRate, int maxTemp, int minTemp, 
            int maxBOL, int minBOL, int maxBPS, int minBPS, int maxBPD, int minBPD){
       //storing data
        maxHeartRate = maxHRate;
        minHeartRate = minHRate;
        maxTemperature = maxTemp;
        minTemperature = minTemp;
        maxBloodOxygenLevel = maxBOL;
        minBloodOxygenLevel = minBOL;
        maxBloodPressureSystolic = maxBPS;
        minBloodPressureSystolic = minBPS;
        maxBloodPressureDiastolic = maxBPD;
        minBloodPressureDiastolic = minBPD;
        
        //getting the initial value for the vital signs
        heartRate = (maxHeartRate + minHeartRate)/2;
        temperature = (maxTemperature + minTemperature)/2;
        bloodOxygenLevel =  (maxBloodOxygenLevel + minBloodOxygenLevel)/2;
        bloodPressureSystolic = (maxBloodPressureSystolic + minBloodPressureSystolic)/2;
        bloodPressureDiastolic = (maxBloodPressureDiastolic + minBloodPressureDiastolic)/2;  
    }
    //Get patient information and create a file name
    public void getFileName(String fName, String lName, int age){
        patient_first_name = fName;
        patient_last_name = lName;
        patient_age = age;
        filename = patient_first_name + "_" + patient_last_name + "_Report.txt";
    }
    //create a new file and write information
    public void createFile(){
        try {
             fileWrite = new PrintWriter(filename);
             fileWrite.println("Patient's Monitor Report \n");
             fileWrite.println("Name: " + patient_first_name + " " + 
                     patient_last_name + "\n");
             fileWrite.println("Age: " + patient_age + "\n");
             fileWrite.println("Heart Rate (beats/second) \tTemperature "
                            + "(Â°C) \tBlood Oxygen Level (%) \tBlood Pressure(mmHg)");
             fileWrite.println(heartRate +" \t\t\t\t" + temperature + " \t\t\t" +
                            bloodOxygenLevel + " \t\t\t" + bloodPressureSystolic + "/" +
                            bloodPressureDiastolic); 
        }
        catch (FileNotFoundException e){
            //handle execution
        }
    }
    // Will close the old frame after new frame is opened
    public void close(){
       this.setVisible(false);
    }
    //output data to textfields
    public void monitorSetup() {
        if(sensorSwitch && powerSwitch){
            hrTextField.setText(heartRate+"");
            hrTextField.setHorizontalAlignment(JTextField.CENTER);
            tempTextField.setText(temperature+"");
            tempTextField.setHorizontalAlignment(JTextField.CENTER);
            bolTextField.setText(bloodOxygenLevel+"");
            bolTextField.setHorizontalAlignment(JTextField.CENTER);
            bpTextField.setText(bloodPressureSystolic+"/" + bloodPressureDiastolic);
            bpTextField.setHorizontalAlignment(JTextField.CENTER);
            
        }
        else{
            hrTextField.setText("");
            tempTextField.setText("");
            bolTextField.setText("");
            bpTextField.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        monitorPanel = new javax.swing.JPanel();
        sensorJToggleButton = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        hrJLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tempJLabel = new javax.swing.JLabel();
        hrTextField = new javax.swing.JTextField();
        tempTextField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        bolJLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        bpJLabel = new javax.swing.JLabel();
        bolTextField = new javax.swing.JTextField();
        bpTextField = new javax.swing.JTextField();
        exitReportButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        warningJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));

        monitorPanel.setBackground(new java.awt.Color(78, 104, 132));

        sensorJToggleButton.setBackground(new java.awt.Color(255, 255, 255));
        sensorJToggleButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        sensorJToggleButton.setText("Enable Sensors");
        sensorJToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorJToggleButtonActionPerformed(evt);
            }
        });

        hrJLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        hrJLabel.setForeground(new java.awt.Color(255, 255, 255));
        hrJLabel.setText("Heart Rate (beats/min)");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tempJLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        tempJLabel.setForeground(new java.awt.Color(255, 255, 255));
        tempJLabel.setText("Temperature (°C)");

        hrTextField.setEditable(false);
        hrTextField.setFont(new java.awt.Font("Times New Roman", 1, 48)); 

        tempTextField.setEditable(false);
        tempTextField.setFont(new java.awt.Font("Times New Roman", 1, 48)); 

        bolJLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        bolJLabel.setForeground(new java.awt.Color(255, 255, 255));
        bolJLabel.setText("Blood Oxygen Level (%)");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        bpJLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        bpJLabel.setForeground(new java.awt.Color(255, 255, 255));
        bpJLabel.setText("Blood Pressure (mmHg)");

        bolTextField.setEditable(false);
        bolTextField.setFont(new java.awt.Font("Times New Roman", 1, 48)); 

        bpTextField.setEditable(false);
        bpTextField.setFont(new java.awt.Font("Times New Roman", 1, 48)); 

        exitReportButton.setBackground(new java.awt.Color(255, 255, 255));
        exitReportButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        exitReportButton.setText("Exit & Get Report");
        exitReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitReportButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        warningJLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        warningJLabel.setForeground(new java.awt.Color(153, 0, 0));
        warningJLabel.setText("*Disable sensors and click stop to exit & get report");

        javax.swing.GroupLayout monitorPanelLayout = new javax.swing.GroupLayout(monitorPanel);
        monitorPanel.setLayout(monitorPanelLayout);
        monitorPanelLayout.setHorizontalGroup(
            monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monitorPanelLayout.createSequentialGroup()
                .addGroup(monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(sensorJToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(startButton)
                        .addGap(40, 40, 40)
                        .addComponent(stopButton))
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(monitorPanelLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(hrJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(monitorPanelLayout.createSequentialGroup()
                                .addGap(470, 470, 470)
                                .addComponent(tempJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(monitorPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(hrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(monitorPanelLayout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(monitorPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(monitorPanelLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(bolJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(monitorPanelLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(bpJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(exitReportButton)
                        .addGap(18, 18, 18)
                        .addComponent(warningJLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        monitorPanelLayout.setVerticalGroup(
            monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monitorPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sensorJToggleButton)
                    .addComponent(startButton)
                    .addComponent(stopButton))
                .addGap(11, 11, 11)
                .addGroup(monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(hrJLabel))
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tempJLabel))
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(hrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bolJLabel)
                        .addGap(31, 31, 31)
                        .addComponent(bolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(monitorPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bpJLabel)
                        .addGap(31, 31, 31)
                        .addComponent(bpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(monitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitReportButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(warningJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monitorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monitorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void sensorJToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //sensor enabled
        if(sensorJToggleButton.isSelected()) {
            sensorJToggleButton.setText("Disable Sensors");
            sensorSwitch = true;
            monitorPanel.setBackground(new Color(78,104,132));
        }
        //sensor disabled
        else {
            sensorJToggleButton.setText("Enable Sensors");
            sensorSwitch = false;
        }
         monitorSetup();
    }

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {
        createFile();
        powerSwitch = true;
        monitorSetup();
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
        //Create the flashing effect for when vital signs are above the max, below the
        // min, and when the sensor is disabled as the power is on
        timer1 = new Timer(250, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                //jTextField2.setText(count + "");
                if((!sensorSwitch && powerSwitch) || dangerousHigh || dangerousLow){
                    getToolkit().beep();
                    if(count%2==0){
                        monitorPanel.setBackground(Color.getHSBColor(0f, 0.6f, 0.7f));
                    }
                    else{
                        monitorPanel.setBackground(new Color(78,104,132));
                    }
                }                
            }
            
        });
        timer1.start();
        // Show the vital signs change (decrease/increase) randomly
         timer2 = new Timer(3000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                count2++;
                if(powerSwitch && sensorSwitch){
                    //when count is divisible by 2 increase the vital signs by
                    // a random number
                    if(count2%2==0){
                         //heartRate += (randomNumber = randomNumberGenerator());
                         temperature += (randomNumber = randomNumberGenerator());
                         bloodOxygenLevel += (randomNumber = randomNumberGenerator());
                         bloodPressureSystolic += (randomNumber = randomNumberGenerator());
                         bloodPressureDiastolic += (randomNumber = randomNumberGenerator());
                         if(/*heartRate >= maxHeartRate || */temperature >= maxTemperature ||
                                 bloodOxygenLevel >= maxBloodOxygenLevel ||
                                 bloodPressureSystolic >= maxBloodPressureSystolic ||
                                 bloodPressureDiastolic >= maxBloodPressureDiastolic) {
                                dangerousHigh = true;
                         }
                         else {
                                dangerousHigh = false;
                         }
                     }
                    //when count is not divisible by 2 decrase the vital signs
                    // a random number
                    else{
                         //heartRate -= (randomNumber = randomNumberGenerator());
                         temperature -= (randomNumber = randomNumberGenerator());
                         bloodOxygenLevel -= (randomNumber = randomNumberGenerator());
                         bloodPressureSystolic -= (randomNumber = randomNumberGenerator());
                         bloodPressureDiastolic -= (randomNumber = randomNumberGenerator());
                         if(/*heartRate <= minHeartRate || */temperature <= minTemperature ||
                                 bloodOxygenLevel <= minBloodOxygenLevel ||
                                 bloodPressureSystolic <= minBloodPressureSystolic ||
                                 bloodPressureDiastolic <= minBloodPressureDiastolic) {
                                dangerousLow = true;
                         }
                         else {
                                dangerousLow = false;
                         }
                    }
                    //update textfields
                    hrTextField.setText(heartRate+"");
                    tempTextField.setText(temperature+"");
                    bolTextField.setText(bloodOxygenLevel+"");
                    bpTextField.setText(bloodPressureSystolic+"/" + bloodPressureDiastolic);
                    //write data to file
                    fileWrite.println(heartRate +" \t\t\t\t" + temperature + " \t\t\t" +
                            bloodOxygenLevel + " \t\t\t" + bloodPressureSystolic + "/" +
                            bloodPressureDiastolic);                    
                }
            }
            
        });
        timer2.start();
        //show the heart rate change randomly for every 60 sec
            timer3 = new Timer(60000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                count2++;
                if(powerSwitch && sensorSwitch){
                    // if count2 is divisble by 2 then add random number
                    if(count2%2==0){
                         heartRate += ((randomNumber = randomNumberGenerator())*2);
                         if(heartRate >= maxHeartRate) {
                            dangerousHigh = true;
                         }
                         else {
                                dangerousHigh = false;
                         }
                     }
                    // count2 is not divisble by 2 then subtract random number
                    else{
                         heartRate -= ((randomNumber = randomNumberGenerator())*2);
                         if(heartRate <= minHeartRate) {
                             dangerousLow = true;
                         }
                         else {
                             dangerousLow = false;
                         }
                    }
                    //update textfields
                    hrTextField.setText(heartRate+"");
                    tempTextField.setText(temperature+"");
                    bolTextField.setText(bloodOxygenLevel+"");
                    bpTextField.setText(bloodPressureSystolic+"/" + bloodPressureDiastolic);
                    //write data to file
                    fileWrite.println(heartRate +" \t\t\t\t" + temperature + " \t\t\t" +
                            bloodOxygenLevel + " \t\t\t" + bloodPressureSystolic + "/" +
                            bloodPressureDiastolic);                    
                }
            }
            
        });
        timer3.start();
    }

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //stop monitor
        stopButton.setEnabled(false);
        startButton.setEnabled(true);
        powerSwitch = false;
        timer1.stop();
        timer2.stop();
        timer3.stop();
        monitorPanel.setBackground(new Color(78,104,132));
    }

    private void exitReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //if sensors are disabled and simulator is stopped, then open report or
        // else send warning message
        if(!powerSwitch && !sensorSwitch){
            fileWrite.close();
            PatientReport pReport = new PatientReport();        
            pReport.setVisible(true);
            close();
       }
        else {
            warningJLabel.setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Monitor monitor = new Monitor();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                monitor.setVisible(true);
                //createFile();
            }
        });
    }

    // Variables declaration
    private javax.swing.JLabel bolJLabel;
    private javax.swing.JTextField bolTextField;
    private javax.swing.JLabel bpJLabel;
    private javax.swing.JTextField bpTextField;
    private javax.swing.JButton exitReportButton;
    private javax.swing.JLabel hrJLabel;
    private javax.swing.JTextField hrTextField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel monitorPanel;
    private javax.swing.JToggleButton sensorJToggleButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel tempJLabel;
    private javax.swing.JTextField tempTextField;
    private javax.swing.JLabel warningJLabel;
}
