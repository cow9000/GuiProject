package gui.view;

import javax.swing.JFrame;

import gui.controller.GuiController;


public class GUIFrame extends JFrame
{
	private GuiController appController;
	
	public GUIFrame(GuiController appController) {
		super();
		this.appController = appController;
	
		setupFrame();
	
	}
	
	private void setupFrame() {

		this.setTitle("");
		this.setSize(500, 500);
		
		
		this.setVisible(true);
	}
	
	
}
