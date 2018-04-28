package by.htp.onlinestore.entity;

import java.io.Serializable;

public abstract class Entity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1894332867975051185L;
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Entity() {
		super();
	}

	public Entity(int id) {
		super();
		this.id = id;
	}


}
