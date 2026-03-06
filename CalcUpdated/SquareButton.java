import javax.swing.*;
import java.awt.*;

public class SquareButton extends Button {

    SquareButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel, Variables variable) {
        double numDisplay = Double.parseDouble(displayLabel.getText());
        displayLabel.setText(removeZeroDecimal(Math.pow(numDisplay, 2)));
    }
}
