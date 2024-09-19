class customer{
    public String userId;;
    private String password;

    public  customer(String userId, String password){
        this.userId=userId;
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void display(){

    }
}
class Item{
    public String itemName;
    private double price;

    public Item(String itemName,double price){
        this.itemName=itemName;
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void display(){

    }
}
class BuyItem{
    private String buyDate;
    private int quantity;

    public BuyItem(String buyDate,int quantity){
        this.buyDate=buyDate;
        this.quantity=quantity;
    }
    public String getBuydate(){
        return buyDate;
    }
    public int getQuantity(){
        return quantity;
    }
    public void display(){
        
    }
}
public class cus {
    
}
