package hi;

/** item info */
class Item
{
    private String title;
    private double price;
    private int quantity;
    private ShoppingCart.Type type;

    public Item(String title, double price, int quantity, ShoppingCart.Type type) {
    this.title=title;
    this.price=price;
    this.quantity=quantity;
    this.type=type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ShoppingCart.Type getType() {
        return type;
    }

    public void setType(ShoppingCart.Type type) {
        this.type = type;
    }
}
