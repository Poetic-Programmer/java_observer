package com.mgd.weather;

public class WeatherData{
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(){
		temperature = 0;
		humidity = 0;
		pressure = 0;
	}

	public WeatherData(float temperature, float humidity,
			float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public float getTemperature() { return temperature; }
	public float getHumidity() { return humidity; }
	public float getPressure() { return pressure; }

	public void setTemperature(float temperature) { this.temperature = temperature; }
	public void setHumidity(float humidity) { this.humidity = humidity; }
	public void setPressure(float pressure) { this.pressure = pressure; }
}
