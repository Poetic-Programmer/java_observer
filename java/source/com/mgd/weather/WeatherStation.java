package com.mgd.weather;

import java.util.Observable;

public class WeatherStation extends Observable{
	private WeatherData data;

	public WeatherStation(){
		data = new WeatherData();
	}

	public void update(){
		setChanged();
		notifyObservers(data); // push data
	}

	public void setWeatherData(float temperature, float humidity, float pressure){
		data.setTemperature(temperature);
		data.setHumidity(humidity);
		data.setPressure(pressure);

		update();
	}
}
