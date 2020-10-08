
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//class start
public class ConvertFrame extends JFrame {
    
    //initialize variables for the elements
    private final JLabel tempLabel;
    private final JLabel lengthLabel;
    private final JLabel displayTempLabel;
    private final JLabel displayLengthLabel;
    private final JTextField tempField;
    private final JTextField lengthField;
    private final JButton button1;
    private final JButton button2;
    
    //constructor
    public ConvertFrame () {
        
        //title bar
        super("Converter");
        //create new flow layout
        setLayout (new FlowLayout());
        
        //creating fields, buttons, and labels for temp and length
        tempLabel = new JLabel("Enter Fahrenheit temperature: ");
        
        tempField = new JTextField(5);
        
        button1 = new JButton("Convert");
        
        displayTempLabel = new JLabel("Fahrenheit to Celsius is: ");
        
        lengthLabel = new JLabel("Enter Inch length: ");
        
        lengthField = new JTextField(5);
        
        button2 = new JButton("Convert");
        
        displayLengthLabel = new JLabel("Inch to Centimeter is: ");
        
        //action listener for button to handle mouse click for temp
        button1.addActionListener(
        
                new ActionListener() {
                    
                    @Override
                    
                    public void actionPerformed(ActionEvent event) {
                       
                       convertTemp();
                       
                    }
                }
        );
        
        //action listener for button to handle mouse click for length
        button2.addActionListener(
        
                new ActionListener() {
                    
                    @Override
                    
                    public void actionPerformed(ActionEvent event) {
                        
                        convertLength();
                    }
                }
        );        
        
        
        //action listener for temperature text field when enter is hit
        tempField.addActionListener (
                
                new ActionListener() {
            
                @Override
                
                public void actionPerformed(ActionEvent event) {
                    
                    convertTemp();
                    
                }
            }
        );
        
        //action listener for length text field when enter is hit
        lengthField.addActionListener (
        
                new ActionListener() {
                    
                    @Override
                    
                    public void actionPerformed(ActionEvent event) {
                        
                        convertLength();
                        
                    }
                }
        );
        
        //adding display elements 
        add(tempLabel);
        add(tempField);
        add(button1);
        add(displayTempLabel);
        add(lengthLabel);
        add(lengthField);
        add(button2);
        add(displayLengthLabel);
        
    } //end constructor
    
    //method to convert temperature
    private void convertTemp() {
        
        int tempF = Integer.parseInt(tempField.getText());
        int tempC = (((tempF -32) * 5) /9);
        //method setText() to change the label to display temp in Celsius
        displayTempLabel.setText("Fahrenheit to Celsius is: " + tempC);
        
    }
    
    //method to convert length
    private void convertLength() {
        
        int lengthInch = Integer.parseInt(lengthField.getText());
        int lengthCentimeter = (int) Math.round(lengthInch * 2.54);
        //method getText() to change the label to display length in cm
        displayLengthLabel.setText("Inch to Centimeter is: " + lengthCentimeter);
        
    }
    
} //end class
