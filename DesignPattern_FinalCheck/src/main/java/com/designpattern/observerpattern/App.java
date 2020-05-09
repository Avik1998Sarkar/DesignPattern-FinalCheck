package com.designpattern.observerpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("start");

		INotificationService service = new NotificationService();

		INotificationObserver admin1 = new Admin(service, "Avik", 101);
		INotificationObserver admin2 = new Admin(service, "Avik2", 102);

		service.addObserver(admin1);
		service.addObserver(admin2);

		service.notifyObserver();
		
		service.removeObserver(admin2);
		service.notifyObserver();
		LOGGER.info("end");
	}
}