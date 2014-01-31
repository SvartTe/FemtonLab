/**
 * 
 */
package Lab;

import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Robert Larsson & Sebastian Lindgren
 *
 */
public class Cell extends JButton {

	private int row;
	private int column;
	
	
	public Cell(String nummer, ActionListener heyListen, int x, int y) {
		super.setText(nummer);
		super.addActionListener(heyListen);
		this.row = x;
		this.column = y;
	}
	public Cell(ActionListener stayAWhileAndListen, int x, int y) {
		super();
		super.addActionListener(stayAWhileAndListen);
		this.row = x;
		this.column = y;
	}

	
	/**
	 * 
	 */
	public int getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	public void setColumn(int x) {
		column = x;
	}
	
	public void setRow(int y) {
		row = y;
	}
	
	public void setText(String newText) {
		super.setText(newText);
	}
}
