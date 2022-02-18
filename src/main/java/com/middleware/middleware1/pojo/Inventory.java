package com.middleware.middleware1.pojo;

public class Inventory {

	private String id;
	private String type;

	public Inventory() {
	}

	public Inventory(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", type=" + type + "]";
	}

}
