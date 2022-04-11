package com.managermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managermanagement.entity.InventoryEntity;
import com.managermanagement.repository.InventoryRepository;
@Service
public class InventoryServiceImpl implements InventoryService {
   
	@Autowired
	private InventoryRepository inventoryRepository;
	
	
	@Override
	public List<InventoryEntity> getallInventoryEntities() {
		return this.inventoryRepository.findAll();
	}

	@Override
	public InventoryEntity addInventory(InventoryEntity inventoryEntity) {
		return this.inventoryRepository.save(inventoryEntity);
	}

	@Override
	public InventoryEntity updateInventory(InventoryEntity inventoryEntity) {
		return this.inventoryRepository.save(inventoryEntity);
	}

	@Override
	public void deleteById(Integer id) {
		inventoryRepository.deleteById(id);	}

}
