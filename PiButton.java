import javax.swing.*;
import java.awt.*;

public class PiButton extends Button{

    PiButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel) {
        displayLabel.setText("3.14159265");
    }
}
