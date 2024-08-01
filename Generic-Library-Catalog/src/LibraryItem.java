public class LibraryItem<T> {
    private T itemID;
    private String title;
    private String author;

    public LibraryItem(T itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    public T getItemID() {
        return itemID;
    }

    public void setItemID(T itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "itemID=" + itemID +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
