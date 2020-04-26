package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

/**
 * @author Paweł Matyaszczyk
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Location location = new Location("Poznan", "Poland");
        Request request = new Request("City", "Poznan, Poland");
        Current current = new Current();


        Weather weather = new Weather(23.5, "Poznan", request, location, current);
        System.out.println(weather.getTemperature());
        weather.setTemperature(34.33);
        System.out.println(weather.getTemperature());

        mapper.writeValue(new File("data.json"),weather);

        Weather readWeather = mapper.readValue(new File("data.json"),Weather.class);
        System.out.println(readWeather.getCity());

        WeatherService weatherService = new WeatherService("http://api.weatherstack.com/current","0d6e740b982c5b7990c8b92a0c8ce0db");
        Weather weather1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto do sprawdzenia: ");
        String city = scanner.nextLine();

        weather1 = weatherService.getCityWeather(city);
        System.out.println(weather1.getLocation().getName()+" ma temperaturę "+weather1.getCurrent().getTemperature());
        WeatherService forecastService = new WeatherService("http://api.weatherstack.com/forecast","0d6e740b982c5b7990c8b92a0c8ce0db");
        Forecast forecast;

        forecast = forecastService.getCityWeatherForecast(city,14);
        System.out.println(forecast.getError());

    }
    }
