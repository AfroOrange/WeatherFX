
package dad.javafx.weather.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "weather_state_name",
    "weather_state_abbr",
    "wind_direction_compass",
    "created",
    "applicable_date",
    "min_temp",
    "max_temp",
    "the_temp",
    "wind_speed",
    "wind_direction",
    "air_pressure",
    "humidity",
    "visibility",
    "predictability"
})
public class ConsolidatedWeather {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("weather_state_name")
    private String weatherStateName;
    @JsonProperty("weather_state_abbr")
    private String weatherStateAbbr;
    @JsonProperty("wind_direction_compass")
    private String windDirectionCompass;
    @JsonProperty("created")
    private String created;
    @JsonProperty("applicable_date")
    private String applicableDate;
    @JsonProperty("min_temp")
    private Double minTemp;
    @JsonProperty("max_temp")
    private Double maxTemp;
    @JsonProperty("the_temp")
    private Double theTemp;
    @JsonProperty("wind_speed")
    private Double windSpeed;
    @JsonProperty("wind_direction")
    private Double windDirection;
    @JsonProperty("air_pressure")
    private Double airPressure;
    @JsonProperty("humidity")
    private Long humidity;
    @JsonProperty("visibility")
    private Double visibility;
    @JsonProperty("predictability")
    private Long predictability;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("weather_state_name")
    public String getWeatherStateName() {
        return weatherStateName;
    }

    @JsonProperty("weather_state_name")
    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    @JsonProperty("weather_state_abbr")
    public String getWeatherStateAbbr() {
        return weatherStateAbbr;
    }

    @JsonProperty("weather_state_abbr")
    public void setWeatherStateAbbr(String weatherStateAbbr) {
        this.weatherStateAbbr = weatherStateAbbr;
    }

    @JsonProperty("wind_direction_compass")
    public String getWindDirectionCompass() {
        return windDirectionCompass;
    }

    @JsonProperty("wind_direction_compass")
    public void setWindDirectionCompass(String windDirectionCompass) {
        this.windDirectionCompass = windDirectionCompass;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("applicable_date")
    public String getApplicableDate() {
        return applicableDate;
    }

    @JsonProperty("applicable_date")
    public void setApplicableDate(String applicableDate) {
        this.applicableDate = applicableDate;
    }

    @JsonProperty("min_temp")
    public Double getMinTemp() {
        return minTemp;
    }

    @JsonProperty("min_temp")
    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    @JsonProperty("max_temp")
    public Double getMaxTemp() {
        return maxTemp;
    }

    @JsonProperty("max_temp")
    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @JsonProperty("the_temp")
    public Double getTheTemp() {
        return theTemp;
    }

    @JsonProperty("the_temp")
    public void setTheTemp(Double theTemp) {
        this.theTemp = theTemp;
    }

    @JsonProperty("wind_speed")
    public Double getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("wind_speed")
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("wind_direction")
    public Double getWindDirection() {
        return windDirection;
    }

    @JsonProperty("wind_direction")
    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }

    @JsonProperty("air_pressure")
    public Double getAirPressure() {
        return airPressure;
    }

    @JsonProperty("air_pressure")
    public void setAirPressure(Double airPressure) {
        this.airPressure = airPressure;
    }

    @JsonProperty("humidity")
    public Long getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("visibility")
    public Double getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("predictability")
    public Long getPredictability() {
        return predictability;
    }

    @JsonProperty("predictability")
    public void setPredictability(Long predictability) {
        this.predictability = predictability;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConsolidatedWeather.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("weatherStateName");
        sb.append('=');
        sb.append(((this.weatherStateName == null)?"<null>":this.weatherStateName));
        sb.append(',');
        sb.append("weatherStateAbbr");
        sb.append('=');
        sb.append(((this.weatherStateAbbr == null)?"<null>":this.weatherStateAbbr));
        sb.append(',');
        sb.append("windDirectionCompass");
        sb.append('=');
        sb.append(((this.windDirectionCompass == null)?"<null>":this.windDirectionCompass));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("applicableDate");
        sb.append('=');
        sb.append(((this.applicableDate == null)?"<null>":this.applicableDate));
        sb.append(',');
        sb.append("minTemp");
        sb.append('=');
        sb.append(((this.minTemp == null)?"<null>":this.minTemp));
        sb.append(',');
        sb.append("maxTemp");
        sb.append('=');
        sb.append(((this.maxTemp == null)?"<null>":this.maxTemp));
        sb.append(',');
        sb.append("theTemp");
        sb.append('=');
        sb.append(((this.theTemp == null)?"<null>":this.theTemp));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null)?"<null>":this.windSpeed));
        sb.append(',');
        sb.append("windDirection");
        sb.append('=');
        sb.append(((this.windDirection == null)?"<null>":this.windDirection));
        sb.append(',');
        sb.append("airPressure");
        sb.append('=');
        sb.append(((this.airPressure == null)?"<null>":this.airPressure));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("predictability");
        sb.append('=');
        sb.append(((this.predictability == null)?"<null>":this.predictability));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.windDirectionCompass == null)? 0 :this.windDirectionCompass.hashCode()));
        result = ((result* 31)+((this.theTemp == null)? 0 :this.theTemp.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.airPressure == null)? 0 :this.airPressure.hashCode()));
        result = ((result* 31)+((this.maxTemp == null)? 0 :this.maxTemp.hashCode()));
        result = ((result* 31)+((this.predictability == null)? 0 :this.predictability.hashCode()));
        result = ((result* 31)+((this.minTemp == null)? 0 :this.minTemp.hashCode()));
        result = ((result* 31)+((this.weatherStateName == null)? 0 :this.weatherStateName.hashCode()));
        result = ((result* 31)+((this.weatherStateAbbr == null)? 0 :this.weatherStateAbbr.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.applicableDate == null)? 0 :this.applicableDate.hashCode()));
        result = ((result* 31)+((this.windDirection == null)? 0 :this.windDirection.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.windSpeed == null)? 0 :this.windSpeed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsolidatedWeather) == false) {
            return false;
        }
        ConsolidatedWeather rhs = ((ConsolidatedWeather) other);
        return (((((((((((((((((this.windDirectionCompass == rhs.windDirectionCompass)||((this.windDirectionCompass!= null)&&this.windDirectionCompass.equals(rhs.windDirectionCompass)))&&((this.theTemp == rhs.theTemp)||((this.theTemp!= null)&&this.theTemp.equals(rhs.theTemp))))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.airPressure == rhs.airPressure)||((this.airPressure!= null)&&this.airPressure.equals(rhs.airPressure))))&&((this.maxTemp == rhs.maxTemp)||((this.maxTemp!= null)&&this.maxTemp.equals(rhs.maxTemp))))&&((this.predictability == rhs.predictability)||((this.predictability!= null)&&this.predictability.equals(rhs.predictability))))&&((this.minTemp == rhs.minTemp)||((this.minTemp!= null)&&this.minTemp.equals(rhs.minTemp))))&&((this.weatherStateName == rhs.weatherStateName)||((this.weatherStateName!= null)&&this.weatherStateName.equals(rhs.weatherStateName))))&&((this.weatherStateAbbr == rhs.weatherStateAbbr)||((this.weatherStateAbbr!= null)&&this.weatherStateAbbr.equals(rhs.weatherStateAbbr))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.applicableDate == rhs.applicableDate)||((this.applicableDate!= null)&&this.applicableDate.equals(rhs.applicableDate))))&&((this.windDirection == rhs.windDirection)||((this.windDirection!= null)&&this.windDirection.equals(rhs.windDirection))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.windSpeed == rhs.windSpeed)||((this.windSpeed!= null)&&this.windSpeed.equals(rhs.windSpeed))));
    }

}
