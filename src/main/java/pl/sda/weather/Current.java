package pl.sda.weather;

/**
 * @author Paweł Matyaszczyk
 */
public class Current {
    private String observation_time;
    private Double temperature;
    private Double weather_code;
    private String[] weather_icons;
    private String[] weather_descriptions;
    private Double wind_speed;
    private Double wind_degree;
    private String wind_dir;
    private Double pressure;
    private Double precip;
    private Double humidity;
    private Double cloudcover;
    private Double feelslike;
    private Double uv_index;
    private Double visibility;
    private String is_day;


    public String getObservation_time() {
        return observation_time;
    }

    public void setObservation_time(String observation_time) {
        this.observation_time = observation_time;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getWeather_code() {
        return weather_code;
    }

    public void setWeather_code(Double weather_code) {
        this.weather_code = weather_code;
    }

    public String[] getWeather_icons() {
        return weather_icons;
    }

    public void setWeather_icons(String[] weather_icons) {
        this.weather_icons = weather_icons;
    }

    public String[] getWeather_descriptions() {
        return weather_descriptions;
    }

    public void setWeather_descriptions(String[] weather_descriptions) {
        this.weather_descriptions = weather_descriptions;
    }

    public Double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(Double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public Double getWind_degree() {
        return wind_degree;
    }

    public void setWind_degree(Double wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getPrecip() {
        return precip;
    }

    public void setPrecip(Double precip) {
        this.precip = precip;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Double cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Double getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Double feelslike) {
        this.feelslike = feelslike;
    }

    public Double getUv_index() {
        return uv_index;
    }

    public void setUv_index(Double uv_index) {
        this.uv_index = uv_index;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public String isIs_day() {
        return is_day;
    }

    public void setIs_day(String is_day) {
        this.is_day = is_day;
    }
}
