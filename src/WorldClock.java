/**
 * Main class for the World Clock program.
 * The main class creates the GUI for the clock and updates the time display with the current time.
 *
 * @author: Alex Randall
 * @version: 1.0
 * @date: 03/04/2025
 * @file: WorldClock.java
 */

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class WorldClock {

    // Initialize  frame, labels, timer, and text field
    private JFrame worldClockFrame;

    private LocalTime time = LocalTime.now();
    private int hour = time.getHour();
    private int minute = time.getMinute();

    private Timer timer;

    private JLabel itLabel;
    private JLabel isLabel;
    private JLabel halfLabel;
    private JLabel tenLabel;
    private JLabel quarterLabel;
    private JLabel twentyLabel;
    private JLabel fiveLabel;
    private JLabel minutesLabel;
    private JLabel toLabel;
    private JLabel pastLabel;
    private JLabel twoLabel;
    private JLabel threeLabel;
    private JLabel oneLabel;
    private JLabel fourLabel;
    private JLabel fiveLabel2;
    private JLabel sixLabel;
    private JLabel sevenLabel;
    private JLabel eightLabel;
    private JLabel nineLabel;
    private JLabel tenLabel2;
    private JLabel elevenLabel;
    private JLabel twelveLabel;
    private JLabel oclockLabel;
    private JLabel squareLabel1;
    private JLabel squareLabel2;
    private JLabel squareLabel3;
    private JLabel squareLabel4;

    private JTextField customTimeTextField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WorldClock window = new WorldClock();
                    window.worldClockFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public WorldClock() {
        // Initialize the GUI components
        initialize();

        // Update the clock display with the current time
        updateClock();

        // Create a timer to update the clock every second
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Update the time every second
                time = LocalTime.now();
                hour = time.getHour();
                minute = time.getMinute();
                updateClock();
            }
        });
        timer.start();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        worldClockFrame = new JFrame();
        worldClockFrame.getContentPane().setBackground(new Color(0, 0, 0));
        worldClockFrame.setBackground(new Color(0, 0, 0));
        worldClockFrame.setFont(new Font("Copperplate", Font.BOLD, 25));
        worldClockFrame.setTitle("World Clock");
        worldClockFrame.setBounds(100, 100, 500, 500);
        worldClockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        worldClockFrame.getContentPane().setLayout(null);

        // Initialize and configure all the labels
        // It label
        itLabel = new JLabel("IT");
        itLabel.setForeground(new Color(255, 255, 255));
        itLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        itLabel.setHorizontalAlignment(SwingConstants.LEFT);
        itLabel.setBounds(100, 36, 150, 30);
        worldClockFrame.getContentPane().add(itLabel);

        // Is label
        isLabel = new JLabel("IS");
        isLabel.setForeground(new Color(255, 255, 255));
        isLabel.setHorizontalAlignment(SwingConstants.CENTER);
        isLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        isLabel.setBounds(105, 36, 150, 30);
        worldClockFrame.getContentPane().add(isLabel);

        // Half label
        halfLabel = new JLabel("HALF");
        halfLabel.setForeground(new Color(100, 100, 100));
        halfLabel.setHorizontalAlignment(SwingConstants.CENTER);
        halfLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        halfLabel.setBounds(190, 36, 150, 30);
        worldClockFrame.getContentPane().add(halfLabel);

        // Ten label
        tenLabel = new JLabel("TEN");
        tenLabel.setForeground(new Color(100, 100, 100));
        tenLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        tenLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        tenLabel.setBounds(260, 36, 150, 30);
        worldClockFrame.getContentPane().add(tenLabel);

        // Quarter label
        quarterLabel = new JLabel("QUARTER");
        quarterLabel.setForeground(new Color(100, 100, 100));
        quarterLabel.setHorizontalAlignment(SwingConstants.LEFT);
        quarterLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        quarterLabel.setBounds(100, 84, 150, 30);
        worldClockFrame.getContentPane().add(quarterLabel);

        // Twenty label
        twentyLabel = new JLabel("TWENTY");
        twentyLabel.setForeground(new Color(100, 100, 100));
        twentyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        twentyLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        twentyLabel.setBounds(260, 84, 150, 30);
        worldClockFrame.getContentPane().add(twentyLabel);

        // Five label
        fiveLabel = new JLabel("FIVE");
        fiveLabel.setForeground(new Color(100, 100, 100));
        fiveLabel.setHorizontalAlignment(SwingConstants.LEFT);
        fiveLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        fiveLabel.setBounds(100, 132, 150, 30);
        worldClockFrame.getContentPane().add(fiveLabel);

        // Minutes label
        minutesLabel = new JLabel("MINUTES");
        minutesLabel.setForeground(new Color(100, 100, 100));
        minutesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        minutesLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        minutesLabel.setBounds(175, 132, 150, 30);
        worldClockFrame.getContentPane().add(minutesLabel);

        // To label
        toLabel = new JLabel("TO");
        toLabel.setForeground(new Color(100, 100, 100));
        toLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        toLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        toLabel.setBounds(260, 132, 150, 30);
        worldClockFrame.getContentPane().add(toLabel);

        // Past label
        pastLabel = new JLabel("PAST");
        pastLabel.setForeground(new Color(100, 100, 100));
        pastLabel.setHorizontalAlignment(SwingConstants.LEFT);
        pastLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        pastLabel.setBounds(100, 185, 150, 30);
        worldClockFrame.getContentPane().add(pastLabel);

        // Two label
        twoLabel = new JLabel("TWO");
        twoLabel.setForeground(new Color(100, 100, 100));
        twoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        twoLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        twoLabel.setBounds(175, 185, 150, 30);
        worldClockFrame.getContentPane().add(twoLabel);

        // Three label
        threeLabel = new JLabel("THREE");
        threeLabel.setForeground(new Color(100, 100, 100));
        threeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        threeLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        threeLabel.setBounds(260, 185, 150, 30);
        worldClockFrame.getContentPane().add(threeLabel);

        // One label
        oneLabel = new JLabel("ONE");
        oneLabel.setForeground(new Color(100, 100, 100));
        oneLabel.setHorizontalAlignment(SwingConstants.LEFT);
        oneLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        oneLabel.setBounds(100, 233, 150, 30);
        worldClockFrame.getContentPane().add(oneLabel);

        // Four label
        fourLabel = new JLabel("FOUR");
        fourLabel.setForeground(new Color(100, 100, 100));
        fourLabel.setHorizontalAlignment(SwingConstants.CENTER);
        fourLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        fourLabel.setBounds(175, 233, 150, 30);
        worldClockFrame.getContentPane().add(fourLabel);

        // Five label
        fiveLabel2 = new JLabel("FIVE");
        fiveLabel2.setForeground(new Color(100, 100, 100));
        fiveLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        fiveLabel2.setFont(new Font("Copperplate", Font.BOLD, 25));
        fiveLabel2.setBounds(260, 233, 150, 30);
        worldClockFrame.getContentPane().add(fiveLabel2);

        // Six label
        sixLabel = new JLabel("SIX");
        sixLabel.setForeground(new Color(100, 100, 100));
        sixLabel.setHorizontalAlignment(SwingConstants.LEFT);
        sixLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        sixLabel.setBounds(100, 285, 150, 30);
        worldClockFrame.getContentPane().add(sixLabel);

        // Seven label
        sevenLabel = new JLabel("SEVEN");
        sevenLabel.setForeground(new Color(100, 100, 100));
        sevenLabel.setHorizontalAlignment(SwingConstants.CENTER);
        sevenLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        sevenLabel.setBounds(175, 285, 150, 30);
        worldClockFrame.getContentPane().add(sevenLabel);

        // Eight label
        eightLabel = new JLabel("EIGHT");
        eightLabel.setForeground(new Color(100, 100, 100));
        eightLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        eightLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        eightLabel.setBounds(260, 285, 150, 30);
        worldClockFrame.getContentPane().add(eightLabel);

        // Nine label
        nineLabel = new JLabel("NINE");
        nineLabel.setForeground(new Color(100, 100, 100));
        nineLabel.setHorizontalAlignment(SwingConstants.LEFT);
        nineLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        nineLabel.setBounds(100, 333, 150, 30);
        worldClockFrame.getContentPane().add(nineLabel);

        // Ten label
        tenLabel2 = new JLabel("TEN");
        tenLabel2.setForeground(new Color(100, 100, 100));
        tenLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        tenLabel2.setFont(new Font("Copperplate", Font.BOLD, 25));
        tenLabel2.setBounds(175, 333, 150, 30);
        worldClockFrame.getContentPane().add(tenLabel2);

        // Eleven label
        elevenLabel = new JLabel("ELEVEN");
        elevenLabel.setForeground(new Color(100, 100, 100));
        elevenLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        elevenLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        elevenLabel.setBounds(260, 333, 150, 30);
        worldClockFrame.getContentPane().add(elevenLabel);

        // Twelve label
        twelveLabel = new JLabel("TWELVE");
        twelveLabel.setForeground(new Color(100, 100, 100));
        twelveLabel.setHorizontalAlignment(SwingConstants.LEFT);
        twelveLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        twelveLabel.setBounds(100, 381, 150, 30);
        worldClockFrame.getContentPane().add(twelveLabel);

        // O'clock label
        oclockLabel = new JLabel("O'CLOCK");
        oclockLabel.setForeground(new Color(100, 100, 100));
        oclockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        oclockLabel.setFont(new Font("Copperplate", Font.BOLD, 25));
        oclockLabel.setBounds(260, 381, 150, 30);
        worldClockFrame.getContentPane().add(oclockLabel);

        // Square labels for minutes not divisible by 5
        // Square label 1
        squareLabel1 = new JLabel("■");
        squareLabel1.setForeground(new Color(100, 100, 100));
        squareLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        squareLabel1.setFont(new Font("Copperplate", Font.BOLD, 25));
        squareLabel1.setBounds(130, 415, 150, 30);
        worldClockFrame.getContentPane().add(squareLabel1);

        // Square label 2
        squareLabel2 = new JLabel("■");
        squareLabel2.setForeground(new Color(100, 100, 100));
        squareLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        squareLabel2.setFont(new Font("Copperplate", Font.BOLD, 25));
        squareLabel2.setBounds(160, 415, 150, 30);
        worldClockFrame.getContentPane().add(squareLabel2);

        // Square label 3
        squareLabel3 = new JLabel("■");
        squareLabel3.setForeground(new Color(100, 100, 100));
        squareLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        squareLabel3.setFont(new Font("Copperplate", Font.BOLD, 25));
        squareLabel3.setBounds(190, 415, 150, 30);
        worldClockFrame.getContentPane().add(squareLabel3);

        // Square label 4
        squareLabel4 = new JLabel("■");
        squareLabel4.setForeground(new Color(100, 100, 100));
        squareLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        squareLabel4.setFont(new Font("Copperplate", Font.BOLD, 25));
        squareLabel4.setBounds(220, 415, 150, 30);
        worldClockFrame.getContentPane().add(squareLabel4);

        // Initialize and configure the custom time text field
        customTimeTextField = new JTextField();
        customTimeTextField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // Check if the custom time text field is empty and start the timer
                if(customTimeTextField.getText().equals("")){
                    timer.start();
                    return;
                }
                else{
                    // Stop the timer and set the custom time
                    timer.stop();

                    // Parse the custom time from the text field
                    if(customTimeTextField.getText().length() == 4){
                        // Get the hour as a string
                        String customHourStr = customTimeTextField.getText();
                        customHourStr = customHourStr.substring(0, 1);

                        // Get the minute as a string
                        String customMinuteStr = customTimeTextField.getText();
                        customMinuteStr = customMinuteStr.substring(2, 4);

                        // Convert the strings to integers
                        int customHour = Integer.parseInt(customHourStr);
                        int customMinute = Integer.parseInt(customMinuteStr);

                        // Set the custom time
                        time = LocalTime.of(customHour, customMinute);
                        hour = time.getHour();
                        minute = time.getMinute();
                    }
                    else if(customTimeTextField.getText().length() == 5){
                        // Get the hour as a string
                        String customHourStr = customTimeTextField.getText();
                        customHourStr = customHourStr.substring(0, 2);

                        // Get the minute as a string
                        String customMinuteStr = customTimeTextField.getText();
                        customMinuteStr = customMinuteStr.substring(3, 5);

                        // Convert the strings to integers
                        int customHour = Integer.parseInt(customHourStr);
                        int customMinute = Integer.parseInt(customMinuteStr);

                        // Set the custom time
                        time = LocalTime.of(customHour, customMinute);
                        hour = time.getHour();
                        minute = time.getMinute();
                    }

                    // Update the clock display with the custom time
                    updateClock();
                }
            }
        });

        customTimeTextField.setHorizontalAlignment(SwingConstants.CENTER);
        customTimeTextField.setText("");
        customTimeTextField.setVisible(true);
        customTimeTextField.setOpaque(true);
        customTimeTextField.setBorder(null);
        customTimeTextField.setForeground(new Color(100, 100, 100));
        customTimeTextField.setBackground(new Color(0, 0, 0));
        customTimeTextField.setFont(new Font("Copperplate", Font.BOLD, 15));
        customTimeTextField.setBounds(175, 5, 150, 30);
        worldClockFrame.getContentPane().add(customTimeTextField);
        customTimeTextField.setColumns(10);
    }

    /**
     * Updates the clock display based on the current time.
     * This method is responsible for highlighting the appropriate labels
     * to represent the current time in a text format.
     */
    private void updateClock(){
        System.out.println(time.format(java.time.format.DateTimeFormatter.ofPattern("hh:mm:ss")));

        // Reset all labels to dim before updating
        setToDim();

        // Determine if the time is "to" or "past" the hour
        if(minute >= 35){
            // Adjust the hour for "to" the next hour
            hour++;
            toLabel.setForeground(new Color(255, 255, 255));
            minutesLabel.setForeground(new Color(255, 255, 255));
        }
        else if(minute < 35 && minute > 0){
            pastLabel.setForeground(new Color(255, 255, 255));
            minutesLabel.setForeground(new Color(255, 255, 255));
        }

        // Highlight the appropriate hour label
        switch(hour % 12){
            case 1:
                oneLabel.setForeground(new Color(255, 255, 255));
                break;
            case 2:
                twoLabel.setForeground(new Color(255, 255, 255));
                break;
            case 3:
                threeLabel.setForeground(new Color(255, 255, 255));
                break;
            case 4:
                fourLabel.setForeground(new Color(255, 255, 255));
                break;
            case 5:
                fiveLabel2.setForeground(new Color(255, 255, 255));
                break;
            case 6:
                sixLabel.setForeground(new Color(255, 255, 255));
                break;
            case 7:
                sevenLabel.setForeground(new Color(255, 255, 255));
                break;
            case 8:
                eightLabel.setForeground(new Color(255, 255, 255));
                break;
            case 9:
                nineLabel.setForeground(new Color(255, 255, 255));
                break;
            case 10:
                tenLabel2.setForeground(new Color(255, 255, 255));
                break;
            case 11:
                elevenLabel.setForeground(new Color(255, 255, 255));
                break;
            case 0:
                twelveLabel.setForeground(new Color(255, 255, 255));
                break;
        }

        // Highlight the appropriate minute label
        switch(minute - (minute % 5)){
            case 0:
                oclockLabel.setForeground(new Color(255, 255, 255));
                minutesLabel.setForeground(new Color(100, 100, 100));
                pastLabel.setForeground(new Color(100, 100, 100));
                break;
            case 5:
                fiveLabel.setForeground(new Color(255, 255, 255));
                break;
            case 10:
                tenLabel.setForeground(new Color(255, 255, 255));
                break;
            case 15:
                quarterLabel.setForeground(new Color(255, 255, 255));
                minutesLabel.setForeground(new Color(100, 100, 100));
                break;
            case 20:
                twentyLabel.setForeground(new Color(255, 255, 255));
                break;
            case 25:
                twentyLabel.setForeground(new Color(255, 255, 255));
                fiveLabel.setForeground(new Color(255, 255, 255));
                break;
            case 30:
                halfLabel.setForeground(new Color(255, 255, 255));
                minutesLabel.setForeground(new Color(100, 100, 100));
                break;
            case 35:
                fiveLabel.setForeground(new Color(255, 255, 255));
                twentyLabel.setForeground(new Color(255, 255, 255));
                break;
            case 40:
                twentyLabel.setForeground(new Color(255, 255, 255));
                break;
            case 45:
                quarterLabel.setForeground(new Color(255, 255, 255));
                minutesLabel.setForeground(new Color(100, 100, 100));
                break;
            case 50:
                tenLabel.setForeground(new Color(255, 255, 255));
                break;
            case 55:
                fiveLabel.setForeground(new Color(255, 255, 255));
                break;
        }

        // Highlight the appropriate square labels for minutes not divisible by 5
        switch(minute % 5){
            case 1:
                squareLabel1.setForeground(new Color(255, 255, 255));
                break;
            case 2:
                squareLabel1.setForeground(new Color(255, 255, 255));
                squareLabel2.setForeground(new Color(255, 255, 255));
                break;
            case 3:
                squareLabel1.setForeground(new Color(255, 255, 255));
                squareLabel2.setForeground(new Color(255, 255, 255));
                squareLabel3.setForeground(new Color(255, 255, 255));
                break;
            case 4:
                squareLabel1.setForeground(new Color(255, 255, 255));
                squareLabel2.setForeground(new Color(255, 255, 255));
                squareLabel3.setForeground(new Color(255, 255, 255));
                squareLabel4.setForeground(new Color(255, 255, 255));
                break;
        }
    }

    /**
     * Resets all labels to a dim color.
     * This method is used to clear the previous highlights before updating the clock display.
     */
    public void setToDim(){
        halfLabel.setForeground(new Color(100, 100, 100));
        tenLabel.setForeground(new Color(100, 100, 100));
        quarterLabel.setForeground(new Color(100, 100, 100));
        twentyLabel.setForeground(new Color(100, 100, 100));
        fiveLabel.setForeground(new Color(100, 100, 100));
        minutesLabel.setForeground(new Color(100, 100, 100));
        toLabel.setForeground(new Color(100, 100, 100));
        pastLabel.setForeground(new Color(100, 100, 100));
        twoLabel.setForeground(new Color(100, 100, 100));
        threeLabel.setForeground(new Color(100, 100, 100));
        oneLabel.setForeground(new Color(100, 100, 100));
        fourLabel.setForeground(new Color(100, 100, 100));
        fiveLabel2.setForeground(new Color(100, 100, 100));
        sixLabel.setForeground(new Color(100, 100, 100));
        sevenLabel.setForeground(new Color(100, 100, 100));
        eightLabel.setForeground(new Color(100, 100, 100));
        nineLabel.setForeground(new Color(100, 100, 100));
        tenLabel2.setForeground(new Color(100, 100, 100));
        elevenLabel.setForeground(new Color(100, 100, 100));
        twelveLabel.setForeground(new Color(100, 100, 100));
        oclockLabel.setForeground(new Color(100, 100, 100));
        squareLabel1.setForeground(new Color(100, 100, 100));
        squareLabel2.setForeground(new Color(100, 100, 100));
        squareLabel3.setForeground(new Color(100, 100, 100));
        squareLabel4.setForeground(new Color(100, 100, 100));
    }
}