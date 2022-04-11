package com.managermanagement.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Inventory")
public class InventoryEntity {
	@Id
	private int id;
	private int beds;
	private int tables;
	private int chairs;
	private int pillow;
	private int bedsheet;
	private int mattress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public int getTables() {
		return tables;
	}

	public void setTables(int tables) {
		this.tables = tables;
	}

	public int getChairs() {
		return chairs;
	}

	public void setChairs(int chairs) {
		this.chairs = chairs;
	}

	public int getPillow() {
		return pillow;
	}

	public void setPillow(int pillow) {
		this.pillow = pillow;
	}

	public int getBedsheet() {
		return bedsheet;
	}

	public void setBedsheet(int bedsheet) {
		this.bedsheet = bedsheet;
	}

	public int getMattress() {
		return mattress;
	}

	public void setMattress(int mattress) {
		this.mattress = mattress;
	}

	@Override
	public String toString() {
		return "InventoryEntity [id=" + id + ", beds=" + beds + ", tables=" + tables + ", chairs=" + chairs
				+ ", pillow=" + pillow + ", bedsheet=" + bedsheet + ", mattress=" + mattress + "]";
	}

	public InventoryEntity(int id, int beds, int tables, int chairs, int pillow, int bedsheet, int mattress) {
		super();
		this.id = id;
		this.beds = beds;
		this.tables = tables;
		this.chairs = chairs;
		this.pillow = pillow;
		this.bedsheet = bedsheet;
		this.mattress = mattress;
	}

	public InventoryEntity() {
		super();

	}

}
