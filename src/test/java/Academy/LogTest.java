package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import groovyjarjarantlr4.v4.codegen.model.decl.Decl;

public class LogTest {

	private static Logger Log = LogManager.getLogger(Decl.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Log.debug("I am debugging"); 
		Log.info("object is present");
		Log.error("object is not present");
		Log.fatal("this is fatal");
   
	}

}
