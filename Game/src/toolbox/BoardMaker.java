package toolbox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;


public class BoardMaker 
{
	private int rows;
	private int cols;
	
	private class cell
	{
		protected int r;
		protected int c;
		cell(int r, int c)
		{
			this.r = r;
			this.c =c;
		}
		protected void setCell(int r, int c)
		{
			this.r = r;
			this.c = c;
		}
		protected int getCellR()
		{
			return r;
		}
		protected int getCellC()
		{
			return c;
		}
	}
	private cell unitStart;
	
	public BoardMaker(int rows, int cols)
	{
		this.rows = rows;
		this.cols = cols;
		unitStart = new cell(rows, cols);
		
		JFrame frame = new JFrame("Coghammer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font f = new Font("sans-serif", Font.PLAIN, 18);
		UIManager.put("Menu.font",f);
		UIManager.put("MenuItem.font",f);
		
		JTable grid = new JTable(rows, cols);
		grid.setRowHeight(50);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu, subMenu1;
		JMenuItem menuItem;
		
		//File Menu Structure
		/*
		 * Add/Delete Units
		 * Save/Load Game Data
		 */
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		menu.addSeparator();
		subMenu1 = new JMenu("Add Units - Debug");
		subMenu1.setMnemonic(KeyEvent.VK_A);
		menuItem = new JMenuItem("Warrior");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Mage");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Priest");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Archer");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Horsemen");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Chariot Archer");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Battle Mage");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menu.add(subMenu1);
		
		subMenu1 = new JMenu("Delete Unit");
		subMenu1.setMnemonic(KeyEvent.VK_D);
		menu.add(subMenu1);
		
		subMenu1 = new JMenu("Save Game");
		subMenu1.setMnemonic(KeyEvent.VK_S);
		menu.add(subMenu1);
		
		menuItem = new JMenuItem("File 1");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		menuItem = new JMenuItem("File 2");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		menuItem = new JMenuItem("File 3");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		menuItem = new JMenuItem("File 4");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		subMenu1 = new JMenu("Load Game");
		subMenu1.setMnemonic(KeyEvent.VK_L);
		menu.add(subMenu1);
		
		menuItem = new JMenuItem("File 1");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		menuItem = new JMenuItem("File 2");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		menuItem = new JMenuItem("File 3");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		menuItem = new JMenuItem("File 4");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		//Shop Menu Structure
		/*
		 * Total Gold: %d
		 * Unit Maintenance: %d
		 * Buy->
		 */
		menu = new JMenu("Shop");
		menu.setMnemonic(KeyEvent.VK_S);
		menuBar.add(menu);
		menu.addSeparator();
		
		subMenu1 = new JMenu("Total Gold: 150");
		subMenu1.setMnemonic(KeyEvent.VK_G);
		menu.add(subMenu1);
		
		subMenu1 = new JMenu("Unit Maintenance: 17");
		subMenu1.setMnemonic(KeyEvent.VK_M);
		menu.add(subMenu1);
		
		subMenu1 = new JMenu("Buy Units");
		subMenu1.setMnemonic(KeyEvent.VK_B);
		menu.add(subMenu1);
		
		menuItem = new JMenuItem("Warrior: 2 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Mage: 2 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Priest: 2 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Archer: 2 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Horsemen: 3 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Chariot Archer: 4 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Battle Mage: 4 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
		subMenu1.add(menuItem);
		
		menu.add(subMenu1);
		
		//Garrison Menu Structure
		/*
		 * Active Troops
		 * ->List
		 * Supply Troops
		 * ->Deploy
		 * ->Delete
		 */
		menu = new JMenu("Garrison");
		menu.setMnemonic(KeyEvent.VK_G);
		menuBar.add(menu);
		menu.addSeparator();
		
		subMenu1 = new JMenu("Active Troops");
		subMenu1.setMnemonic(KeyEvent.VK_A);
		menu.add(subMenu1);
		
		subMenu1 = new JMenu("Supply Troops");
		subMenu1.setMnemonic(KeyEvent.VK_S);
		menu.add(subMenu1);
		
		
		
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		frame.getContentPane().add(grid, BorderLayout.CENTER);
		
		frame.setSize(700, 670);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
