public class product {
    String productName;
    double price;
    int quantityInStock;

    public void display(){
        System.out.println("Product name : "+productName);
        System.out.println("Price of this product :"+price);
        System.out.println("Quantity in Stock : "+quantityInStock);
        System.out.println();
    }
    public static void main(String[] args) {
        product product_1 = new product();
        //For product_1
        product_1.productName="Black sope";
        product_1.price=400;
        product_1.quantityInStock=50;
        product_1.display();

        product product_2 = new product();
        product_2.productName="Wild Stone";
        product_2.price=550;
        product_2.quantityInStock=15;
        product_2.display();
    }
    
}
