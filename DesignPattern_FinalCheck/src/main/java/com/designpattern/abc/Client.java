package com.designpattern.abc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {
	private static final Logger LOGGER = LogManager.getLogger(Client.class);
	public static void main(String[] args) {

		Order order1 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.ELECTRONIC);
		Order order2 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.TOYS);
		Order order3 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.ELECTRONIC);
		Order order4 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.FURNITURE);

		LOGGER.info("start");
		order1.processOrder();
		order2.processOrder();
		order3.processOrder();
		order4.processOrder();
		LOGGER.info("end");
	}

}
