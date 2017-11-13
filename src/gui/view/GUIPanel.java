package gui.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import gui.controller.GuiController;

public class GUIPanel extends JPanel
{
	private GuiController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	
	public GUIPanel(GuiController appController) {
		super();
		this.appController = appController;
		this.firstButton = new JButton("Lololol");
		this.appLayout = new SpringLayout();

		
		setupPanel();
		setupLayout();
		
	}
	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set color :D
	 */
	private void setupPanel() {
		this.setBackground(new Color(10,20,200));
		this.setLayout(appLayout);
		this.add(firstButton);
	
	}
	
	/**
	 * Used to hold the constraint positioning for springLayout.
	 * AKA a giant dumping ground for all the xxx.putConstraint() lines
	 */
	
	private void setupLayout() {
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 33, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 171, SpringLayout.WEST, this);
		
		
	}
	
	private void setupListeners() {
		
	}
	
	
}
