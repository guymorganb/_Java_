package murach.signup;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.util.List;

public class SignupApp extends Application {

    private TextField nameField = new TextField();
    private DatePicker dobPicker = new DatePicker();
    private ToggleGroup genderToggle = new ToggleGroup();
    private ListView<String> genreListView = new ListView<>();
    private ComboBox<String> countryCombo = new ComboBox<>();
    private TextArea descriptionArea = new TextArea();
    private CheckBox notifyCheckBox = new CheckBox("Receive notifications");

    @Override
    public void start(Stage stage) {
        stage.setTitle("Social Media Signup");
        VBox vbox = new VBox(10);
        
        // name
        HBox nameBox = new HBox(10);        
        Label nameLabel = new Label("Name: ");
        nameField.setMinWidth(209);
        nameBox.getChildren().add(nameLabel);
        nameBox.getChildren().add(nameField);
        vbox.getChildren().add(nameBox);
    
        // date of birth (DOB)
        HBox dobBox = new HBox(10);
        Label dobLabel = new Label("Date of Birth: ");
        dobBox.getChildren().add(dobLabel);
        dobBox.getChildren().add(dobPicker);
        vbox.getChildren().add(dobBox);

        // gender
        HBox genderBox = new HBox(10);        
        Label genderLabel = new Label("Gender: ");
        
        RadioButton maleButton = new RadioButton("Male");
        maleButton.setToggleGroup(genderToggle);
        maleButton.setSelected(true);
        RadioButton femaleButton = new RadioButton("Female");
        femaleButton.setToggleGroup(genderToggle);
        RadioButton otherButton = new RadioButton("Other");
        otherButton.setToggleGroup(genderToggle);

        genderBox.getChildren().add(genderLabel);
        genderBox.getChildren().add(maleButton);
        genderBox.getChildren().add(femaleButton);
        genderBox.getChildren().add(otherButton);
        vbox.getChildren().add(genderBox);

        // country
        Label countryLabel = new Label("Country: ");
        countryCombo.setPromptText("Select Country");
        String[] countries = {"United States", "Canada", "Mexico"};
        for (String country : countries) {
            countryCombo.getItems().add(country);            
        }
        vbox.getChildren().add(countryLabel);
        vbox.getChildren().add(countryCombo);

        // movie genres
        Label movieLabel = new Label("Favorite Movie Genres: ");
        genreListView.getSelectionModel()
                 .setSelectionMode(SelectionMode.MULTIPLE);
        String[] genres = {"Action", "Comedy", "Sci-Fi", "Horror", "Drama"};
        for (String genre : genres) {
            genreListView.getItems().add(genre);            
        }
        genreListView.setPrefHeight(genres.length * 24);
        vbox.getChildren().add(movieLabel);
        vbox.getChildren().add(genreListView);

        // description
        Label descriptionLabel = new Label("Profile Description: ");   
        descriptionArea.setPrefColumnCount(35);
        descriptionArea.setPrefRowCount(4);
        descriptionArea.setWrapText(true);
        ScrollPane descriptionScroll = new ScrollPane(descriptionArea);
        vbox.getChildren().add(descriptionLabel);
        vbox.getChildren().add(descriptionScroll);

        // notification
        vbox.getChildren().add(notifyCheckBox);

        // button
        Button signUpButton = new Button("Sign Up");        
        signUpButton.setOnAction(event -> signUpButtonClicked());
        vbox.getChildren().add(signUpButton);

        vbox.setPadding(new Insets(10, 10, 0, 10));
        Scene scene = new Scene(vbox, 450, 510);
        stage.setScene(scene);
        stage.show();
    }

    public void signUpButtonClicked() {
        // preprocess a few controls
        RadioButton selectedGender = 
                (RadioButton) genderToggle.getSelectedToggle();

        String country = countryCombo.getSelectionModel().getSelectedItem();

        String genresStr = "";
        List<String> genres = 
                genreListView.getSelectionModel().getSelectedItems();  
        for(String genre : genres) {
            genresStr += genre + " ";
        }        
        
        String notifications;
        if(notifyCheckBox.isSelected()) {
            notifications = "On";
        }
        else {
            notifications = "Off";
        }

        // build output string
        String outputString = 
            "Name: " + nameField.getText() + "\n" +
            "DOB: " + dobPicker.getValue() + "\n" +
            "Gender: " + selectedGender.getText() + "\n" +
            "Country: " + country + "\n" +
            "Favorite movie genres: " + genresStr + "\n" +
            "Profile description: " + descriptionArea.getText() + "\n" +
            "Notifications: " + notifications + "\n";

        // display output string
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Signup Info");
        alert.setHeaderText("Signup Confirmation");
        alert.setContentText(outputString);        
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}