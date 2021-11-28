package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	public static boolean chooseText = true;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputText frame_1 = new InputText();
					InputFile frame_2 = new InputFile();
					
					if (chooseText) {
						frame_2.setVisible(false);
						frame_1.setVisible(true);
					} else {
						frame_1.setVisible(false);
						frame_2.setVisible(true);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
