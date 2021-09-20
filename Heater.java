
/**
 * Heater.java  
 *
 * @author - Danison
 */ 
public class Heater
{
    private double temperature;
    
    public Heater()
    {
        temperature = 15.0;
    }
    
    /**
     * returns the current temperature
     */
    public double temperature()
    {
        return temperature;
    }
    
    /**
     * Adds 5 to the current temperature value, increasing the warmth. 
     */
    public void getWarmer()
    {
        temperature += 5.0;
    }
    
    /**
     * Decreases the temperature by 5
     */
    public void getColder()
    {
        temperature -= 5.0;
    }
    
    /**
     * test
     */
}
