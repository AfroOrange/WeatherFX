
package dad.javafx.weather.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consolidated_weather",
    "time",
    "sun_rise",
    "sun_set",
    "timezone_name",
    "parent",
    "sources",
    "title",
    "location_type",
    "woeid",
    "latt_long",
    "timezone"
})
public class Weather {

    @JsonProperty("consolidated_weather")
    private List<ConsolidatedWeather> consolidatedWeather = new ArrayList<ConsolidatedWeather>();
    @JsonProperty("time")
    private String time;
    @JsonProperty("sun_rise")
    private String sunRise;
    @JsonProperty("sun_set")
    private String sunSet;
    @JsonProperty("timezone_name")
    private String timezoneName;
    @JsonProperty("parent")
    private Parent parent;
    @JsonProperty("sources")
    private List<Source> sources = new ArrayList<Source>();
    @JsonProperty("title")
    private String title;
    @JsonProperty("location_type")
    private String locationType;
    @JsonProperty("woeid")
    private Long woeid;
    @JsonProperty("latt_long")
    private String lattLong;
    @JsonProperty("timezone")
    private String timezone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("consolidated_weather")
    public List<ConsolidatedWeather> getConsolidatedWeather() {
        return consolidatedWeather;
    }

    @JsonProperty("consolidated_weather")
    public void setConsolidatedWeather(List<ConsolidatedWeather> consolidatedWeather) {
        this.consolidatedWeather = consolidatedWeather;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("sun_rise")
    public String getSunRise() {
        return sunRise;
    }

    @JsonProperty("sun_rise")
    public void setSunRise(String sunRise) {
        this.sunRise = sunRise;
    }

    @JsonProperty("sun_set")
    public String getSunSet() {
        return sunSet;
    }

    @JsonProperty("sun_set")
    public void setSunSet(String sunSet) {
        this.sunSet = sunSet;
    }

    @JsonProperty("timezone_name")
    public String getTimezoneName() {
        return timezoneName;
    }

    @JsonProperty("timezone_name")
    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    @JsonProperty("parent")
    public Parent getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @JsonProperty("sources")
    public List<Source> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("location_type")
    public String getLocationType() {
        return locationType;
    }

    @JsonProperty("location_type")
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @JsonProperty("woeid")
    public Long getWoeid() {
        return woeid;
    }

    @JsonProperty("woeid")
    public void setWoeid(Long woeid) {
        this.woeid = woeid;
    }

    @JsonProperty("latt_long")
    public String getLattLong() {
        return lattLong;
    }

    @JsonProperty("latt_long")
    public void setLattLong(String lattLong) {
        this.lattLong = lattLong;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
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
        sb.append(Weather.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("consolidatedWeather");
        sb.append('=');
        sb.append(((this.consolidatedWeather == null)?"<null>":this.consolidatedWeather));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("sunRise");
        sb.append('=');
        sb.append(((this.sunRise == null)?"<null>":this.sunRise));
        sb.append(',');
        sb.append("sunSet");
        sb.append('=');
        sb.append(((this.sunSet == null)?"<null>":this.sunSet));
        sb.append(',');
        sb.append("timezoneName");
        sb.append('=');
        sb.append(((this.timezoneName == null)?"<null>":this.timezoneName));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("sources");
        sb.append('=');
        sb.append(((this.sources == null)?"<null>":this.sources));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("locationType");
        sb.append('=');
        sb.append(((this.locationType == null)?"<null>":this.locationType));
        sb.append(',');
        sb.append("woeid");
        sb.append('=');
        sb.append(((this.woeid == null)?"<null>":this.woeid));
        sb.append(',');
        sb.append("lattLong");
        sb.append('=');
        sb.append(((this.lattLong == null)?"<null>":this.lattLong));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
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
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.sources == null)? 0 :this.sources.hashCode()));
        result = ((result* 31)+((this.lattLong == null)? 0 :this.lattLong.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.woeid == null)? 0 :this.woeid.hashCode()));
        result = ((result* 31)+((this.locationType == null)? 0 :this.locationType.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.consolidatedWeather == null)? 0 :this.consolidatedWeather.hashCode()));
        result = ((result* 31)+((this.sunSet == null)? 0 :this.sunSet.hashCode()));
        result = ((result* 31)+((this.timezoneName == null)? 0 :this.timezoneName.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sunRise == null)? 0 :this.sunRise.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Weather) == false) {
            return false;
        }
        Weather rhs = ((Weather) other);
        return ((((((((((((((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent)))&&((this.sources == rhs.sources)||((this.sources!= null)&&this.sources.equals(rhs.sources))))&&((this.lattLong == rhs.lattLong)||((this.lattLong!= null)&&this.lattLong.equals(rhs.lattLong))))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.woeid == rhs.woeid)||((this.woeid!= null)&&this.woeid.equals(rhs.woeid))))&&((this.locationType == rhs.locationType)||((this.locationType!= null)&&this.locationType.equals(rhs.locationType))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.consolidatedWeather == rhs.consolidatedWeather)||((this.consolidatedWeather!= null)&&this.consolidatedWeather.equals(rhs.consolidatedWeather))))&&((this.sunSet == rhs.sunSet)||((this.sunSet!= null)&&this.sunSet.equals(rhs.sunSet))))&&((this.timezoneName == rhs.timezoneName)||((this.timezoneName!= null)&&this.timezoneName.equals(rhs.timezoneName))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sunRise == rhs.sunRise)||((this.sunRise!= null)&&this.sunRise.equals(rhs.sunRise))));
    }

}
