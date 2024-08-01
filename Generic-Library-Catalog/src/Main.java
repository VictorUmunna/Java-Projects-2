import java.util.Scanner;

public class Main {
    private static GenericCatalog<String> catalog = new GenericCatalog<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    viewCatalog();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nLibrary Catalog Menu:");
        System.out.println("1. Add a new library item");
        System.out.println("2. Remove an item");
        System.out.println("3. View the current catalog");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addItem() {
        System.out.print("Enter item ID: ");
        String itemID = scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        LibraryItem<String> item = new LibraryItem<>(itemID, title, author);
        catalog.addItem(item);
        System.out.println("Item added successfully.");
    }

    private static void removeItem() {
        System.out.print("Enter item ID to remove: ");
        String itemID = scanner.nextLine();

        try {
            catalog.removeItem(itemID);
            System.out.println("Item removed successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void viewCatalog() {
        System.out.println("\nCurrent Library Catalog:");
        for (LibraryItem<String> item : catalog.getAllItems()) {
            System.out.println(item);
        }
    }
}
