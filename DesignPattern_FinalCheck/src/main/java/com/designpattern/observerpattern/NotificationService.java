package com.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NotificationService implements INotificationService {

	static final Logger LOGGER = LogManager.getLogger(NotificationService.class);

	List<INotificationObserver> observers = null;

	public NotificationService() {
		super();
		observers = new ArrayList<INotificationObserver>();
	}

	public void addObserver(INotificationObserver observer) {
		LOGGER.info("Adding Observer");
		observers.add(observer);
	}

	public void removeObserver(INotificationObserver observer) {
		LOGGER.info("Removing Observer");
		observers.remove(observer);
	}

	public void notifyObserver() {
		for (INotificationObserver observer : observers) {
			if (observer.getNoOfTickets() > 100) {
				observer.nofication();
			}
		}
	}
}