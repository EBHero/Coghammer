package toolbox;

/**
 * See UnitRanges.txt for more info.
 */
public class Unittypes 
{
	//A collection of unit types, there's not too many though.
	private String type1Name;
	private String type2Name;
	private int id;
	private int cost;
	private String weakTo;
	
	public static Unittypes meleeUnit = new Unittypes(0, "Melee", "", 2, "None");
	public static Unittypes rangedUnit = new Unittypes(1, "Ranged", "", 2, "None");
	public static Unittypes hybridUnit = new Unittypes(2, "Hybrid", "", 2, "None");
	public static Unittypes mountedMUnit = new Unittypes(3, "Mounted", "Melee", 3, "Spears");
	public static Unittypes mountedRUnit = new Unittypes(4, "Mounted", "Ranged", 4, "Spears");
	public static Unittypes mountedHUnit = new Unittypes(5, "Mounted", "Hybrid", 4, "Spears");
	
	private Unittypes(int id, String type1Name, String type2Name, int cost, String weakTo)
	{
		this.id = id;
		this.type1Name = type1Name;
		this.type2Name = type2Name;
		this.cost = cost;
		this.weakTo = weakTo;
	}
	
	public int getTypeID()
	{
		return id;
	}
	public int getCost()
	{
		return cost;
	}
	public String getType1Name()
	{
		return type1Name;
	}
	public String getType2Name()
	{
		return type2Name;
	}
	public String getWeakTo()
	{
		return weakTo;
	}
}
