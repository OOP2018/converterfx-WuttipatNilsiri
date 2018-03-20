package application;
/**
 * 
 * @author Wuttipat Nilsiri 
 *
 */
public enum Mass implements Unit{
	
	LITRE(1),
	CUBIC_METER(0.001),
	MILLILILIT(1000),
	
	POUND(2.20),
	GALLON(0.264172052);
	
	private double value;
	
	/**
	 * initial value of enum
	 * @param value
	 */
	Mass(double value){
		this.value = value;
	}
	
	@Override
	public double getValue(){
		return value;
	}
	
	
	@Override
	public double convert(double source, Unit unit) {
		try {
			Mass unitcast = (Mass) unit;
			return this.getValue()*source/unitcast.getValue();
		}
		catch (Exception e){
			System.out.println("fuck");
			return -1;
		}
	}
	
	
}
