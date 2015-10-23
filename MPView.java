/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advdisc.mp1;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Bianca
 */
public class MPView extends JFrame{
    
    private Container pane = this.getContentPane();
    
    private JPanel mainPanel = new JPanel(new GridLayout(0,2));
    private JPanel bigLeftPanel = new JPanel(new GridLayout(3,0));
    private JPanel bigRightPanel = new JPanel();
    
    private TabbedPanel1 leftpanel1 = new TabbedPanel1();
    private JPanel leftpanel2 = new JPanel();
    private TabbedPanel2 leftpanel3 = new TabbedPanel2();
    
    
    public static void main (String[] args){
        new MPView();
    }//main
    
    public MPView() {
        initialize();
    }//constructor MPView
    
    public void initialize(){
        
        bigLeftPanel.add(leftpanel1.initializeTabbedPanel());
        
        leftpanel2.setBorder(BorderFactory.createTitledBorder("Before & After"));
        bigLeftPanel.add(leftpanel2);
        
        bigLeftPanel.add(leftpanel3.initializeTabbedPanel());
        
        bigRightPanel.setBorder(BorderFactory.createTitledBorder("GRAPH"));
        
        mainPanel.add(bigLeftPanel);
        mainPanel.add(bigRightPanel);
        pane.add(mainPanel);
               
        this.setTitle("ADVDISC MP1");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }//initialize
    
    
}
