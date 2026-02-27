import javax.swing.*;
import java.awt.*;

public class DelButton extends Button {

    DelButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel) {
        String string = displayLabel.getText();
            displayLabel.setText("");
            if (string.length() > 1) {
               for (int i = 0; i < string.length() - 1; i++) {
                    displayLabel.setText(displayLabel.getText() + string.charAt(i));
                }
            } else {
                displayLabel.setText("0");
            }
    }
}
