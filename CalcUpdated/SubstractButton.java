import javax.swing.*;
import java.awt.*;

public class SubstractButton extends Button{

    SubstractButton(String symbol, Color backgroundColor, Color foregroundColor) {
        super(symbol, backgroundColor, foregroundColor);
    }

    @Override
    protected void executeLogic(JLabel displayLabel, Variables variable) {
        if (variable.operator == null) {
            variable.A = displayLabel.getText();
            displayLabel.setText("0");
            variable.B = "0";
        }
        variable.operator = "-";
    }
}
