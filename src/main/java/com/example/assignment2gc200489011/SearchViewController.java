package com.example.assignment2gc200489011;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class SearchViewController implements Initializable
{
    @FXML
    private TextField searchTextField;
    @FXML
    private ListView<Car> resultsListView;
    @FXML
    private Label msgLabel;



    @FXML
    void searchButtonClicked(ActionEvent event)
    {


        msgLabel.setText("");
        List<Car> searchResults = APIManager.Instance().getCarFromRapidAPIByMake(searchTextField.getText());
        resultsListView.getItems().clear();
        if(searchResults != null)
        {
            resultsListView.getItems().addAll(searchResults);
            msgLabel.setText("");

        }
        else
        {
            msgLabel.setText("Car not found!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        msgLabel.setText("");
        resultsListView.getSelectionModel().selectedItemProperty().addListener((obs, oldCarSelected, newCarSelected) ->{
            if(searchTextField.getText() == null){
                resultsListView.getItems().clear();
                msgLabel.setText("Please enter make");
            }
        });
    }
    @FXML
    private void getDetails(ActionEvent event) throws IOException {
        if(resultsListView.getSelectionModel().getSelectedItem() != null) {
            String id = String.valueOf(resultsListView.getSelectionModel().getSelectedItem().getId());
            SceneManager.Instance().changeScene(event, "details-view.fxml");

        }
    }
}
