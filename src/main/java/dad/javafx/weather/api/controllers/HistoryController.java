package dad.javafx.weather.api.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import dad.javafx.weather.Weather;
import dad.javafx.weather.WeatherState;
import dad.javafx.weather.api.ZonedDateTimeDeserializer;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.ResourceBundle;

public class HistoryController implements Initializable {

    @FXML
    private BorderPane root;

    @FXML
    private Button clearButton;

    @FXML
    private TableView<Weather> historyTable;

    @FXML
    private TableColumn<Weather, String> locationColumn;

    @FXML
    private TableColumn<Weather, String> timeColumn;

    @FXML
    private TableColumn<Weather, String> weatherStateColumn;

    public HistoryController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/HistoryView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void onClearAction(ActionEvent event) {
        historyTable.getItems().clear();

        deleteHistory();
    }

    private static void deleteHistory() {
        // remove data from json file
        Path jsonFilePath = Paths.get("history.json");
        try {
            Files.deleteIfExists(jsonFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // initialize columns
        locationColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getLocation()));
        timeColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTime().toString()));
        weatherStateColumn.setCellValueFactory(data -> {
            WeatherState state = data.getValue().getState();
            return new SimpleStringProperty(state != null ? state.toString() : "Unknown");
        });

        //bind clearButton with historyTable
        if (historyTable.getItems().isEmpty()) {
            clearButton.setDisable(true);
        } else {
            clearButton.setDisable(false);
        }

        // initialize table with data from json file
        readHistory();
    }

    private void readHistory() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(ZonedDateTime.class, new ZonedDateTimeDeserializer())
                .create();
        Path jsonFilePath = Paths.get("history.json");

        try {
            if (Files.exists(jsonFilePath)) {
                String jsonContent = Files.readString(jsonFilePath);
                List<Weather> weatherHistory = gson.fromJson(jsonContent, new TypeToken<List<Weather>>() {}.getType());

                if (weatherHistory != null) {
                    historyTable.getItems().addAll(weatherHistory);
                }
            }
        } catch (IOException | JsonSyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public TableView<Weather> getHistoryTable() {
        return historyTable;
    }

    public BorderPane getRoot() {
        return root;
    }
}