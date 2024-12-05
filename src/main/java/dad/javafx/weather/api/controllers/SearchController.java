package dad.javafx.weather.api.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import dad.javafx.weather.Weather;
import dad.javafx.weather.WeatherService;
import dad.javafx.weather.WeatherServiceException;
import dad.javafx.weather.WeatherState;
import dad.javafx.weather.api.model.Location;
import javafx.beans.Observable;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.fxml.Initializable;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SearchController implements Initializable {

    private ListProperty<Weather> weatherHistoryList = new SimpleListProperty<>(FXCollections.observableArrayList());

    @FXML
    private Button saveButton;

    @FXML
    private Button searchButton;

    @FXML
    private Label airPressureLabel;

    @FXML
    private Label coordinatesLabel;

    @FXML
    private Label humidityLabel;

    @FXML
    private Label locationLabel;

    @FXML
    private GridPane root;

    @FXML
    private Label sunriseLabel;

    @FXML
    private Label sunsetLabel;

    @FXML
    private Label temperatureLabel;

    @FXML
    private Label timeLabel;

    @FXML
    private Label timeZoneLabel;

    @FXML
    private TextField searchTextField;

    @FXML
    private Label visibilityLabel;

    @FXML
    private Label windDirectionLabel;

    @FXML
    private Label windSpeedLabel;

    @FXML
    void onSaveAction(ActionEvent event) throws IOException {
        try {
            saveDataToJson();
        } catch (Exception e) {
            cantSaveAlert();
            throw new RuntimeException(e);
        }
    }

    private void cantSaveAlert() {
        Alert cantSaveAlert = new Alert(Alert.AlertType.ERROR);
        cantSaveAlert.setTitle("Error");
        cantSaveAlert.setHeaderText(null);
        cantSaveAlert.setContentText("Can't save data");
        cantSaveAlert.showAndWait();
    }

    private void saveDataToJson() {
        Gson gson = new Gson();
        Path jsonFilePath = Paths.get("history.json");

        try {
            if (!Files.exists(jsonFilePath)) {
                Files.createFile(jsonFilePath);
                Files.writeString(jsonFilePath, "[]");
            }

            String jsonContent = Files.readString(jsonFilePath);
            List<Weather> weatherHistory = gson.fromJson(jsonContent, new TypeToken<List<Weather>>() {}.getType());

            if (weatherHistory == null) {
                weatherHistory = new ArrayList<>();
            }

            Weather weather = new Weather();
            weather.setLocation(locationLabel.getText());
            weather.setTime(ZonedDateTime.parse(timeLabel.getText()));
            weather.setState(weather.getState());
            weatherHistory.add(weather);

            String json = gson.toJson(weatherHistory);
            Files.writeString(jsonFilePath, json);
        } catch (IOException | JsonSyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void onSearchAction(ActionEvent event) throws WeatherServiceException {

        if (searchTextField.getText().isEmpty()) {
            emptyAlert();
        } else {
            try {
                getWeatherInfo();
                saveButton.setDisable(false);
            } catch (WeatherServiceException e) {
                notFoundLocationAlert();
            }
            searchTextField.clear();
        }
    }

    private void notFoundLocationAlert() {
        Alert notFoundAlert = new Alert(Alert.AlertType.ERROR);
        notFoundAlert.setTitle("Error");
        notFoundAlert.setHeaderText(null);
        notFoundAlert.setContentText("Location: " + searchTextField.getText() + " not found");
        notFoundAlert.showAndWait();
    }

    public SearchController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SearchView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        saveButton.setDisable(true);

        // bind searchField with searchButton
        searchButton.disableProperty().bind(searchTextField.textProperty().isEmpty());
    }

    public GridPane getRoot() {
        return root;
    }

    private void emptyAlert() {
        Alert emptyAlert = new Alert(Alert.AlertType.ERROR);
        emptyAlert.setTitle("Error");
        emptyAlert.setHeaderText(null);
        emptyAlert.setContentText("Please, enter a location");
        emptyAlert.showAndWait();
    }

    private void getWeatherInfo() throws WeatherServiceException {
        WeatherService service = new WeatherService();
        service.getWeather(searchTextField.getText());

        locationLabel.setText(service.getWeather(searchTextField.getText()).getLocation());
        coordinatesLabel.setText(service.getWeather(searchTextField.getText()).getLatitude() + ", " + service.getWeather(searchTextField.getText()).getLongitude());
        timeLabel.setText(service.getWeather(searchTextField.getText()).getTime().toString());
        sunriseLabel.setText(service.getWeather(searchTextField.getText()).getSunrise().toString());
        sunsetLabel.setText(service.getWeather(searchTextField.getText()).getSunset().toString());
        timeZoneLabel.setText(service.getWeather(searchTextField.getText()).getTimeZone());
        temperatureLabel.setText(service.getWeather(searchTextField.getText()).getTemperature().toString());
        airPressureLabel.setText(service.getWeather(searchTextField.getText()).getAirPressure().toString());
        windDirectionLabel.setText(service.getWeather(searchTextField.getText()).getWind().getDirectionCompass().toString());
        humidityLabel.setText(service.getWeather(searchTextField.getText()).getHumidity().toString());
        visibilityLabel.setText(service.getWeather(searchTextField.getText()).getVisibility().toString());
    }


}
