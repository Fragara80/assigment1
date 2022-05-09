package com.bharath.ws.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RideProcessorRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class RideProcessorRequest {

	@XmlElement(name="rideInfo",required=true)
	private RideInfo rideInfo;
	@XmlElement(name="amount")
	private Double amount;

	public RideInfo getCreditCardInfo() {
		return rideInfo;
	}

	public void setCreditCardInfo(RideInfo creditCardInfo) {
		this.rideInfo = creditCardInfo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
