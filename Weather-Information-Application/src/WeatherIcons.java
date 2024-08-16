import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WeatherIcons {
    public static Image getWeatherIcon(String weatherDescription) {
        return switch (weatherDescription.toLowerCase()) {
            case "clear sky" -> new Image("clear_sky.png");
            case "few clouds" -> new Image("few_clouds.png");
            // Add more cases as needed
            default -> new Image("default.png");
        };
    }
}
