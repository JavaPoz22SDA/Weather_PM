package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;
import java.util.Scanner;

/**
 * @author Paweł Matyaszczyk
 */
public class GetWeather {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Location location;
        Current current;
        //Optional opt = Optional.ofNullable(null).orElseGet(()->"Test");
        //opt.ifPresent(n-> System.out.println(n));

        String url = "http://api.weatherstack.com/current?access_key=0d6e740b982c5b7990c8b92a0c8ce0db&query=Poznan";

        WeatherService weatherService = new WeatherService("http://api.weatherstack.com/current","0d6e740b982c5b7990c8b92a0c8ce0db");
        Weather weather1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto do sprawdzenia: ");
        String city = scanner.nextLine();

        weather1 = weatherService.getCityWeather(city);
        System.out.println(weather1.getLocation().getName()+" ma temperaturę "+weather1.getCurrent().getTemperature());
    }
}
