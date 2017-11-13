package gui.view;

import javax.swing.JFrame;

import gui.controller.GuiController;


public class GUIFrame extends JFrame
{
	private GuiController appController;
	private GUIPanel appPanel;
	
	public GUIFrame(GuiController appController) {
		super();
		this.appController = appController;
		this.appPanel = new GUIPanel(appController);
		
		setupFrame();
	
	}
	
	private void setupFrame() {

		this.setContentPane(appPanel);
		
		this.setTitle("");
		this.setSize(500, 500);
		
		this.setVisible(true);
	}
	
	
}
