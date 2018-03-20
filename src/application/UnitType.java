package application;

public enum UnitType {
	
	LENGTH(Length.values()),
	AREA(Area.values()),
	MASS(Mass.values()),
	TEMPERATURE(Temperature.values());
	
	Unit[] a;
	UnitType(Unit[] a){
		this.a = a;
	}
	/**
	 * get all units 
	 * @return
	 */
	public Unit[] getUnits(){
		return a;
		
	}
	
}
