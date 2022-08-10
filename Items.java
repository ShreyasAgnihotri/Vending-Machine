public class Items {
    private String items;
    private double price;
    private int quantity;
    public Items(String items,double price,int quantity){
        this.items = items;
        this.price = price;
        this.quantity = quantity;
    }
    public Items(Items source){
        this.items = source.items;
        this.price = source.price;
        this.quantity = source.quantity;
    }
    public void setItem(String items){
        this.items=items;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public String getItems(){
        return this.items;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String toString(){
        return this.getItems() + ":" + this.getPrice() + "(" + this.getQuantity() + ")";
    }
}
