import java.util.ArrayList;
import java.util.List;

public class SearchHistory {
    private List<String> history = new ArrayList<>();

    public void addHistory(String location) {
        String timestamp = new java.util.Date().toString();
        history.add(location + " - " + timestamp);
    }

    public List<String> getHistory() {
        return history;
    }
}
