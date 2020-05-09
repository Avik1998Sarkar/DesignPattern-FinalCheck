package com.designpattern.abc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ElectronicOrder extends Order {
	private static final Logger LOGGER = LogManager.getLogger(ElectronicOrder.class);
	public ElectronicOrder(ChannelType channel, ProductType productType) {
		super(channel, productType);
	}

	@Override
	public void processOrder() {
		LOGGER.info("Processing order .............");
		LOGGER.info("Start Taking Order");
		LOGGER.debug("Product Type : " + productType);
		LOGGER.debug("Channel Type : " + channel);
		LOGGER.info("Ending Order Process");
	}

}
