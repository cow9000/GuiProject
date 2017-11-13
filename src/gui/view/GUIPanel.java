package gui.view;

import javax.swing.JPanel;

import gui.controller.GuiController;

public class GUIPanel extends JPanel
{
	private GuiController appController;
	
	public GUIPanel(GuiController appController) {
		super();
		this.appController = appController;
	}
	
}
