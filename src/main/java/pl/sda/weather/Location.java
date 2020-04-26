package pl.sda.weather;

import java.util.DoubleSummaryStatistics;

/**
 * @author Paweł Matyaszczyk
 */
public class Location {
    private String name;
    private String country;
    private String region;
    private Double lat;
    private Double lon;
    private String timezone_id;
    private String localtime;
    private String localtime_epoch;
    private Double utc_offset;

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public String getLocaltime_epoch() {
        return localtime_epoch;
    }

    public void setLocaltime_epoch(String localtime_epoch) {
        this.localtime_epoch = localtime_epoch;
    }

    public Double getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(Double utc_offset) {
        this.utc_offset = utc_offset;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getTimezone_id() {
        return timezone_id;
    }

    public void setTimezone_id(String timezone_id) {
        this.timezone_id = timezone_id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Location() {
    }

    public Location(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
