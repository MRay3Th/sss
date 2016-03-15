package pl.hubswi;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private final static Logger LOGGER = Logger.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
    	LOGGER.info("Hello Log4j");
        System.out.println( "Hello World!" );
    }
}
