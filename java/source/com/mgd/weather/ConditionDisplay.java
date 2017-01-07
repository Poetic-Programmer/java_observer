package com.mgd.weather;

import java.util.Observable;
import java.util.Observer;

/**
  *@author: michael dunleavy
  *<h1>ConditionDisplay<h1>
  *<p>shows the current weather passed by the Weather Station</p>
  */
public class ConditionDisplay implements Observer, Display{
	private Observable obs;

	private float temperature;
	private float pressure;

	public ConditionDisplay(Observable obs){
		this.obs = obs;

		obs.addObserver(this);
	}

	public void update(Observable obs, Object obj){
		if(obj instanceof WeatherData){
			WeatherData data = (WeatherData) obj;

			temperature = data.getTemperature();
			pressure = data.getPressure();

			display();
		}
	}
			
	public void display(){
		StringBuilder builder = new StringBuilder();
		builder.append("<---------------WEATHER DATA--------------->\n\n");
		builder.append("Temperature: " + temperature + "\n");
		builder.append("Pressure: " + pressure + "\n");
		builder.append("============================================");
		System.out.println(builder.toString());
	}
}

