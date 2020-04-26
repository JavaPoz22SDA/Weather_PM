package pl.sda.weather;

/**
 * @author Paweł Matyaszczyk
 */
public class Forecast {
    private Request request;
    private Location location;
    private Current current;
    private Object forecast;
    private Object success;
    private Object error;


    public Forecast() {
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Object getForecast() {
        return forecast;
    }

    public void setForecast(Object forecast) {
        this.forecast = forecast;
    }

    public Object getSuccess() {
        return success;
    }

    public void setSuccess(Object success) {
        this.success = success;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
