package zackgriffithhw5;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

class Calculator extends JFrame {
    //data members
    //text field
    private JTextArea outputField;
    //buttons
    private JButton oneB, twoB, threeB, fourB, fiveB, sixB,
                    sevenB, eightB, nineB, zeroB, doubleZeroB,
                    addB, subB, multB, divB, equalB, decimalB,
                    clearB, clearAllB, offB;
    //panels
    private JPanel numbersP, operatorsP, functionsP;
    //variables to hold operator, user-input numbers, and result
    private char operator;
    private double num; 
    private double result; 
    
    //constructor
    public Calculator() {
        createUserInterface();
    }
    
    //build the interface
    public void createUserInterface() {
        //create contentPane
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        
        //setup the output field
        outputField = new JTextArea();
        outputField.setLayout(null);
        outputField.setBounds(10, 10, 465, 20);
        outputField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        outputField.setText("");
        outputField.setEditable(false);
        outputField.setBackground(Color.WHITE);
        contentPane.add(outputField);
        
        //setup the number pad panel
        numbersP = new JPanel();
        numbersP.setLayout(null);
        numbersP.setBounds(10, 50, 170, 220);
        numbersP.setBorder(new BevelBorder(BevelBorder.LOWERED ));
        contentPane.add(numbersP);
        
        //setup the buttons
        //1 button
        oneB = new JButton();
        oneB.setBounds(10, 10, 50, 50);
        oneB.setText("1");
        numbersP.add(oneB);
        oneB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    oneBActionPerformed(event);
                }
            }
        );
        //2 button
        twoB = new JButton();
        twoB.setBounds(60, 10, 50, 50);
        twoB.setText("2");
        numbersP.add(twoB);
        twoB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                   twoBActionPerformed(event);
                }
            }
        );
        //3 button
        threeB = new JButton();
        threeB.setBounds(110, 10, 50, 50);
        threeB.setText("3");
        numbersP.add(threeB);
        threeB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    threeBActionPerformed(event);
                }
            }
        );
        //4 button
        fourB = new JButton();
        fourB.setBounds(10, 60, 50, 50);
        fourB.setText("4");
        numbersP.add(fourB);
        fourB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    fourBActionPerformed(event);
                }
            }
        );
        //5 button
        fiveB = new JButton();
        fiveB.setBounds(60, 60, 50, 50);
        fiveB.setText("5");
        numbersP.add(fiveB);
        fiveB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    fiveBActionPerformed(event);
                }
            }
        );
        //6 button
        sixB = new JButton();
        sixB.setBounds(110, 60, 50, 50);
        sixB.setText("6");
        numbersP.add(sixB);
        sixB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    sixBActionPerformed(event);
                }
            }
        );
        //7 button
        sevenB = new JButton();
        sevenB.setBounds(10, 110, 50, 50);
        sevenB.setText("7");
        numbersP.add(sevenB);
        sevenB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    sevenBActionPerformed(event);
                }
            }
        );
        //8 button
        eightB = new JButton();
        eightB.setBounds(60, 110, 50, 50);
        eightB.setText("8");
        numbersP.add(eightB);
        eightB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    eightBActionPerformed(event);
                }
            }
        );
        //9 button
        nineB = new JButton();
        nineB.setBounds(110, 110, 50, 50);
        nineB.setText("9");
        numbersP.add(nineB);
        nineB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    nineBActionPerformed(event);
                }
            }
        );
        //0 button
        zeroB = new JButton();
        zeroB.setBounds(10, 160, 50, 50);
        zeroB.setText("0");
        numbersP.add(zeroB);
        zeroB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    zeroBActionPerformed(event);
                }
            }
        );
        //00 button
        doubleZeroB = new JButton();
        doubleZeroB.setBounds(60, 160, 100, 50);
        doubleZeroB.setText("00");
        numbersP.add(doubleZeroB);
        doubleZeroB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    doubleZeroBActionPerformed(event);
                }
            }
        );
        
        //setup the operator panel
        operatorsP = new JPanel();
        operatorsP.setLayout(null);
        operatorsP.setBounds(210, 50, 140, 220);
        operatorsP.setBorder(new BevelBorder(BevelBorder.LOWERED ));
        contentPane.add(operatorsP);
        
        //setup the operator buttons
        //+ button
        addB = new JButton();
        addB.setBounds(10, 10, 50, 130);
        addB.setText("+");
        addB.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        operatorsP.add(addB);
        addB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    addBActionPerformed(event);
                }
            }
        );
        //- button
        subB = new JButton();
        subB.setBounds(80, 10, 50, 50);
        subB.setText("-");
        subB.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        operatorsP.add(subB);
        subB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    subBActionPerformed(event);
                }
            }
        );
        //* button
        multB = new JButton();
        multB.setBounds(80, 60, 50, 50);
        multB.setText("*");
        multB.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        operatorsP.add(multB);
        multB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    multBActionPerformed(event);
                }
            }
        );
        //* button
        divB = new JButton();
        divB.setBounds(80, 110, 50, 50);
        divB.setText("/");
        divB.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        operatorsP.add(divB);
        divB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    divBActionPerformed(event);
                }
            }
        );
        //= button
        equalB = new JButton();
        equalB.setBounds(80, 160, 50, 50);
        equalB.setText("=");
        equalB.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        operatorsP.add(equalB);
        equalB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    equalBActionPerformed(event);
                }
            }
        );
        //. button
        decimalB = new JButton();
        decimalB.setBounds(10, 160, 50, 50);
        decimalB.setText(".");
        decimalB.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        operatorsP.add(decimalB);
        decimalB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    decimalBActionPerformed(event);
                }
            }
        );
        
        //setup the function panel
        functionsP = new JPanel();
        functionsP.setLayout(null);
        functionsP.setBounds(380, 50, 95, 140);
        functionsP.setBorder(new BevelBorder(BevelBorder.LOWERED ));
        contentPane.add(functionsP);
        
        //setup the function buttons
        //C Button
        clearB = new JButton();
        clearB.setBounds(10, 10, 75, 50);
        clearB.setText("C");
        functionsP.add(clearB);
        clearB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    clearBActionPerformed(event);
                }
            }
        );
        //C/A Button
        clearAllB = new JButton();
        clearAllB.setBounds(10, 80, 75, 50);
        clearAllB.setText("C/A");
        functionsP.add(clearAllB);
        clearAllB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    clearAllBActionPerformed(event);
                }
            }
        );
        
        //setup the off button
        offB = new JButton();
        offB.setBounds(380, 220, 95, 50);
        offB.setText("OFF");
        contentPane.add(offB);
        offB.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    offBActionPerformed(event);
                }
            }
        );
        
        //set properties of the application's window
        setTitle("Calculator"); //sets the title bar text
        setSize(500, 320); //set window size
        setVisible(true); //makes it visible 
    } //end of createUserInterface method
    
    //numerical button methods
    //when user presses 1
    private void oneBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"1");
    }
    //when user presses 2
    private void twoBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"2");
    }
    //when user presses 3
    private void threeBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"3");
    }
    //when user presses 4
    private void fourBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"4");
    }
    //when user presses 5
    private void fiveBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"5");
    }
    //when user presses 6
    private void sixBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"6");
    }
    //when user presses 7
    private void sevenBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"7");
    }
    //when user presses 8
    private void eightBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"8");
    }
    //when user presses 9
    private void nineBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"9");
    }
    //when user presses 0
    private void zeroBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"0");
    }
    //when user presses 00
    private void doubleZeroBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+"00");
    }
    
    //operator button methods
    //when user presses +
    private void addBActionPerformed(ActionEvent event) {
        num = Double.parseDouble(outputField.getText());
        operator = '+';
        outputField.setText("");
    }
    //when user presses -
    private void subBActionPerformed(ActionEvent event) {
        num = Double.parseDouble(outputField.getText());
        operator = '-';
        outputField.setText("");
    }
    //when user presses *
    private void multBActionPerformed(ActionEvent event) {
        num = Double.parseDouble(outputField.getText());
        operator = '*';
        outputField.setText("");
    }
    //when user presses /
    private void divBActionPerformed(ActionEvent event) {
        num = Double.parseDouble(outputField.getText());
        operator = '/';
        outputField.setText("");
    }
    //when user presses .
    private void decimalBActionPerformed(ActionEvent event) {
        outputField.setText(outputField.getText()+".");
    }
    
    //when user presses =
    private void equalBActionPerformed(ActionEvent event) {
        result = Double.parseDouble(outputField.getText());
        switch(operator) {
            case '+': 
                result += num;
                break;
            case '-':
                result = num - result;
                break;
            case '*':
                result *= num;
                break;
            case '/':
                result = num / result;
                break;
        }
        operator = ' ';
        outputField.setText(Double.toString(result));
    }
    
    //function button methods
    //when user presses C
    private void clearBActionPerformed(ActionEvent event) {
        //check whether we are clearing number before or after operator
        if(operator == ' ')
            num = 0;
        else
            result = 0;
        outputField.setText("");
    }
    //when user presses C/A 
    private void clearAllBActionPerformed(ActionEvent event) {
        //clears both stored nums
        num = 0;
        result = 0;
        outputField.setText("");
    }
    //when user presses Off
    private void offBActionPerformed(ActionEvent event) {
        //closes the program
        System.exit(0);
    }
}//end of Calculator Class

public class Calc_ZackG {

    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
