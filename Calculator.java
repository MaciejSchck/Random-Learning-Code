import java.awt.*;
import javax.swing.*;

public class Calculator {

    Button[] naciski = {
            new ACButton("AC", Utilities.LightGray, Utilities.Black),
            new DelButton("Del", Utilities.LightGray, Utilities.Black),
            new PercentButton("%", Utilities.LightGray, Utilities.Black),
            new PosNegButton("+/-", Utilities.LightGray, Utilities.Black),
            new DigitButton("7", Utilities.DarkGray, Color.white),
            new DigitButton("8", Utilities.DarkGray, Color.white),
            new DigitButton("9", Utilities.DarkGray, Color.white),
            new DivideButton("÷", Utilities.Orange, Color.white),
            new DigitButton("4", Utilities.DarkGray, Color.white),
            new DigitButton("5", Utilities.DarkGray, Color.white),
            new DigitButton("6", Utilities.DarkGray, Color.white),
            new MultiplyButton("×", Utilities.Orange, Color.white),
            new DigitButton("1", Utilities.DarkGray, Color.white),
            new DigitButton("2", Utilities.DarkGray, Color.white),
            new DigitButton("3", Utilities.DarkGray, Color.white),
            new SubstractButton("-", Utilities.Orange, Color.white),
            new PointButton(".", Utilities.DarkGray, Color.white),
            new DigitButton("0", Utilities.DarkGray, Color.white),
            new DoubleZeroButton("00", Utilities.DarkGray, Color.white),
            new SumButton("+", Utilities.Orange, Color.white),
            new SquareButton("x²", Utilities.DarkGray, Color.white),
            new RootButton("√", Utilities.DarkGray, Color.white),
            new PiButton("π", Utilities.DarkGray, Color.white),
            new EqualsButton("=", Utilities.Orange, Color.white)
    };

    JFrame frame = new JFrame("Calculator");
    JLabel displayLabel = new JLabel();
    JPanel displayPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

//    String A = "0";
//    String operator = null;
//    String B = null;

    Calculator() {

        setupWindow();

        for (Button button : naciski) {
            button.initialize(buttonsPanel);
            button.addLogic(displayLabel);
        }
        frame.setVisible(true);
    }

    void setupWindow() {
        frame.setSize(Utilities.boardWidth, Utilities.boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayLabel.setBackground(Utilities.Black);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 60));
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("0");
        displayLabel.setOpaque(true);

        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayLabel);
        frame.add(displayPanel, BorderLayout.NORTH);

        buttonsPanel.setLayout(new GridLayout(6, 4));
        buttonsPanel.setBackground(Utilities.Black);
        frame.add(buttonsPanel);
    }


//
//void tryDoOrangeThings(String buttonValue){
//    if (buttonValue == "=") {
//        if (A != null) {
//        B = displayLabel.getText();
//        double numA = Double.parseDouble(A);
//        double numB = Double.parseDouble(B);
//
//        switch (operator) {
//            case "+":
//                displayLabel.setText(removeZeroDecimal(numA + numB));
//                break;
//            case "-":
//                displayLabel.setText(removeZeroDecimal(numA - numB));
//                break;
//
//            case "×":
//                displayLabel.setText(removeZeroDecimal(numA * numB));
//                break;
//
//            case "÷":
//                displayLabel.setText(removeZeroDecimal(numA / numB));
//                break;
//        }
//clearAll();
//}
//    } else if ("+-×÷".contains(buttonValue)) {
//        if (operator == null) {
//            A = displayLabel.getText();
//            displayLabel.setText("0");
//            B = "0";
//        }
//    operator = buttonValue;
//    }
//}
//void tryDoLightGrayThings(String buttonValue) {
//    switch (buttonValue) {
//        case "AC":
//            clearAll();
//            displayLabel.setText("0");
//            break;
//        case "%":
//            double numDisplay = Double.parseDouble(displayLabel.getText());
//            displayLabel.setText(removeZeroDecimal(numDisplay / 100));
//            break;
//        case "+/-":
//            double numDisplay3 = Double.parseDouble(displayLabel.getText());
//            displayLabel.setText(removeZeroDecimal(numDisplay3 * -1));
//            break;
//        case "Del":
//            String string = displayLabel.getText();
//            displayLabel.setText("");
//            if (string.length() > 1) {
//                for (int i = 0; i < string.length() - 1; i++) {
//                    displayLabel.setText(displayLabel.getText() + string.charAt(i));
//                }
//            } else {
//                displayLabel.setText("0");
//            }
//            break;
//    }
//}
//void tryDoOtherThings(String buttonValue){
//    switch (buttonValue) {
//        case ".":
//            if (!displayLabel.getText().contains(buttonValue)) {
//                displayLabel.setText(displayLabel.getText() + buttonValue);
//            }
//            break;
//        case "x²":
//            double numDisplay1 = Double.parseDouble(displayLabel.getText());
//            displayLabel.setText(removeZeroDecimal(Math.pow(numDisplay1, 2)));
//            break;
//        case "√":
//            double numDisplay2 = Double.parseDouble(displayLabel.getText());
//            displayLabel.setText(removeZeroDecimal(Math.pow(numDisplay2, 0.5)));
//            break;
//        case "π":
//            displayLabel.setText("3.14159265");
//            break;
//        case "00":
//            if (displayLabel.getText() != "0") {
//                displayLabel.setText(removeZeroDecimal(Double.parseDouble(displayLabel.getText() + "00")));
//            }
//            break;
//    }
//    if ("0123456789".contains(buttonValue)) {
//        if (displayLabel.getText() == "0") {
//            displayLabel.setText(buttonValue);
//        } else {
//            displayLabel.setText(displayLabel.getText() + buttonValue);
//        }
//    }
//}
//void clearAll() {
//A = "0";
//operator = null;
//B = null;
//}
//
//String removeZeroDecimal(double numDisplay) {
//    if (numDisplay % 1 == 0) {
//        return Integer.toString((int) numDisplay);
//    }
//    return Double.toString(numDisplay);
//    }
}

