package com.designpattern.abc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ToysOrder extends Order {
	private static final Logger LOGGER = LogManager.getLogger(ToysOrder.class);
	public ToysOrder(ChannelType channel, ProductType productType) {
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
