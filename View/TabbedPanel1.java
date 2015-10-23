/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionListener;
import java.util.Enumeration;


/**
 *
 * @author Bianca
 */
public class TabbedPanel1 extends JPanel{
    
    private JTabbedPane tabbedPanel = new JTabbedPane();
    
    private JPanel pointPanel = new JPanel();
    private JPanel linePanel = new JPanel();
    private JPanel vectorPanel = new JPanel();
    private JPanel parabolaPanel = new JPanel();
    private JPanel hyperbolaPanel = new JPanel();
    private JPanel ellipsePanel = new JPanel();
    private JPanel polygonPanel = new JPanel();
    
    private JTextField x_point = new JTextField(5);
    private JTextField y_point = new JTextField(5);
    private JTextField x_line = new JTextField(5);
    private JTextField y_line = new JTextField(5);
    private JTextField x_vector = new JTextField(5);
    private JTextField y_vector = new JTextField(5);
    private JTextField x_parabola = new JTextField(5);
    private JTextField y_parabola = new JTextField(5);
    private JTextField magnitude_parabola = new JTextField(5);
    private JRadioButton horient_parabola = new JRadioButton("Horizontal");
    private JRadioButton vorient_parabola = new JRadioButton("Vertical");
    private JTextField x_hyperbola = new JTextField(5);
    private JTextField y_hyperbola = new JTextField(5);
    private JTextField hdist_hyperbola = new JTextField(5);
    private JTextField vdist_hyperbola = new JTextField(5);
    private JRadioButton horient_hyperbola = new JRadioButton("Horizontal");
    private JRadioButton vorient_hyperbola = new JRadioButton("Vertical");
    private JTextField x_ellipse = new JTextField(5);
    private JTextField y_ellipse = new JTextField(5);
    private JTextField hdist_ellipse = new JTextField(5);
    private JTextField vdist_ellipse = new JTextField(5);
    private JTextField x_polygon = new JTextField(5);
    private JTextField y_polygon = new JTextField(5);
    
    private JLabel xLbl_point = new JLabel("X-Coordinate:");
    private JLabel yLbl_point = new JLabel("Y-Coordinate:");
    private JLabel xLbl_line = new JLabel("X-Coordinate:");
    private JLabel yLbl_line = new JLabel("Y-Coordinate:");
    private JLabel xLbl_vector = new JLabel("X-Coordinate:");
    private JLabel yLbl_vector = new JLabel("Y-Coordinate:");
    private JLabel xLbl_parabola = new JLabel("Vertex X-Coordinate:");
    private JLabel yLbl_parabola = new JLabel("Vertex Y-Coordinate:");
    private JLabel magnitudeLbl_parabola = new JLabel("Magnitude:");
    private JLabel orientLbl_parabola = new JLabel("Orientation:");
    private JLabel xLbl_hyperbola = new JLabel("Center X-Coordinate:");
    private JLabel yLbl_hyperbola = new JLabel("Center Y-Coordinate:");
    private JLabel hdistLbl_hyperbola = new JLabel("Horizontal Distance:");
    private JLabel vdistLbl_hyperbola = new JLabel("Vertical Distance:");
    private JLabel orientLbl_hyperbola = new JLabel("Orientation:");
    private JLabel xLbl_ellipse = new JLabel("Center X-Coordinate:");
    private JLabel yLbl_ellipse = new JLabel("Center Y-Coordinate:");
    private JLabel hdistLbl_ellipse = new JLabel("Horizontal Distance:");
    private JLabel vdistLbl_ellipse = new JLabel("Vertical Distance:");
    private JLabel xLbl_polygon = new JLabel("X-Coordinate:");
    private JLabel yLbl_polygon = new JLabel("Y-Coordinate:");
    
    private JButton pointBtn = new JButton("Generate Point");
    private JButton lineBtn = new JButton("Generate Line Segment");
    private JButton vectorBtn = new JButton("Generate Vector");
    private JButton parabolaBtn = new JButton("Generate Parabola");
    private JButton hyperbolaBtn = new JButton("Generate Hyperbola");
    private JButton ellipseBtn = new JButton("Generate Ellipse");
    private JButton polygonBtn = new JButton("Generate Polygon");
    
    private ButtonGroup grp_parabola = new ButtonGroup();
    private ButtonGroup grp_hyperbola = new ButtonGroup();
    
    public JTabbedPane initializeTabbedPanel(View v){
        
        //ButtonGroup grp_parabola = new ButtonGroup();
        grp_parabola.add(horient_parabola);
        grp_parabola.add(vorient_parabola);
        
        //ButtonGroup grp_hyperbola = new ButtonGroup();
        grp_hyperbola.add(horient_hyperbola);
        grp_hyperbola.add(vorient_hyperbola);
        
        pointPanel.add(xLbl_point);
        pointPanel.add(x_point);
        pointPanel.add(yLbl_point);
        pointPanel.add(y_point);
        pointPanel.add(pointBtn);
        
        linePanel.add(xLbl_line);
        linePanel.add(x_line);
        linePanel.add(yLbl_line);
        linePanel.add(y_line);
        linePanel.add(lineBtn);
        
        vectorPanel.add(xLbl_vector);
        vectorPanel.add(x_vector);
        vectorPanel.add(yLbl_vector);
        vectorPanel.add(y_vector);
        vectorPanel.add(vectorBtn);

        parabolaPanel.add(xLbl_parabola);
        parabolaPanel.add(x_parabola);
        parabolaPanel.add(yLbl_parabola);
        parabolaPanel.add(y_parabola);
        parabolaPanel.add(magnitudeLbl_parabola);
        parabolaPanel.add(magnitude_parabola);
        parabolaPanel.add(orientLbl_parabola);
        parabolaPanel.add(horient_parabola);
        parabolaPanel.add(vorient_parabola);
        parabolaPanel.add(parabolaBtn);
        
        hyperbolaPanel.add(xLbl_hyperbola);
        hyperbolaPanel.add(x_hyperbola);
        hyperbolaPanel.add(yLbl_hyperbola);
        hyperbolaPanel.add(y_hyperbola);
        hyperbolaPanel.add(hdistLbl_hyperbola);
        hyperbolaPanel.add(hdist_hyperbola);
        hyperbolaPanel.add(vdistLbl_hyperbola);
        hyperbolaPanel.add(vdist_hyperbola);
        hyperbolaPanel.add(orientLbl_hyperbola);
        hyperbolaPanel.add(horient_hyperbola);
        hyperbolaPanel.add(vorient_hyperbola);
        hyperbolaPanel.add(hyperbolaBtn);
        
        ellipsePanel.add(xLbl_ellipse);
        ellipsePanel.add(x_ellipse);
        ellipsePanel.add(yLbl_ellipse);
        ellipsePanel.add(y_ellipse);
        ellipsePanel.add(hdistLbl_ellipse);
        ellipsePanel.add(hdist_ellipse);
        ellipsePanel.add(vdistLbl_ellipse);
        ellipsePanel.add(vdist_ellipse);
        ellipsePanel.add(ellipseBtn);
        
        polygonPanel.add(xLbl_polygon);
        polygonPanel.add(x_polygon);
        polygonPanel.add(yLbl_polygon);
        polygonPanel.add(y_polygon);
        polygonPanel.add(polygonBtn);
        
        tabbedPanel.add("Point", pointPanel);       
        tabbedPanel.add("Parabola", parabolaPanel);
        tabbedPanel.add("Hyperbola", hyperbolaPanel);
        tabbedPanel.add("Ellipse", ellipsePanel);
        tabbedPanel.add("Line Segment", linePanel);
        tabbedPanel.add("Polygon", polygonPanel);
        tabbedPanel.add("Vector", vectorPanel);
         
        tabbedPanel.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	            v.refreshTab2();
	            System.out.println("reflesh");
	        }
	    });
        return tabbedPanel;
    }
    
    public int getSelectedPanel(){
    	return tabbedPanel.getSelectedIndex();
    }
    
    public int getx_point(){
        return Integer.parseInt(x_point.getText());
    }
    
    public int gety_point(){
        return Integer.parseInt(y_point.getText());
    }
    
    public int getx_line(){
        return Integer.parseInt(x_line.getText());
    }
    
    public int gety_line(){
        return Integer.parseInt(y_line.getText());
    }
    
    public int getx_vector(){
        return Integer.parseInt(x_vector.getText());
    }
    
    public int gety_vector(){
        return Integer.parseInt(y_vector.getText());
    }
    
    public int getx_parabola(){
        return Integer.parseInt(x_parabola.getText());
    }
    
    public int gety_parabola(){
        return Integer.parseInt(y_parabola.getText());
    }
    
    public int getmagnitude_parabola(){
        return Integer.parseInt(magnitude_parabola.getText());
    }
    
    public String getorient_parabola(){
        for (Enumeration<AbstractButton> buttons = grp_parabola.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
        
        /*if (horient_parabola.isSelected())
            return horient_parabola.getText();
        else //if (vorient_parabola.isSelected())
            return vorient_parabola.getText();*/
    }
    
    public int getx_hyperbola(){
        return Integer.parseInt(x_hyperbola.getText());
    }
    
    public int gety_hyperbola(){
        return Integer.parseInt(y_hyperbola.getText());
    }
    
    public int gethdist_hyperbola(){
        return Integer.parseInt(hdist_hyperbola.getText());
    }
    
    public int getvdist_hyperbola(){
        return Integer.parseInt(vdist_hyperbola.getText());
    }
    
    public String getorient_hyperbola(){
        for (Enumeration<AbstractButton> buttons = grp_hyperbola.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
        
        /*if (horient_hyperbola.isSelected())
            return horient_hyperbola.getText();
        else //if (vorient_hyperbola.isSelected())
            return vorient_hyperbola.getText();*/
    }
    
    public int getx_ellipse(){
        return Integer.parseInt(x_ellipse.getText());
    }
    
    public int gety_ellipse(){
        return Integer.parseInt(y_ellipse.getText());
    }
    
    public int gethdist_ellipse(){
        return Integer.parseInt(hdist_ellipse.getText());
    }
    
    public int getvdist_ellipse(){
        return Integer.parseInt(vdist_ellipse.getText());
    }
    
    public int getx_polygon(){
        return Integer.parseInt(x_polygon.getText());
    }
    
    public int gety_polygon(){
        return Integer.parseInt(y_polygon.getText());
    }
    
    void listen_pointBtn(ActionListener listener){
        pointBtn.addActionListener(listener);
    }
    
    void listen_lineBtn(ActionListener listener){
        lineBtn.addActionListener(listener);
    }
    
    void listen_vectorBtn(ActionListener listener){
        vectorBtn.addActionListener(listener);
    }
    
    void listen_parabolaBtn(ActionListener listener){
        parabolaBtn.addActionListener(listener);
    }
    
    void listen_hyperbolaBtn(ActionListener listener){
        hyperbolaBtn.addActionListener(listener);
    }
    
    void listen_ellipseBtn(ActionListener listener){
        ellipseBtn.addActionListener(listener);
    }
    
    void listen_polygonBtn(ActionListener listener){
        polygonBtn.addActionListener(listener);
    }
    
}
