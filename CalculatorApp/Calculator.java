import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator {
    int boardWidth = 420;
    int boardHeight = 600;

    // Creating custom colors for the calculator
    Color LightGray = new Color(212, 212, 210);
    Color DarkGray = new Color(80, 80, 80);
    Color Black = new Color(28, 28, 28);
    Color Orange = new Color(255, 149, 0);

    // Listing every button as an array, sorted visually to represent the calculator layout
    String[] buttonValues = {
            "AC", "Del", "%", "+/-",
            "7", "8", "9", "÷",
            "4", "5", "6", "×",
            "1", "2", "3", "-",
            ".", "0", "00", "+",
            "x²", "√", "π", "=",
    };
    // Listing top buttons and right buttons to automate assigning colors and functions using a For Loop
    String[] orangeSymbols = {"÷", "×", "-", "+", "="};
    String[] lightGraySymbols = {"AC", "%", "Del", "+/-"};

    JFrame frame = new JFrame("Calculator");
    JLabel displayLabel = new JLabel();
    JPanel displayPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

    // Cache to store values after a completed step
    // Step 1: When an operator button is clicked the last displayed number is stored as A (which is 0 by default),
    // Step 2: When a number button is clicked the last chosen operator is stored as operator (which is null by default),
    // Step 3: When "=" is clicked the last displayed number is stored as B and the calculation takes place,
    // displays the result and resets the variables to default.
    String A = "0";
    String operator = null;
    String B = null;

    Calculator() {
        // General Window Settings
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayLabel.setBackground(Black);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 60));
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("0");
        displayLabel.setOpaque(true);

        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayLabel);
        frame.add(displayPanel, BorderLayout.NORTH);

        buttonsPanel.setLayout(new GridLayout(6, 4));
        buttonsPanel.setBackground(Black);
        frame.add(buttonsPanel);

        // Iterating through every element of the Buttons array to create JButtons and give them color and function
        for (int i = 0; i < buttonValues.length; i++) {
            JButton button = new JButton();
            String buttonValue = buttonValues[i];
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            button.setText(buttonValue);
            button.setFocusable(false);
            button.setBorder(new LineBorder(Black));

            // If element is contained in the LightGraySymbols array ("AC", "%", "Del", "+/-")
            // it gives them light gray color
            if (Arrays.asList(lightGraySymbols).contains(buttonValue)) {
                button.setBackground(LightGray);
                button.setForeground(Black);
            }
            // If element is contained in the orangeSymbols array ("÷", "×", "-", "+", "=")
            // it gives them orange color
            else if (Arrays.asList(orangeSymbols).contains(buttonValue)) {
                button.setBackground(Orange);
                button.setForeground(Color.white);
            }
            // For every other element (not contained in any array) it gives them DarkGray color
            else {
                button.setBackground(DarkGray);
                button.setForeground(Color.white);
            }
            buttonsPanel.add(button);

            // Aside from assigning colors the For Loop also assigns Action Listener and function to the buttons
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    String buttonValue = button.getText();

                    // Here the loop assigns function to buttons contained in the orangeSymbols array
                    if (Arrays.asList(orangeSymbols).contains(buttonValue)) {
                        if (buttonValue == "=") {
                            if (A != null) {
                                B = displayLabel.getText();
                                double numA = Double.parseDouble(A);
                                double numB = Double.parseDouble(B);

                                if (operator == "+") {
                                    displayLabel.setText(removeZeroDecimal(numA+numB));
                                }
                                else if (operator == "-") {
                                    displayLabel.setText(removeZeroDecimal(numA-numB));
                                }
                                else if (operator == "×") {
                                    displayLabel.setText(removeZeroDecimal(numA*numB));
                                }
                                else if (operator == "÷") {
                                    displayLabel.setText(removeZeroDecimal(numA/numB));
                                }
                                clearAll();
                            }
                        }
                        else if ("+-×÷".contains(buttonValue)) {
                            if (operator == null) {
                                A = displayLabel.getText();
                                displayLabel.setText("0");
                                B = "0";
                            }
                            operator = buttonValue;
                        }
                    }

                    // Here the loop assigns function to buttons contained in the lightGraySymbols array
                    else if (Arrays.asList(lightGraySymbols).contains(buttonValue)) {
                        if (buttonValue == "AC") {
                            clearAll();
                            displayLabel.setText("0");
                        }
                        else if (buttonValue == "%") {
                            double numDisplay = Double.parseDouble(displayLabel.getText());
                            displayLabel.setText(removeZeroDecimal(numDisplay/100));
                        }
                        else if (buttonValue == "Del") {
                            String string = displayLabel.getText();
                            displayLabel.setText("");
                            if (string.length()>1) {
                                for (int i = 0; i < string.length() - 1; i++) {
                                    displayLabel.setText(displayLabel.getText() + string.charAt(i));
                                }
                            }
                            else {displayLabel.setText("0");}
                        }
                    }

                    // Here the loop assigns function to buttons not contained in any array (basically every other button)
                    else {
                        if (buttonValue == ".") {
                            if (!displayLabel.getText().contains(buttonValue)) {
                                displayLabel.setText(displayLabel.getText() + buttonValue);
                            }
                        }
                        else if (buttonValue == "x²") {
                            double numDisplay = Double.parseDouble(displayLabel.getText());
                            displayLabel.setText(removeZeroDecimal(Math.pow(numDisplay,2)));
                        }
                        else if (buttonValue == "√") {
                            double numDisplay = Double.parseDouble(displayLabel.getText());
                            displayLabel.setText(removeZeroDecimal(Math.pow(numDisplay,0.5)));
                        }
                        else if (buttonValue == "π") {
                            displayLabel.setText("3.14159265");
                        }
                        else if (buttonValue == "+/-") {
                            double numDisplay = Double.parseDouble(displayLabel.getText());
                            displayLabel.setText(removeZeroDecimal(numDisplay*-1));
                        }
                        else if (buttonValue == "00") {
                            if (displayLabel.getText() != "0") {
                                displayLabel.setText(displayLabel.getText() + "00");
                            }
                        }
                        else if ("0123456789".contains(buttonValue)) {
                            if (displayLabel.getText() == "0") {
                                displayLabel.setText(buttonValue);
                            }

                            else {
                                displayLabel.setText(displayLabel.getText() + buttonValue);
                            }
                        }
                    }
                }
            });
        }
        frame.setVisible(true);
    }

    // Resetting values assigned to variables after a finished operation (after hitting the "=" button)
    void clearAll() {
        A = "0";
        operator = null;
        B = null;
    }

    // Method to remove unnecessary decimals if .0
    String removeZeroDecimal(double numDisplay) {
        if (numDisplay % 1 == 0) {
            return Integer.toString((int) numDisplay);
        }
        return Double.toString(numDisplay);
    }
}

