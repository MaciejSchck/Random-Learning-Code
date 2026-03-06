import javax.swing.*;
import java.awt.*;

public class DigitButton extends Button {


    DigitButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel, Variables variable) {
        if (displayLabel.getText() == "0") {
            displayLabel.setText(symbol);
        } else {
            displayLabel.setText(displayLabel.getText() + symbol);
        }
    }
}
