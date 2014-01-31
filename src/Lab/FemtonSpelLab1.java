/**
 * 
 */
package Lab;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author Robert Larsson & Sebastian Lindgren
 *
 */
public class FemtonSpelLab1 {
	
	Cell blankPek;
	JFrame windowsXP;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FemtonSpelLab1 obj = new FemtonSpelLab1();
		obj.createStuff();
	}
	
	private void createStuff() {
		windowsXP = new JFrame("Femtonspel");
		windowsXP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FemtonListener lisa = new FemtonListener();
		
		
		GridLayout layout = new GridLayout(4, 4, 3, 3);
		int i = 15;
		for (int x = 3; x >= 0; x--)
			for (int y = 3; y >= 0; y--, i--) {
				if (i != 0) {
					windowsXP.add(new Cell(Integer.toString(i), lisa, x, y));
				}
				else {
					blankPek = (Cell) windowsXP.add(new Cell(lisa, x, y));
				}
			}
				
		
		windowsXP.setLayout(layout);
		
		windowsXP.pack();
		
		windowsXP.setVisible(true);
		
	}
	private void gameLogic(Cell butt0) {
		if ((Math.abs(butt0.getRow()-blankPek.getRow()) == 1 
				&& butt0.getColumn()-blankPek.getColumn() == 0) 
			^ (Math.abs(butt0.getColumn()-blankPek.getColumn()) == 1 
				&& butt0.getRow()-blankPek.getRow() == 0)){
			blankPek.setText(butt0.getText());
			butt0.setText("");
			blankPek = butt0;
		} else
			Toolkit.getDefaultToolkit().beep();
		
		
	}
	
	private class FemtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			gameLogic((Cell)e.getSource());
		}
		
	}
	
}
