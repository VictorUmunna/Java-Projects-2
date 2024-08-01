import java.util.ArrayList;
import java.util.List;

public class GenericCatalog<T> {
    private List<LibraryItem<T>> items;

    public GenericCatalog() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem<T> item) {
        items.add(item);
    }

    public void removeItem(T itemID) throws Exception {
        boolean removed = items.removeIf(item -> item.getItemID().equals(itemID));
        if (!removed) {
            throw new Exception("Item with ID " + itemID + " not found.");
        }
    }

    public LibraryItem<T> getItem(T itemID) {
        for (LibraryItem<T> item : items) {
            if (item.getItemID().equals(itemID)) {
                return item;
            }
        }
        return null;
    }

    public List<LibraryItem<T>> getAllItems() {
        return items;
    }
}
