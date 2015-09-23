package toolbox;

public class Driver 
{
	public static void main(String args[])
	{
		Units warrior = new Units("Warrior");
		warrior.setType1(Unittypes.meleeUnit);
		warrior.configUnit(20, 6, 4);
		
		Units mage = new Units("Mage");
		mage.setType1(Unittypes.hybridUnit);
		mage.configUnit(14, 4, 4);
		
		Units priest = new Units("Priest");
		priest.setType1(Unittypes.hybridUnit);
		priest.configUnit(18, 3, 4);
		
		Units archer = new Units("Archer");
		archer.setType1(Unittypes.rangedUnit);
		archer.configUnit(16, 5, 4);
		
		Units horsemen = new Units("Horsemen");
		horsemen.setType1(Unittypes.mountedMUnit);
		horsemen.configUnit(20, 6, 7);
		
		Units horsearch = new Units("Horse Archer");
		horsearch.setType1(Unittypes.mountedRUnit);
		horsearch.configUnit(14, 5, 7);
		
		Units battlemage = new Units("Battle Mage");
		battlemage.setType1(Unittypes.mountedHUnit);
		battlemage.configUnit(16, 4, 7);
		
		archer.getUnitInfo();
		
	}
}
