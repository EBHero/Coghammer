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
	//private Unittypes weakType;

	
	public Units(String name)
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
	public void setType1(Unittypes yourType1)
	{
		unitType1 = yourType1;
		unitID = yourType1.getTypeID();
		cost = yourType1.getCost();
		
		
	}
	public void configUnit(int HP, int AP, int move)
	{
		this.HP = HP; this.AP = AP; this.move = move;
	}
	
	public int unitID()
	{
		return unitID;
	}

}
