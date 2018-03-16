package application;
/**
 * basic unit of length
 * @author Wuttipat Nilsiri
 *
 */
public enum Length implements Unit{
	
	METER(1.0000),
	CENTIMETER(0.0100),
	KILOMETER(1000.0),
	MILE(1609.344),
	FOOT(0.30480),
	WA(2.00000),
	AU(149597870700.0); 
	
	
	
	
	final double value;
	/**
	 * init the value for Unit of Length
	 * @param value
	 */
	private Length(double value){
		this.value = value;
	}
	/**
	 * to know value of Unit / meter
	 * @return value
	 */
	public double  getValue(){
		return value;
	}
	
	public double convert(double source, Unit unit){
		try {
			Length unitcast = (Length) unit;
			return this.getValue()*source/unitcast.getValue();
		}
		catch (Exception e){
			System.out.println("fuck");
			return -1;
		}
	}
}
