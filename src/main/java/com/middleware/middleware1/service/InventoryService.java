package com.middleware.middleware1.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.middleware.middleware1.pojo.Inventory;

@Service
public class InventoryService {
	private static final Logger logger = LoggerFactory.getLogger(InventoryService.class);
	public List<Inventory> getAllInventory() {
		logger.info("Getting inventory from database");
		List<Inventory> listALl = new ArrayList<>();
		Inventory i1 = new Inventory("1","bag");
		Inventory i2 = new Inventory("2","parcel");
		Inventory i3 = new Inventory("3","hardcore bag");
		listALl.add(i1);
		listALl.add(i2);
		listALl.add(i3);
		return listALl;
	}

}
