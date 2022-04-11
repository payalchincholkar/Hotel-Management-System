package com.managermanagement.service;

import java.util.List;

import com.managermanagement.entity.InventoryEntity;

public interface InventoryService {

	
	public List<InventoryEntity>getallInventoryEntities();
	public InventoryEntity addInventory(InventoryEntity inventoryEntity);
	public InventoryEntity updateInventory(InventoryEntity inventoryEntity);
	public void deleteById(Integer id);
}
