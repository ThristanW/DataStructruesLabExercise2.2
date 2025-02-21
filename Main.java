public class Main {
    public static void main(String[] args) {
        // Inventory
        Inventory inventory = new Inventory();

        // Items
        Item kazuyaGloves = new Item("Kazuya's Gloves");
        Item devilGene = new Item("Devil Gene");
        Item mishimaKey = new Item("Mishima Zaibatsu Key");
        Item heihachiWig = new Item("Heihachi's Wig");

        // Adding items to inventory
        inventory.addItem(devilGene);
        inventory.addItem(mishimaKey);
        inventory.addItem(heihachiWig);

        // Displaying items in inventory
        System.out.println("\nitems:");
        inventory.displayItems();

        // Checking if items actually exist
        System.out.println("\nChecking for items...");
        System.out.println("Has Devil Gene? " + inventory.hasItem(devilGene));
        System.out.println("Has Heihachi's Wig? " + inventory.hasItem(heihachiWig));
        System.out.println("Has Kazuya's Gloves? " + inventory.hasItem(kazuyaGloves));
        System.out.println("Has Mishima Zaibatsu Key? " + inventory.hasItem(mishimaKey));

        // Removing items
        System.out.println("\nRemoving Devil Gene...");
        inventory.removeItem(devilGene);

        // Displaying items after being removed
        System.out.println("\nitems:");
        inventory.displayItems();

        // Displaying total number of items
        System.out.println("\nTotal items in inventory: " + inventory.getItemCount());

        // Adding another item
        inventory.addItem(kazuyaGloves);

        // Checking items again
        System.out.println("\nChecking for items...");
        System.out.println("Has Devil Gene? " + inventory.hasItem(devilGene));
        System.out.println("Has Heihachi's Wig? " + inventory.hasItem(heihachiWig));
        System.out.println("Has Kazuya's Gloves? " + inventory.hasItem(kazuyaGloves));
        System.out.println("Has Mishima Zaibatsu Key? " + inventory.hasItem(mishimaKey));

        // Displaying items in inventory again
        System.out.println("\nitems:");
        inventory.displayItems();

        // Displaying total number of items
        System.out.println("\nTotal items in inventory: " + inventory.getItemCount());

        // Clearing inventory
        System.out.println("\nClearing inventory...");
        inventory.clearInventory();

        // Displaying items after clearing inventory
        System.out.println("\nitems:");
        inventory.displayItems();
    }
}