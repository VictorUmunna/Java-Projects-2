import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;

public class BackgroundChanger {
    public static Background getBackground() {
        int hour = java.time.LocalTime.now().getHour();
        String imageUrl = (hour >= 6 && hour < 18) ? "day_background.png" : "night_background.png";
        return new Background(new BackgroundImage(new Image(imageUrl), null, null, null, new BackgroundSize(100, 100, true, true, true, true)));
    }
}
