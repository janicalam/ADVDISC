/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Bianca
 */
public class View extends JFrame {

	private Container pane = this.getContentPane();

	private JPanel mainPanel = new JPanel(new GridLayout(0, 2));
	private JPanel bigLeftPanel = new JPanel(new GridLayout(3, 0));
	private JPanel bigRightPanel = new JPanel();

	private TabbedPanel1 leftpanel1 = new TabbedPanel1();
	private JPanel leftpanel2 = new JPanel();
	private TabbedPanel2 leftpanel3 = new TabbedPanel2();

	private int selectedPanel1;
	private ActionListener changePanel2;

	/*
	 * public static void main (String[] args){ new View(); }//main
	 */
	
	public View() {
		initialize();
	}// constructor MPView

	public void initialize() {

		bigLeftPanel.add(leftpanel1.initializeTabbedPanel(this));

		leftpanel2
				.setBorder(BorderFactory.createTitledBorder("Before & After"));
		bigLeftPanel.add(leftpanel2);
		selectedPanel1 = leftpanel1.getSelectedPanel();
		bigLeftPanel.add(leftpanel3.initializeTabbedPanel(selectedPanel1));

		bigRightPanel.setBorder(BorderFactory.createTitledBorder("GRAPH"));

		mainPanel.add(bigLeftPanel);
		mainPanel.add(bigRightPanel);
		pane.add(mainPanel);

		this.setTitle("ADVDISC MP1");
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}// initialize
	
	public void refreshTab2(){
		selectedPanel1 = leftpanel1.getSelectedPanel();
		bigLeftPanel.add(leftpanel3.initializeTabbedPanel(selectedPanel1));
	}

}
