package GameProject.Entities.concretes;

import GameProject.Entities.abstracts.Entity;

public class Game implements Entity {

	private int id;
	private String name;
	private float price;

	public Game() {
	}

	public Game(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
