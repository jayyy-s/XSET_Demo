package demo.xset.xset_demo.shop;

public class ShopItemCard {
    private final int imageSource;
    private final String itemName;
    private final String itemPrice;
;
    public ShopItemCard(int imageSource, String itemName, String itemPrice) {
        this.imageSource = imageSource;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getImageSource() {
        return imageSource;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }
}
