/*
   Student Name: Matthew St. Louis
   Student Number: 040799919
   Course & Section #: 23W_CST8288_011
   Declaration:
   This is my own original work and is free from Plagiarism.
   */
package pkgUnitConverter;

/**
 * Class to convert Fahrenheit to Celsius using implemented methods
 * from the UnitConverter Interface
 * @see UnitConverter
 * @author Kriger, Matthew St. Louis
 * @since 19.0.1
 * @version 1.1
 */
public class FCconverter implements UnitConverter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
        /**
         * @return String describing type of conversion happening
         */
        @Override
        public String unitConversionType(){
            return "Farenheit to Celsius";
        }
}
