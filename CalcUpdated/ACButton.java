import javax.swing.*;
import java.awt.*;

public class ACButton extends Button {

    ACButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel) {
        clearAll();
        displayLabel.setText("0");
    }
}
