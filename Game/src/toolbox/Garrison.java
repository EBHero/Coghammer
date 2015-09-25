package toolbox;


import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class Garrison
{
	//Vanguard Units
	
	//Supply Units

	public static ArrayList<Units> yourVan = new ArrayList<Units>();
	public static ArrayList<Units> yourSup = new ArrayList<Units>();
	public static void copyGar(ArrayList<Units> toCopy)
	{
		yourVan.clear();
		yourVan.addAll(toCopy);
	}
	public static void listGar()
	{
		for(int i = 0; i < yourVan.size(); i++)
		{
			System.out.printf("%d: %s\n",i+1, yourVan.get(i).getUnitName());
			
		}
	}
	
	public static int addUnit(Units newUnit)
	{
		int i = -1;
		if(yourVan.size() < 7)
		{
			yourVan.add(newUnit);
			i = 0;
		}
		
		return i;
	}
	public static int sendSupply(Units newUnit)
	{
		int i = -1;
		if(yourSup.size() < 5)
		{
			yourSup.add(newUnit);
			i = 0;
		}
		return i;
	}
	public static void showGarrison()
	{
		JFrame frame = new JFrame("Garrison");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel back = new JPanel(new GridLayout(2,1));
		JPanel left = new JPanel(new GridLayout(7,1));
		JPanel right = new JPanel(new GridLayout(5,1));
		JPanel garLine, supLine;
		Border raisedB = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		Border lowerB = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		Border raisedE = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		Border lowerE = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		Border blueLine = BorderFactory.createLineBorder(Color.BLUE);
				
		Border greenLine = BorderFactory.createLineBorder(Color.GREEN);
		
		Border vanBorder = BorderFactory.createCompoundBorder(raisedB, lowerB);
		vanBorder = BorderFactory.createCompoundBorder(blueLine, vanBorder);
		Border supBorder = BorderFactory.createCompoundBorder(raisedE, lowerE);
		supBorder = BorderFactory.createCompoundBorder(greenLine, supBorder);
		
		
		left.setBorder(vanBorder);
		left.setBackground(new Color(0, 100, 200));
		right.setBorder(supBorder);
		right.setBackground(new Color(0, 200, 100));
		//Garrison Unit Display
		for(int i = 0; i < yourVan.size(); i++)
		{
			//Populate the Vanguard
			garLine = new JPanel();
			garLine.setLayout(new GridLayout(1,3));
			JTextField vanField =new JTextField(yourVan.get(i).getUnitName());
			vanField.setEnabled(false);
			
			garLine.add(vanField);
			JButton deploy = new JButton("DEPLOY");
			JButton supply = new JButton("SUPPLY");
			garLine.add(deploy);
			garLine.add(supply);
			left.add(garLine);
		}
		//Supply Unit Display
		for(int i = 0; i < yourSup.size(); i++)
		{
			//Populate the Supply
			supLine = new JPanel();
			supLine.setLayout(new GridLayout(1,3));
			JTextField supField =new JTextField(yourSup.get(i).getUnitName());
			supField.setEnabled(false);
			supLine.add(supField);
			JButton swap = new JButton("SWAP");
			JButton delete = new JButton("DELETE");
			supLine.add(swap);
			supLine.add(delete);
			right.add(supLine);
		}
		
		
		
		back.add(left);
		
		back.add(right);
		
		frame.add(back);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
