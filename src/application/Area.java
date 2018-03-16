package application;

public enum Area implements Unit{
	//SI UNIT
	SQRTMETER(1.0),
	SQRTCENTIMETER(10000.0),
	SQRTMICROMETER(1_000_000_000_000.0),
	//ENG UNIT
	ACRE(0.000247105381),
	ROOD(0.00098842153134),
	
	TARANG_WA(0.25);
	
	/**
	 * initial value to enum 
	 */
	private double value;
	Area(double value){
		this.value= value;
	}
	
	@Override
	public double getValue(){
		return value;
	}

	@Override
	public double convert(double source, Unit unit) {
		try {
			Area unitcast = (Area) unit;
			return this.getValue()*source/unitcast.getValue();
		}
		catch (Exception e){
			System.out.println("fuck");
			return -1;
		}
	}
}
