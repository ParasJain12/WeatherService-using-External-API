package com.weather;

public class Weather {
	private String description;
	private String icon; // Weather icon code (e.g., "01d" for clear sky during the day)
	private double temperature; // Temperature in Celsius
	private double humidity; // Humidity percentage
	private double windSpeed; // Wind speed in meters per second

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

}
