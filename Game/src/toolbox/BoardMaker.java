package toolbox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;


public class BoardMaker implements ActionListener
{
	private int rows;
	private int cols;
	
	
	
	public BoardMaker(int rows, int cols)
	{
		this.rows = rows;
		this.cols = cols;
		
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
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		
		
		menuItem = new JMenuItem("Mage");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Priest");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Archer");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Horsemen");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Chariot Archer");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Battle Mage");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
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
		 * Economics
		 * Buy Units->
		 */
		menu = new JMenu("Shop");
		menu.setMnemonic(KeyEvent.VK_S);
		menuBar.add(menu);
		menu.addSeparator();
		
		subMenu1 = new JMenu("Economics");
		subMenu1.setMnemonic(KeyEvent.VK_G);
		menu.add(subMenu1);
		
		subMenu1 = new JMenu("Buy Units");
		subMenu1.setMnemonic(KeyEvent.VK_B);
		menu.add(subMenu1);
		
		menuItem = new JMenuItem("Warrior: 2 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Mage: 2 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Priest: 2 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Archer: 2 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Horsemen: 3 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Chariot Archer: 4 Gold");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		menuItem.addActionListener(this);
		subMenu1.add(menuItem);
		
		menuItem = new JMenuItem("Battle Mage: 4 Gold");
		menuItem.addActionListener(this);
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
		
		menuItem = new JMenuItem("Open");
		menuItem.setMnemonic(KeyEvent.VK_O);
		menuItem.addActionListener(this);
		menu.add(menuItem);
		
		
		//Help Menu Structure
		/*
		 * About Coghammer
		 * Version Info
		 */
		menu = new JMenu("Help");
		menu.setMnemonic(KeyEvent.VK_H);
		menuBar.add(menu);
		
		subMenu1 = new JMenu("About Coghammer");
		subMenu1.setMnemonic(KeyEvent.VK_A);
		//subMenu1.addActionListener(this);
		
		menu.add(subMenu1);
		
		subMenu1 = new JMenu("Version Info");
		subMenu1.setMnemonic(KeyEvent.VK_S);
		menu.add(subMenu1);
		
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		frame.getContentPane().add(grid, BorderLayout.CENTER);
		
		frame.setSize(700, 670);
		frame.setVisible(true);
		frame.setResizable(false);
		

	}

	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Open"))
		{
			System.out.printf("\nOpenning Garrison\n");
			Garrison.listGar();
			Garrison.showGarrison();
			
		}
		if(e.getActionCommand().equals("Warrior: 2 Gold"))
		{
			Units yourUnit = new Units(0);
			yourUnit = yourUnit.createUnit(0);
			if(Garrison.sendSupply(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.WARRIOR.getUnitName());
			else
				System.out.printf("Supply Full\n");
		}
		if(e.getActionCommand().equals("Warrior"))
		{
			Units yourUnit = new Units(0);
			yourUnit = yourUnit.createUnit(0);
			if(Garrison.addUnit(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.WARRIOR.getUnitName());
			else
				System.out.printf("Vanguard Full\n");
		}
		if(e.getActionCommand().equals("Mage: 2 Gold"))
		{
			Units yourUnit = new Units(1);
			yourUnit = yourUnit.createUnit(1);
			if(Garrison.sendSupply(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.MAGE.getUnitName());
			else
				System.out.printf("Supply Full\n");
		}
		if(e.getActionCommand().equals("Mage"))
		{
			Units yourUnit = new Units(1);
			yourUnit = yourUnit.createUnit(1);
			if(Garrison.addUnit(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.MAGE.getUnitName());
			else
				System.out.printf("Vanguard Full\n");
		}
		if(e.getActionCommand().equals("Priest: 2 Gold"))
		{
			Units yourUnit = new Units(2);
			yourUnit = yourUnit.createUnit(2);
			if(Garrison.sendSupply(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.PRIEST.getUnitName());
			else
				System.out.printf("Supply Full\n");
		}
		if(e.getActionCommand().equals("Priest"))
		{
			Units yourUnit = new Units(2);
			yourUnit = yourUnit.createUnit(2);
			if(Garrison.addUnit(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.PRIEST.getUnitName());
			else
				System.out.printf("Vanguard Full\n");
		}
		if(e.getActionCommand().equals("Archer: 2 Gold"))
		{
			Units yourUnit = new Units(3);
			yourUnit = yourUnit.createUnit(3);
			if(Garrison.sendSupply(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.ARCHER.getUnitName());
			else
				System.out.printf("Supply Full\n");
		}
		if(e.getActionCommand().equals("Archer"))
		{
			Units yourUnit = new Units(3);
			yourUnit = yourUnit.createUnit(3);
			if(Garrison.addUnit(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.ARCHER.getUnitName());
			else
				System.out.printf("Vanguard Full\n");
		}
		if(e.getActionCommand().equals("Horsemen: 3 Gold"))
		{
			Units yourUnit = new Units(4);
			yourUnit = yourUnit.createUnit(4);
			if(Garrison.sendSupply(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.HORSEMEN.getUnitName());
			else
				System.out.printf("Supply Full\n");
		}
		if(e.getActionCommand().equals("Horsemen"))
		{
			Units yourUnit = new Units(4);
			yourUnit = yourUnit.createUnit(4);
			if(Garrison.addUnit(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.HORSEMEN.getUnitName());
			else
				System.out.printf("Vanguard Full\n");
		}
		if(e.getActionCommand().equals("Chariot Archer: 4 Gold"))
		{
			Units yourUnit = new Units(5);
			yourUnit = yourUnit.createUnit(5);
			if(Garrison.sendSupply(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.CHARARCH.getUnitName());
			else
				System.out.printf("Supply Full\n");
		}
		if(e.getActionCommand().equals("Chariot Archer"))
		{
			Units yourUnit = new Units(5);
			yourUnit = yourUnit.createUnit(5);
			if(Garrison.addUnit(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.CHARARCH.getUnitName());
			else
				System.out.printf("Vanguard Full\n");
		}
		if(e.getActionCommand().equals("Battle Mage: 4 Gold"))
		{
			Units yourUnit = new Units(6);
			yourUnit = yourUnit.createUnit(6);
			if(Garrison.sendSupply(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.BATTLEMAGE.getUnitName());
			else
				System.out.printf("Supply Full\n");
		}
		if(e.getActionCommand().equals("Battle Mage"))
		{
			Units yourUnit = new Units(6);
			yourUnit = yourUnit.createUnit(6);
			if(Garrison.addUnit(yourUnit) == 0)
				System.out.printf("Added a %s.\n", Units.BATTLEMAGE.getUnitName());
			else
				System.out.printf("Vanguard Full\n");
		}
		if(e.getActionCommand().equals("About Coghammer"))
		{
			
			
		}
		
	}
	
	
}
