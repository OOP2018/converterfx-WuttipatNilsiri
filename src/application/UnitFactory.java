package application;

public class UnitFactory {
	private static UnitFactory uf = new UnitFactory();
	private UnitFactory(){
		
	}
	/**
	 * get Instance of UnitFactory 
	 * @return
	 */
	public static UnitFactory getFactory() {
		return uf;
	}
	/**
	 * get Units of type
	 * @param u UnitType
	 * @return Units
	 */
	public Unit[] getUnits(UnitType u) {
		return u.getUnits();
	}
	
}
