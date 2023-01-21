/*
   Student Name: Matthew St. Louis
   Student Number: 040799919
   Course & Section #: 23W_CST8288_011
   Declaration:
   This is my own original work and is free from Plagiarism.
   */
package pkgUnitConverter;


/**
 * Class to convert Degrees to Radians using implemented methods
 * from the UnitConverter Interface
 * @see UnitConverter
 * @author Matthew St. Louis
 * @since 19.0.1
 * @version 1.0
 */
public class DRconverter implements UnitConverter {
    
	private final double pi = Math.PI;
	
	/**
	 * @param degrees to be converted
	 * @return equivalent in Radians
	 */
        @Override
	public double convert(double degrees) {
		return degrees * (pi/180);
	}
        /**
         * @return String describing type of conversion happening
         */
        @Override
        public String unitConversionType(){
            return "Degrees to Radians";
        }
    
}
