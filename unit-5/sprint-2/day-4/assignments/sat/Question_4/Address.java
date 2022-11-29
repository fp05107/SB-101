package sat.Question_4;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String state;
	private String cityName;
	private int pin;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String state, String cityName, int pin) {
		super();
		this.state = state;
		this.cityName = cityName;
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", cityName=" + cityName + ", pin=" + pin + "]";
	}
	
	
}
