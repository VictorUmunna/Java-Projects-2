import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WeatherIcons {
    public static Image getWeatherIcon(String weatherDescription) {
        switch (weatherDescription.toLowerCase()) {
            case "clear sky":
                return new Image("clear_sky.png");
            case "few clouds":
                return new Image("few_clouds.png");
            // Add more cases as needed
            default:
                return new Image("default.png");
        }
    }
}
