/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;

/**
 * Utility functions for the GUI
 * @author up859036, up878976, up877962, up912872
 */
public class Utils {
    /**
     * Toggles the text of the button between yes and no.
     * @param button that is wanted to be toggled
     */
    public void toggleYesNo(javax.swing.JToggleButton button ){
        button.setText(button.getText() == "No" ? "Yes" : "No");
    }
    
    /**
     * Check to see if the text value is a float.
     * @param textbox that is wanted to be checked
     */
    public void checkFloatType(javax.swing.JTextField textbox) {
        try{
            Float.parseFloat(textbox.getText());            
        } catch (NumberFormatException err) {
            System.out.println(err);
            textbox.setText("0.0");
        }
    }
    
    /**
     * Checks to see if the text value is a integer.
     * @param textbox that is wanted to be checked
     */
    public void checkIntType(javax.swing.JTextField textbox) {
        try{
            Integer.parseInt(textbox.getText());            
        } catch (NumberFormatException err) {
            System.out.println(err);
            textbox.setText("0");
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
    
    public boolean rangeLimit(javax.swing.JTextField textbox, float min, float max) {
        if (Float.parseFloat(textbox.getText()) > max || Float.parseFloat(textbox.getText()) < min){
            textbox.setText("0.0");
            return false;
        } 
        return true;
    }
    
    public boolean rangeLimit(javax.swing.JTextField textbox, int min, int max) {
        if (Integer.parseInt(textbox.getText()) > max || Integer.parseInt(textbox.getText()) < min){
            textbox.setText("0");
            return false;
        }
        return true;
    }
    
    public void warningMessage(javax.swing.JDialog dialogbox, javax.swing.JLabel lblTitle, javax.swing.JLabel lblContent, String title, String content) {
        lblTitle.setText(title);
        lblContent.setText(content);
        dialogbox.setTitle(title);
        dialogbox.setVisible(true);
        dialogbox.setEnabled(true);
        dialogbox.setSize(new Dimension(300, 150));
    }
    
}
