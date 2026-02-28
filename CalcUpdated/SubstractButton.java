import javax.swing.*;
import java.awt.*;

public class SubstractButton extends Button{

    SubstractButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel) {
        if (operator == null) {
            A = displayLabel.getText();
            displayLabel.setText("0");
            B = "0";
        }
        operator = "-";
    }
}
