package GUI;

import java.awt.Dimension;
import javax.swing.*;

/**
 * Utility functions for the GUI
 * @author up859036, up878976, up877962, up912872
 */
public class Utils {
    /**
     * Toggles the text of the button between yes and no.
     * @param button that is wanted to be toggled
     */
    
    /**
     * Check to see if the text value is a float.
     * @param textbox that is wanted to be checked
     * @return boolean
     */
    public boolean checkFloatType(javax.swing.JTextField textbox) {
        try{
            Float.parseFloat(textbox.getText());            
            return true;
        } catch (NumberFormatException err) {
            System.out.println(err);
            textbox.setText("0.0");
            return false;
        }
    }
    
    /**
     * Checks to see if the text value is a integer.
     * @param textbox that is wanted to be checked
     * @return boolean
     */
    public boolean checkIntType(javax.swing.JTextField textbox) {
        try{
            Integer.parseInt(textbox.getText());
            return true;            
        } catch (NumberFormatException err) {
            System.out.println(err);
            textbox.setText("0");
            return false;
        }
    }
    
    /**
     * Remove the placeholder text within the textbox.
     * @param textbox with the placeholder
     * @param defaultValue of the placeholder
     */
    public void removePlaceholderText(javax.swing.JTextField textbox, String defaultValue) {
        if (defaultValue.equals(textbox.getText())) textbox.setText("");
    }
    /**
     * Add the placeholder text within the textbox.
     * @param textbox with the placeholder
     * @param defaultValue of the placeholder
     */
    public void addPlaceholderText(javax.swing.JTextField textbox, String defaultValue){
        if ("".equals(textbox.getText())) textbox.setText(defaultValue);
    }
    /**
     * Checks whether the float value in the in the text box is within the specified range
     * @param textbox to check  
     * @param min - minimum value
     * @param max - maximum value
     * @return boolean
     */
    public boolean rangeLimit(JTextField textbox, float min, float max) {
        if (Float.parseFloat(textbox.getText()) > max || Float.parseFloat(textbox.getText()) < min){
            textbox.setText("0.0");
            return false;
        } 
        return true;
    }
    /**
     * Checks whether the integer value in the text box is within the specified range
     * @param textbox to check  
     * @param min - minimum value
     * @param max - maximum value
     * @return boolean
     */
    public boolean rangeLimit(JTextField textbox, int min, int max) {
        if (Integer.parseInt(textbox.getText()) > max || Integer.parseInt(textbox.getText()) < min){
            textbox.setText("0");
            return false;
        }
        return true;
    }
    /**
     * Produces a dialog box pop-up with warning message
     * @param dialogbox the dialog box to pop up
     * @param lblTitle label to display title
     * @param lblContent label to display content
     * @param title the title of the message
     * @param content the message to display
     */
    public void warningMessage(JDialog dialogbox, JLabel lblTitle, JLabel lblContent, String title, String content) {
        lblTitle.setText(title);
        lblContent.setText(content);
        dialogbox.setTitle(title);
        dialogbox.setVisible(true);
        dialogbox.setEnabled(true);
        dialogbox.setSize(new Dimension(300, 150));
    }
    
}
