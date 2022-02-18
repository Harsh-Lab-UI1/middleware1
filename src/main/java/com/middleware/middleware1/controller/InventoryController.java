package com.middleware.middleware1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middleware.middleware1.pojo.Inventory;
import com.middleware.middleware1.service.InventoryService;


@CrossOrigin
@RestController
@RequestMapping("/inventory")
public class InventoryController {
	private static final Logger logger = LoggerFactory.getLogger(InventoryController.class);
	@Autowired
	InventoryService inventoryService;

	@GetMapping("/all")
	public List<Inventory> getAllInventory() {
		logger.info("Trying to getting all inventory");
		return inventoryService.getAllInventory();
	}

	@GetMapping("/{id}")
	public Inventory getInventory(@PathVariable("id") String brandId) {
		Inventory response = new Inventory();
		logger.info("Trying to getting inventory id: " + brandId);
		List<Inventory> list = inventoryService.getAllInventory();
		for (Inventory inv : list) {
			if (inv.getId().equalsIgnoreCase(brandId)) {
				logger.info("Found in database");
				return inv;
			}
		}
		logger.info("Not Found in databases id: " + brandId);
		return response;
	}
}
