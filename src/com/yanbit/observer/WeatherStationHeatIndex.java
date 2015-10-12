package com.yanbit.observer;

import com.yanbit.observer.observer.CurrentConditionsDisplay;
import com.yanbit.observer.observer.ForecastDisplay;
import com.yanbit.observer.observer.HeatIndexDisplay;
import com.yanbit.observer.observer.StatisticsDisplay;
import com.yanbit.observer.subject.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
