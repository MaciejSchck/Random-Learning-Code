import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public abstract class Button {
    String symbol;
    JButton button;
    Color backgroundColor;
    Color foregroundColor;
    static String A = "0";
    static String operator = null;
    static String B = null;

    Button(String symbol, Color backgroundColor, Color foregroundColor) {
        this.symbol = symbol;
        this.button = new JButton();
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
    }

    public void initialize(JPanel buttonsPanel) {
        button.setFont(new Font("Arial", Font.PLAIN, 30));
        button.setText(this.symbol);
        button.setBackground(backgroundColor);
        button.setForeground(foregroundColor);
        button.setFocusable(false);
        button.setBorder(new LineBorder(Utilities.Black));
        buttonsPanel.add(button);
    }

    public void addLogic(JLabel displayLabel) {
        button.addActionListener((e)-> {
            executeLogic(displayLabel);
        });
    }

    String removeZeroDecimal(double numDisplay) {
      if (numDisplay % 1 == 0) {
        return Integer.toString((int) numDisplay);
      }
      return Double.toString(numDisplay);
    }

    protected void clearAll() {
        A = "0";
        operator = null;
        B = null;
    }

    protected abstract void executeLogic(JLabel displayLabel);
}