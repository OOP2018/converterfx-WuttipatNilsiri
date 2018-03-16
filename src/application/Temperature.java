package application;
/**
 * 
 * @author Wuttipat Nilsiri
 *
 */
public enum Temperature implements Unit{
    
    /**
     * Temperature representing Celsius (C)
     */
    CELSIUS('C') {
        public double toCelsius(double d)    { return d; }
        public double toFahrenheit(double d) { return (d - 32) /1.8; }
        public double toKelvin(double d) { return d - 273.15; }
        public double convert(double source, Unit unit) { 
        	try {
        		return ((Temperature)unit).toCelsius(source);
        	}catch(Exception e){
        		System.out.println("fuck");
        		return -1;
        	}
        }
        public double getValue(){
        	return 0;
        }
    },
    
    /**
     * Temperature representing Fahrenheit (F)
     */
    FAHRENHEIT('F') {
        public double toCelsius(double d)    { return (d * 1.8) + 32; }
        public double toFahrenheit(double d) { return d; }
        public double toKelvin(double d) { return (d * 1.8) - 459.67; }
        public double convert(double source, Unit unit) { 
        	try {
        		return ((Temperature)unit).toFahrenheit(source);
        	}catch(Exception e){
        		System.out.println("fuck");
        		return -1;
        	}
        }
        public double getValue(){
        	return 32;
        }
    },
    
    /**
     * Temperature representing Kelvin (K)
     */
    KELVIN('K') {
        public double toCelsius(double d) { return d + 273.15; }
        public double toFahrenheit(double d) { return (d + 459.67) / 1.8; }
        public double toKelvin(double d) { return d; }
        public double convert(double source, Unit unit) { 
        	try {
        		return ((Temperature)unit).toKelvin(source);
        	}catch(Exception e){
        		System.out.println("fuck");
        		return -1;
        	}
        }
        public double getValue(){
        	return 273.15;
        }
    };
    
    private final char c;
    
    Temperature(char c) {
        this.c = c;
    }
    
    /**
     * Converts the given temperature in the given unit to this unit.
     * @param source the temperature 
     * @param unit the unit of the argument
     * @return the converted temperature in this unit,
     */
    public double convert(double source, Temperature unit) {
        throw new AbstractMethodError();
    }
    
    /**
     * Equivalent to celsius
     * @param d the temperature in celsius
     * @return the converted temperature
     */
    public double toCelsius(double d) {
        throw new AbstractMethodError();
    }
    
    /**
     * Equivalent to fahrenheit
     * @param d the temperature in fahrenheit
     * @return the converted temperature
     */
    public double toFahrenheit(double d) {
        throw new AbstractMethodError();
    }
    
    /**
     * Equivalent to kelvin
     * @param d the temperature in kelvin
     * @return the converted temperature
     */
    public double toKelvin(double d) {
        throw new AbstractMethodError();
    }
    
    public char getChar() {
        return c;
    }
    
}
