package com.mgd.weather;

import java.util.Observer;
import java.util.Observable;

public class FutureDisplay implements Observer, Display{
	private float futureTemperature;

	public FutureDisplay(){
	}

	/*
	 *The following 2 methods go against the "program to an interface" 
	 *design principle, they are created to show the different implementation
	 *of javas Observer Pattern support
	*/
	public void addToObservers(Observable obs){
		obs.addObserver(this);
	}

	public void removeFromObservers(Observable obs){
		obs.deleteObserver(this);
	}

	@Override
	public void update(Observable obs, Object obj){
		if(obj instanceof WeatherData){
			WeatherData data = (WeatherData) obj;
			
			// simply make the prediction 5 degrees higher, not really scientific,
			// but it suits the app.
			futureTemperature = data.getTemperature() + 5;

			display();
		}
	}

	public void display(){
		StringBuilder builder = new StringBuilder();
		builder.append("<----------------FUTURE DATA---------------->\n\n");
		builder.append("Temperature: " + futureTemperature + "\n");
		builder.append("\n===========================================");
		System.out.println(builder.toString());
	}
}



