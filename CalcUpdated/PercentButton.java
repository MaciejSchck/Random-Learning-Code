import javax.swing.*;
import java.awt.*;

public class PercentButton extends Button{

    PercentButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel, Variables variable) {
        double numDisplay = Double.parseDouble(displayLabel.getText());
            displayLabel.setText(removeZeroDecimal(numDisplay / 100));
    }
}
