package com.mgd;

import com.mgd.weather.*;

public class Test{
	public static void main(String [] args){
		WeatherStation station = new WeatherStation();
		ConditionDisplay display = new ConditionDisplay(station);
		FutureDisplay futureDisplay = new FutureDisplay();

		futureDisplay.addToObservers(station);

		station.setWeatherData(01, 10, 10);

		station.setWeatherData(2, 12, 40);

		futureDisplay.removeFromObservers(station);

		station.setWeatherData(0, 1, 1);
	}
}
