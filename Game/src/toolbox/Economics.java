package toolbox;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class Economics implements ActionListener
{
	public int funds;
	public int maint;
	static JFrame frame;
	
	public static void showEconTab()
	{
		Font f = new Font("sans-serif", Font.PLAIN, 18);
		
		frame = new JFrame("Economics");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel back = new JPanel();
		Border raisedB = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		Border lowerB = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		Border yellowLine = BorderFactory.createLineBorder(Color.YELLOW);
		Border econTab = BorderFactory.createCompoundBorder(raisedB, lowerB);
		econTab = BorderFactory.createCompoundBorder(yellowLine, econTab);
		back.setBorder(econTab);
		back.setBackground(new Color(192, 174, 14));
		
		
		
		frame.add(back);
		frame.setSize(500, 150);
		frame.setBounds(1120, 820, 500, 150);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

}
