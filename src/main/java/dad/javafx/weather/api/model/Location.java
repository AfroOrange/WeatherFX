
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
    "title",
    "location_type",
    "woeid",
    "latt_long"
})
public class Location {

    @JsonProperty("title")
    private String title;
    @JsonProperty("location_type")
    private String locationType;
    @JsonProperty("woeid")
    private Long woeid;
    @JsonProperty("latt_long")
    private String lattLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
        sb.append(Location.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.woeid == null)? 0 :this.woeid.hashCode()));
        result = ((result* 31)+((this.locationType == null)? 0 :this.locationType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.lattLong == null)? 0 :this.lattLong.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return ((((((this.woeid == rhs.woeid)||((this.woeid!= null)&&this.woeid.equals(rhs.woeid)))&&((this.locationType == rhs.locationType)||((this.locationType!= null)&&this.locationType.equals(rhs.locationType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.lattLong == rhs.lattLong)||((this.lattLong!= null)&&this.lattLong.equals(rhs.lattLong))));
    }

}
