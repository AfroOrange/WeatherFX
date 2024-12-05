package dad.javafx.weather.api;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeDeserializer implements JsonDeserializer<ZonedDateTime> {
    @Override
    public ZonedDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        JsonObject jsonObject = json.getAsJsonObject();
        JsonObject dateTime = jsonObject.getAsJsonObject("dateTime");
        JsonObject date = dateTime.getAsJsonObject("date");
        JsonObject time = dateTime.getAsJsonObject("time");
        JsonObject offset = jsonObject.getAsJsonObject("offset");

        LocalDateTime localDateTime = LocalDateTime.of(
                date.get("year").getAsInt(),
                date.get("month").getAsInt(),
                date.get("day").getAsInt(),
                time.get("hour").getAsInt(),
                time.get("minute").getAsInt(),
                time.get("second").getAsInt(),
                time.get("nano").getAsInt()
        );

        ZoneOffset zoneOffset = ZoneOffset.ofTotalSeconds(offset.get("totalSeconds").getAsInt());

        return ZonedDateTime.of(localDateTime, zoneOffset);
    }
}