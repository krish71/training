package entity;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Flight {

	private String flightNo;
	private String carrier;
	private String from;
	private String to;
	
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
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

	@Override
	public String toString() {
		return "Flight No = "+flightNo+", Carrier = "+carrier+", From = "+from+", To = "+to;
	}
	
}
