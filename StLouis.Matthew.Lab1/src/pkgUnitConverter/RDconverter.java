/*
   Student Name: Matthew St. Louis
   Student Number: 040799919
   Course & Section #: 23W_CST8288_011
   Declaration:
   This is my own original work and is free from Plagiarism.
   */
package pkgUnitConverter;

/**
 * Class to convert Radians to Degrees using implemented methods
 * from the UnitConverter Interface
 * @see UnitConverter
 * @author Matthew St. Louis
 * @since 19.0.1
 * @version 1.0
 */
public class RDconverter implements UnitConverter {
    	private final double pi = Math.PI;
	
	/**
	 * @param radians to be converted
	 * @return equivalent in degrees
	 */
        @Override
	public double convert(double radians) {
		return radians * (180/pi);
	}
        /**
         * @return String describing type of conversion happening
         */
        @Override
        public String unitConversionType(){
            return "Radians to Degrees";
        }
}
