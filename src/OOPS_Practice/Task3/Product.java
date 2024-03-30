package OOPS_Practice.Task3;

public class Product {
    int productId;
    int productPrice;

    int launchDate;

    public Product ( int productId, int productPrice, int launchDate ) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.launchDate = launchDate;
    }

    public int getProductId ( ) {
        return productId;
    }

    public int getProductPrice ( ) {
        return productPrice;
    }

    public int getLaunchDate ( ) {
        return launchDate;
    }
    public  void displayProductDetails(){
        System.out.println ("["+"Product Id : "+productId + " Product Price : "+productPrice+ " Product Launch Year : "+launchDate+ "]");
    }

}
