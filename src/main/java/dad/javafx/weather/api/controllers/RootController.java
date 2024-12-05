package dad.javafx.weather.api.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private TabPane root;

    public RootController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootControllerView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        root.getTabs().clear();

        SearchController searchController = new SearchController();
        Tab searchTab = new Tab("Search");
        searchTab.setContent(searchController.getRoot());

        HistoryController historyController = new HistoryController();
        Tab historyTab = new Tab("History");
        historyTab.setContent(historyController.getRoot());

        root.getTabs().addAll(searchTab, historyTab);
    }

    public TabPane getRoot() {
        return root;
    }
}
