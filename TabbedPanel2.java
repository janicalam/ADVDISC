/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advdisc.mp1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Enumeration;

/**
 *
 * @author Bianca
 */
public class TabbedPanel2 extends JPanel{
    
    private JTabbedPane tabbedPanel = new JTabbedPane();
    
    private JPanel translatePanel = new JPanel();
    private JPanel reflectPanel = new JPanel();
    private JPanel scalePanel = new JPanel();
    private JPanel srotatePanel = new JPanel();
    private JPanel drotatePanel = new JPanel();
    private JPanel shearPanel = new JPanel();
    
    private JTextField x_translate = new JTextField(5);
    private JTextField y_translate = new JTextField(5);
    private JRadioButton x_reflect = new JRadioButton("X-axis");
    private JRadioButton y_reflect = new JRadioButton("Y-axis");
    private JTextField scalar_scale = new JTextField(5);
    private JRadioButton angle90c_srotate = new JRadioButton("90 clockwise");
    private JRadioButton angle90cc_srotate = new JRadioButton("90 counterclockwise");
    private JRadioButton angle180_srotate = new JRadioButton("180");
    private JTextField angle_drotate = new JTextField(5);
    private JTextField angle_shear = new JTextField(5);
    
    private JLabel xLbl_translate = new JLabel("X Translation:");
    private JLabel yLbl_translate = new JLabel("Y Translation:");
    private JLabel scalarLbl_scale = new JLabel("Scalar:");
    private JLabel angleLbl_drotate = new JLabel("Angle - Counterclockwise:");
    private JLabel angleLbl_shear = new JLabel("Angle - Clockwise:");
    
    private JButton translateBtn = new JButton("Translate Graph");
    private JButton reflectBtn = new JButton("Reflect Graph");
    private JButton scaleBtn = new JButton("Scale Graph");
    private JButton srotateBtn = new JButton("Static Rotate Graph");
    private JButton drotateBtn = new JButton("Dynamic Rotate Graph");
    private JButton shearBtn = new JButton("Shear Graph");
    
    ButtonGroup grp_reflect = new ButtonGroup();
    ButtonGroup grp_srotate = new ButtonGroup();
    
    public JTabbedPane initializeTabbedPanel() {
        
        //ButtonGroup grp_reflect = new ButtonGroup();
        grp_reflect.add(x_reflect);
        grp_reflect.add(y_reflect);
        
        //ButtonGroup grp_srotate = new ButtonGroup();
        grp_srotate.add(angle90c_srotate);
        grp_srotate.add(angle90cc_srotate);
        grp_srotate.add(angle180_srotate);
        
        translatePanel.add(xLbl_translate);
        translatePanel.add(x_translate);
        translatePanel.add(yLbl_translate);
        translatePanel.add(y_translate);
        translatePanel.add(translateBtn);
        
        reflectPanel.add(x_reflect);
        reflectPanel.add(y_reflect);
        reflectPanel.add(reflectBtn);
        
        scalePanel.add(scalarLbl_scale);
        scalePanel.add(scalar_scale);
        scalePanel.add(scaleBtn);
        
        srotatePanel.add(angle90c_srotate);
        srotatePanel.add(angle90cc_srotate);
        srotatePanel.add(angle180_srotate);
        srotatePanel.add(srotateBtn);
        
        drotatePanel.add(angleLbl_drotate);
        drotatePanel.add(angle_drotate);
        drotatePanel.add(drotateBtn);
        
        shearPanel.add(angleLbl_shear);
        shearPanel.add(angle_shear);
        shearPanel.add(shearBtn);
        
        tabbedPanel.add("Translate", translatePanel);
        tabbedPanel.add("Reflect", reflectPanel);
        tabbedPanel.add("Scale", scalePanel);
        tabbedPanel.add("Static Rotate", srotatePanel);
        tabbedPanel.add("Dynamic Rotate", drotatePanel);
        tabbedPanel.add("Shear", shearPanel);
        
        return tabbedPanel;
    }
    
    public int getx_translate(){
        return Integer.parseInt(x_translate.getText());
    }
    
    public int gety_translate(){
        return Integer.parseInt(y_translate.getText());
    }
    
    public String getaxis_reflect(){
        for (Enumeration<AbstractButton> buttons = grp_reflect.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
        
        /*if (x_reflect.isSelected())
            return x_reflect.getText();
        else //if (y_reflect.isSelected())
            return y_reflect.getText();*/
    }
    
    public int getscalar_scale(){
        return Integer.parseInt(scalar_scale.getText());
    }
    
    public String getrotate_srotate(){
        for (Enumeration<AbstractButton> buttons = grp_srotate.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
        
        /*if (angle90c_srotate.isSelected())
            return angle90c_srotate.getText();
        else if (angle90cc_srotate.isSelected())
            return angle90cc_srotate.getText();
        else //if (angle180_srotate.isSelected())
            return angle180_srotate.getText();*/
    }
    
    public int getangle_drotate(){
        return Integer.parseInt(angle_drotate.getText());
    }
    
    public int getangle_shear(){
        return Integer.parseInt(angle_shear.getText());
    }
    
    void listen_translateBtn(ActionListener listener){
        translateBtn.addActionListener(listener);
    }
    
    void listen_reflectBtn(ActionListener listener){
        reflectBtn.addActionListener(listener);
    }
    
    void listen_scaleBtn(ActionListener listener){
        scaleBtn.addActionListener(listener);
    }
    
    void listen_srotateBtn(ActionListener listener){
        srotateBtn.addActionListener(listener);
    }
    
    void listen_drotateBtn(ActionListener listener){
        drotateBtn.addActionListener(listener);
    }
    
    void listen_shearBtn(ActionListener listener){
        shearBtn.addActionListener(listener);
    }
    
}
