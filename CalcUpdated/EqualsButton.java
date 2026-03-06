import javax.swing.*;
import java.awt.*;

public class EqualsButton extends Button{

    EqualsButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel, Variables variable) {
        if (variable.A != null) {
            variable.B = displayLabel.getText();
            double numA = Double.parseDouble(variable.A);
            double numB = Double.parseDouble(variable.B);

            switch (variable.operator) {
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
            clearAll(variable);
        }
    }
}
