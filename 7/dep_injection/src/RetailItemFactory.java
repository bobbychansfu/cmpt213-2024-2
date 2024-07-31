public class RetailItemFactory {
    public static RetailItem getRetailItem(String itemName) {
        if (itemName.equals("CD")) {
            return new CompactDisc();
        }
        else if (itemName.equals("DVD")) {
            return new DvdMovie();
        }
        else {
            return new RetailItem();
        }
    }
}
