package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Paweł Matyaszczyk
 */
public class WeatherService {
    private String finalURL;

    public WeatherService(String pageURL, String keyAPI) {

        this.finalURL = pageURL +"?access_key=" + keyAPI;
    }

    public Forecast getCityWeatherForecast(String city, Integer days) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new URL(finalURL+ "&query="+city.replaceAll(" ","%20")+"&forecast_days="+days+"&hourly=1"),Forecast.class);
    }

    public Weather getCityWeather (String city) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new URL(finalURL+ "&query="+city.replaceAll(" ","%20")),Weather.class);
    }

}
