package LOG4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Log4J World \n");
		logger.info("info");
		logger.error("Error");
		logger.warn("warn");
		logger.fatal("fatel");
		logger.debug("debug");
		System.out.println("completed");
		
	}

}
