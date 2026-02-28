import javax.swing.*;
import java.awt.*;

public class PointButton extends Button{

    PointButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel) {
        while (!displayLabel.getText().contains(symbol)) {
                displayLabel.setText(displayLabel.getText() + symbol);
        }
    }
}
