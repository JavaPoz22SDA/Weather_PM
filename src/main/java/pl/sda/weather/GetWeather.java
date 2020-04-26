package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Paweł Matyaszczyk
 */
public class GetWeather {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Location location;
        Current current;

        String url = "http://api.weatherstack.com/current?access_key=0d6e740b982c5b7990c8b92a0c8ce0db&query=Poznan";

        Weather object = mapper.readValue(new URL(url),Weather.class);
        location = object.getLocation();
        current = object.getCurrent();
        System.out.println("Lokalizacja: "+ location.getName() + " temperatura: " + current.getTemperature() );
    }
}
