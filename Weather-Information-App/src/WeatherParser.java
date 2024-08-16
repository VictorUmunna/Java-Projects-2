import org.json.JSONObject;

public class WeatherParser {
    public static String parseWeatherData(String jsonResponse) {
        JSONObject obj = new JSONObject(jsonResponse);
        String weather = obj.getJSONArray("weather").getJSONObject(0).getString("description");
        double temp = obj.getJSONObject("main").getDouble("temp") - 273.15; // Convert from Kelvin to Celsius
        int humidity = obj.getJSONObject("main").getInt("humidity");
        double windSpeed = obj.getJSONObject("wind").getDouble("speed");

        return String.format("Weather: %s\nTemperature: %.2f°C\nHumidity: %d%%\nWind Speed: %.2f m/s", weather, temp, humidity, windSpeed);
    }
}
