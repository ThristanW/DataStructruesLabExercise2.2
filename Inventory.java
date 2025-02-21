import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        // Initialize the items list
        items = new ArrayList<>();
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        items.add(item);
        // Adds an item
    }

    // Method to remove an item from the inventory
    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println(item.getName() + " has been removed from inventory!");
        } else {
            System.out.println(item.getName() + " was not found in inventory!");
        }
        // Removes an item if it exists, if it doesn't then implement proper error handling
    }

    // Method to check if an item exists in the inventory
    public boolean hasItem(Item item) {
        // Checks if an item exists
        return items.contains(item);
    }

    // Method to display all items in the inventory
    public void displayItems() {
        // Displays all items
        if (items.isEmpty()) {
            System.out.println("There is nothing in inventory!");
        } else {
            for (Item item : items) {
                System.out.println(item.getName());
            }
        }
    }

    // Method to get the total number of items
    public int getItemCount() {
        // Gets the total number of items
        return items.size();
    }

    // Method to clear items in inventory
    public void clearInventory() {
        items.clear(); // Clears inventory
        System.out.println("Inventory cleared!");
    }
}
