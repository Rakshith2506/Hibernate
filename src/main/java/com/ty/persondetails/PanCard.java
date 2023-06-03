package com.ty.persondetails;

import javax.persistence.Id;

public class PanCard {
	
	private int id;
	private String panid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanid() {
		return panid;
	}
	public void setPanid(String panid) {
		this.panid = panid;
	}

}
