package cs_utec.cs2901;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        BasicConfigurator.configure();
        System.out.println( "Hello World!" );
    	for(int i = 0; i < 100; i++){
	    logger.info("Me debo lavar las manos!!");
        }
    }
}
