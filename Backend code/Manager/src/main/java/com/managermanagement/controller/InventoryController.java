package com.managermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.managermanagement.entity.InventoryEntity;
import com.managermanagement.service.InventoryService;
@CrossOrigin
@RestController
@RequestMapping("/inventory")
public class InventoryController {
	@Autowired
	private InventoryService inventoryService;
    @PostMapping("/add")
	public InventoryEntity addInventory(@RequestBody InventoryEntity inventoryEntity) {
		return this.inventoryService.addInventory(inventoryEntity);
	}
    @GetMapping("/get")
	public ResponseEntity<?> getInventory()
	{
    	return ResponseEntity.ok(this.inventoryService.getallInventoryEntities());
	}
    @PutMapping("/update")
    public InventoryEntity updateInventory(@RequestBody InventoryEntity inventoryEntity)
    {
    	return this.inventoryService.updateInventory(inventoryEntity);
    }
    @DeleteMapping("/delete/{id}")
    public int deleteInventory(@PathVariable Integer id)
    {
    	this.inventoryService.deleteById(id);
    	return id;
    }
}
