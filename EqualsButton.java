import javax.swing.*;
import java.awt.*;

public class EqualsButton extends Button{

    EqualsButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel) {
        if (A != null) {
            B = displayLabel.getText();
            double numA = Double.parseDouble(A);
            double numB = Double.parseDouble(B);

            switch (operator) {
               case "+":
                displayLabel.setText(removeZeroDecimal(numA + numB));
                break;

               case "-":
                displayLabel.setText(removeZeroDecimal(numA - numB));
                break;

               case "×":
                displayLabel.setText(removeZeroDecimal(numA * numB));
                break;

               case "÷":
                displayLabel.setText(removeZeroDecimal(numA / numB));
                break;
            }
            clearAll();
        }
    }
}
