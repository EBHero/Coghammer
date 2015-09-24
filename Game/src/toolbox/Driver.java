package toolbox;

public class Driver 
{
	public static void main(String args[])
	{
		Units.createUnits();
		
		Units.HORSEMEN.getUnitInfo();
		
		BoardMaker startBoard = new BoardMaker(12,12);
		
	}
}
