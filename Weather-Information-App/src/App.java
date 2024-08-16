import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WeatherApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Weather Information App");

        Label locationLabel = new Label("Enter Location:");
        TextField locationField = new TextField();
        Button fetchButton = new Button("Get Weather");
        Label weatherInfo = new Label();

        fetchButton.setOnAction(e -> {
            String location = locationField.getText();
            // Fetch weather data and update weatherInfo label
        });

        VBox vbox = new VBox(locationLabel, locationField, fetchButton, weatherInfo);
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
