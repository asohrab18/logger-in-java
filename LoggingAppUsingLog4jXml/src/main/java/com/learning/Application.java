package com.learning;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Application {

	private static final Logger LOG = Logger.getLogger(Application.class);

	public static void init() {
		DOMConfigurator.configureAndWatch("D:/log4j.xml");
	}

	public static void main(String[] args) {
		init();
		runApplication();
	}

	private static void runApplication() {
	    LOG.debug("Debug message");
	    LOG.info("Application is running...");
	    LOG.warn("This is a warning");
	    LOG.error("This is an error");
	}
}
