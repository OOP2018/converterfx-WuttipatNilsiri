package application;
/**
 * Unit interface with basic method
 * @author Wuttipat Nilsiri
 *
 */
public interface Unit {
	/**
	 * to know value of Unit
	 * @return value
	 */
	double getValue();
	/**
     * Converts the given temperature in the given unit to this unit.
     * @param source the temperature 
     * @param unit the unit of the argument
     * @return the converted temperature in this unit,
     */
	double convert(double source, Unit unit);
}
