package toolbox;


import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class Garrison
{
	//Vanguard Units
	
	//Supply Units

	public ArrayList<Units> yourVan;
	public Garrison()
	{
		yourVan = new ArrayList<Units>();
	}
	
	public int addUnit(Units newUnit)
	{
		int i = -1;
		if(yourVan.size() < 7)
		{
			yourVan.add(newUnit);
			i = 0;
		}
		
		return i;
	}
	public void showGarrison()
	{
		JFrame frame = new JFrame("Garrison");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel back = new JPanel(new GridLayout());
		JPanel left = new JPanel();
		JPanel right = new JPanel();
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
		left.setBackground(new Color(0, 100, 255));
		right.setBorder(supBorder);
		right.setBackground(new Color(0, 255, 100));
		
		
		back.add(left);
		left.setBounds(0, 0, 240, 400);
		back.add(right);
		right.setBounds(0, 260, 250, 400);
		frame.add(back);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
