package com.bharath.ws.soap.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="RideInfo")
public class RideInfo {

	int id;
	String from;
	String to;
	int cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	

}
