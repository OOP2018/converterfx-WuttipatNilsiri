package application;

public class UnitFactory {
	static UnitFactory uf = new UnitFactory();
	UnitFactory(){
		
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
