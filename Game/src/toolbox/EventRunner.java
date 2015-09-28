package toolbox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class EventRunner
{
	/*
	 * Turn Order
	 * * Manage Garrison (First Turn Only)
	 * * Buy up to 2 Supply Units or Move up to 4 deployed Units
	 * * Engage Enemy Units, Deploy up to 2 Supply Units, or Move up to 2 deployed Units
	 * * Buy 1 Supply Unit or Move up to 2 deployed Units
	 * * Pay Unit Maintenance
	 */
	JFrame shop;
	private int phase;
	private int toSupply;
	private static final class ShopButton extends JButton
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private ShopButton(String label)
		{
			super(label);
			setContentAreaFilled(false);
			setFocusPainted(false);
		}
		@Override
		protected void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D)g.create();
			g2.setPaint(new GradientPaint(
					new Point(0,0),
					Color.PINK,
					new Point(0, getHeight()),
					Color.RED));
			g2.fillRect(0, 0, getWidth(), getHeight());
			g2.dispose();
			
			super.paintComponent(g);
							
		}
	}
	public void incToSupply()
	{
		toSupply++;
		//checkSupplyLimit();
	}
	public void decToSupply()
	{
		toSupply--;
	}
	public int checkSupplyLimit()
	{
		int retval = 1;
		//During phase 1 only 2 supply units can be bought.
		if(phase == 1)
		{
			if(toSupply == 2)
			{
				retval = -1;
				JOptionPane.showMessageDialog(shop, "You can only buy 2 Supply Units during Phase 1");
			}
		}
		
		return retval;
	}
	
	private void buildShopScreen(JFrame frame, ActionListener act)
	{
		toSupply = 0;
		Font f = new Font("sans-serif", Font.PLAIN, 18);
		shop = new JFrame("Supply Shop");
		shop.setFont(f);
		UIManager.put("Menu.font", f);
		
		JMenuBar menuBar = new JMenuBar();
		JMenuItem menu;
		
		menu = new JMenuItem("DONE");
		menu.addActionListener(act);
		menuBar.add(menu);
		
		menu = new JMenuItem("UNDO");
		menu.addActionListener(act);
		menuBar.add(menu);
		
		shop.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel back = new JPanel(new GridLayout());
		JPanel botm = new JPanel(new GridLayout(7,1));
		
		Border raisedE = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		Border lowerE = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		Border redLine = BorderFactory.createLineBorder(Color.RED);
		
	
		Border shopTabs = BorderFactory.createCompoundBorder(raisedE, lowerE);
		shopTabs = BorderFactory.createCompoundBorder(redLine, shopTabs);
		
		botm.setBorder(shopTabs);
		botm.setBackground(new Color(255, 72, 72));
		
		for(int i = 0; i < 7; i++)
		{
			//populate the shop
			ShopButton buyUnit = new ShopButton("" + Units.getUnitName(i) + ": " + Units.getUnitCost(i) + " Gold");
			buyUnit.addActionListener(act);
			botm.add(buyUnit);
		}
		
		back.add(botm);
		shop.add(back);
		
		shop.getContentPane().add(menuBar, BorderLayout.NORTH);
		shop.setSize(500, 500);
		shop.setBounds(1120, 300, 500, 500);
		shop.setResizable(false);
		shop.setVisible(true);
		
	}
	
	
	//Player Turn Event Runner
	
	public void RunPlayerTurnPhase1(JFrame frame, ActionListener act)
	{
		phase = 1;
		JOptionPane.showMessageDialog(frame, "Player Turn!");
		Object[] options = {"Buy Supply Units", "Move Deployed Units"};
		int n = JOptionPane.showOptionDialog(frame, "What will you do?", "Phase 1", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
		
		//Buying Supply Units
		if(n == 0)
		{
			System.out.printf("Buying Supply Units\n");
			buildShopScreen(frame, act);
		}
		//Moving Units
		if(n == 1)
		{
			System.out.printf("Moving Deployed Units\n");
		}
		
	}
	public void closeShop()
	{
		shop.dispose();
	}
	public void RunPlayerTurnPhase2(JFrame frame, ActionListener act)
	{
		phase = 2;
		closeShop();
		Object[] options = {"Engage Enemy", "Swap from Supply", "Move Units"};
		int n = JOptionPane.showOptionDialog(frame, "What will you do?", "Phase 2", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
		
		//Engage Enemy
		if(n == 0)
		{
			
		}
		
		//Swap from Supply
		if(n == 1)
		{
			Garrison.showGarrison();
		}
		
		//Move Units
		if(n == 2)
		{
			
		}
	}
	//AI Turn Event Runner
	
	
}
