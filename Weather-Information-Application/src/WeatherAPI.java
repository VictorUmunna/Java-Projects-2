import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAPI {
    private static final String API_KEY = "0225e364b31313756a959cf98a062311";

    public static String getWeatherData(String location) throws Exception {
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + API_KEY;
        @SuppressWarnings("deprecation")
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        connection.disconnect();

        return content.toString();
    }
}
