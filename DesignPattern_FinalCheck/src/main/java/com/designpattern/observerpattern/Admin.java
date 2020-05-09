package com.designpattern.observerpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin extends INotificationObserver {

	private static final Logger LOGGER = LogManager.getLogger(Admin.class);

	public Admin(INotificationService service, String name, int noOfTickets) {
		super(service, name, noOfTickets);
	}

	@Override
	public void nofication() {
		LOGGER.info("Start Notification");
		LOGGER.debug("Hello " + name);
		LOGGER.info("End Notification");
	}

}