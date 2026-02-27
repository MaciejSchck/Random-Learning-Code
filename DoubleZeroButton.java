import javax.swing.*;
import java.awt.*;

public class DoubleZeroButton extends Button{

    DoubleZeroButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel) {
        if (displayLabel.getText() != "0") {
                displayLabel.setText(removeZeroDecimal(Double.parseDouble(displayLabel.getText() + "00")));
        }
    }
}
