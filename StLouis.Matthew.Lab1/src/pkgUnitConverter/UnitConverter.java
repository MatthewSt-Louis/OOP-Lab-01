/*
   Student Name: Matthew St. Louis
   Student Number: 040799919
   Course & Section #: 23W_CST8288_011
   Declaration:
   This is my own original work and is free from Plagiarism.
   */
package pkgUnitConverter;

/**
 * Interface UnitConverter, is designed to convert various units of measurement 
 * contains to methods to be implemented. One to handle the actual
 * conversion of the units, the other to set the type of conversion
 * happening.
 * @author Matthew St. Louis, 040799919
 * @since 19.0.1
 * @version 1.0
 */
public interface UnitConverter {
    
    /**
     * @param unit to be converted
     * @return
     */
    public double convert(double unit);
    
    /**
     * @return
     */
    public String unitConversionType();
    
    
}
