package toolbox;

public class Units 
{
	//Some collection of unit parameters
	private int unitID;
	private String unitName;
	
	
	private Unittypes unitType1;
	private int cost;
	private int move;
	private int HP;
	private int AP;
	
	//Some collection of units
	public static Units WARRIOR, MAGE, PRIEST, ARCHER, HORSEMEN, CHARARCH, BATTLEMAGE;
	
	

	public Units(int unitID)
	{
		this.unitID = unitID;
	}
	private Units(String name)
	{
		unitName = name;
		
	}
	public void getUnitInfo()
	{
		System.out.printf("Unit Name: %s\n", unitName);
		System.out.printf("Unit ID: %d\n", unitID);
		System.out.printf("Unit Type: %s %s\n", unitType1.getType1Name(), unitType1.getType2Name());
		System.out.printf("Unit Weak To: %s\n", unitType1.getWeakTo());
		System.out.printf("\t\tUnit Stats\n");
		System.out.printf("Health: %d\tAttack: %d\tMove: %d\n", HP, AP, move);
		System.out.printf("Unit Maintenance: %d Gold Per Turn\n", cost);
	}
	private void setType1(Unittypes yourType1)
	{
		unitType1 = yourType1;
		unitID = yourType1.getTypeID();
		cost = yourType1.getCost();
		
	}
	private void configUnit(int HP, int AP, int move)
	{
		this.HP = HP; this.AP = AP; this.move = move;
	}
	public static String getUnitName(int id)
	{
		String uName = "";
		switch(id)
		{
			case 0:
				uName = "Warrior";
				break;
			case 1:
				uName = "Mage";
				break;
			case 2:
				uName = "Priest";
				break;
			case 3:
				uName = "Archer";
				break;
			case 4:
				uName = "Horsemen";
				break;
			case 5:
				uName = "Chariot Archer";
				break;
			case 6:
				uName = "Battle Mage";
				break;
			default:
				break;
		}
		
		return uName;
	}
	public static int getUnitCost(int id)
	{
		int cost = 0;
		
		switch(id)
		{
			case 0:
				cost = 2;
				break;
			case 1:
				cost = 2;
				break;
			case 2:
				cost = 2;
				break;
			case 3:
				cost = 2;
				break;
			case 4:
				cost = 3;
				break;
			case 5:
				cost = 4;
				break;
			case 6:
				cost = 4;
				break;
			default:
				break;
		}
		
		return cost;
	}
	public int unitID()
	{
		return unitID;
	}
	public String getUnitName()
	{
		return unitName;
	}
	public Units createUnit(int unitID)
	{
		Units tobeMade = null;
		if(unitID == 0)
		{
			tobeMade= new Units("Warrior");
			tobeMade.setType1(Unittypes.meleeUnit);
			tobeMade.configUnit(20, 6, 4);
		}
		if(unitID == 1)
		{
			tobeMade= new Units("Mage");
			tobeMade.setType1(Unittypes.hybridUnit);
			tobeMade.configUnit(14, 4, 4);
		}
		if(unitID == 2)
		{
			tobeMade= new Units("Priest");
			tobeMade.setType1(Unittypes.hybridUnit);
			tobeMade.configUnit(18, 3, 4);
		}
		if(unitID == 3)
		{
			tobeMade= new Units("Archer");
			tobeMade.setType1(Unittypes.rangedUnit);
			tobeMade.configUnit(16, 5, 4);
		}
		if(unitID == 4)
		{
			tobeMade= new Units("Horsemen");
			tobeMade.setType1(Unittypes.mountedMUnit);
			tobeMade.configUnit(20, 6, 7);
		}
		if(unitID == 5)
		{
			tobeMade= new Units("Chariot Archer");
			tobeMade.setType1(Unittypes.mountedRUnit);
			tobeMade.configUnit(14, 5, 7);
		}
		if(unitID == 6)
		{
			tobeMade= new Units("Battle Mage");
			tobeMade.setType1(Unittypes.mountedHUnit);
			tobeMade.configUnit(16, 4, 7);
		}
		return tobeMade;
	}
	public static void createUnits()
	{
		WARRIOR = new Units("Warrior");
		WARRIOR.setType1(Unittypes.meleeUnit);
		WARRIOR.configUnit(20, 6, 4);
		
		MAGE = new Units("Mage");
		MAGE.setType1(Unittypes.hybridUnit);
		MAGE.configUnit(14, 4, 4);
		
		PRIEST = new Units("Priest");
		PRIEST.setType1(Unittypes.hybridUnit);
		PRIEST.configUnit(18, 3, 4);
		
		ARCHER = new Units("Archer");
		ARCHER.setType1(Unittypes.rangedUnit);
		ARCHER.configUnit(16, 5, 4);
		
		HORSEMEN = new Units("Horsemen");
		HORSEMEN.setType1(Unittypes.mountedMUnit);
		HORSEMEN.configUnit(20, 6, 7);
		
		CHARARCH = new Units("Chariot Archer");
		CHARARCH.setType1(Unittypes.mountedRUnit);
		CHARARCH.configUnit(14, 5, 7);
		
		BATTLEMAGE = new Units("Battle Mage");
		BATTLEMAGE.setType1(Unittypes.mountedHUnit);
		BATTLEMAGE.configUnit(16, 4, 7);
	}

}
