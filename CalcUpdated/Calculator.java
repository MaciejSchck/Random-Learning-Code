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

    Calculator() {

        Variables variable = new Variables();

        setupWindow();

        for (Button button : naciski) {
            button.initialize(buttonsPanel);
            button.addLogic(displayLabel, variable);
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
}

