package OOPS_Practice.Task3;

public class TestProduct {
    public static void main ( String[] args ) {
        Product product1 = new Product (123,5400, 2000);
        Product product2 = new Product (124,7000, 1960);
        Product product3 = new Product (125,5400, 2034);

        System.out.println ("----------------Product According to the price----------------------");
        if(Math.min(product1.getProductPrice (),Math.min(product2.getProductPrice(),product3.getProductPrice()))==product1.getProductId ()){
            product1.displayProductDetails ();
        }
        if(Math.min(product1.getProductPrice (),Math.min(product2.getProductPrice(),product3.getProductPrice()))==product2.getProductId ()){
            product2.displayProductDetails ();
        }
        else{
            product3.displayProductDetails ();
        }

        System.out.println ("----------------Product According to the launch----------------------");


        if(Math.max(product1.getLaunchDate (), Math.max (product2.getLaunchDate (), product3.getLaunchDate ()))==product1.getLaunchDate ()){
            product1.displayProductDetails ();
        }
        if(Math.max(product1.getLaunchDate (), Math.max (product2.getLaunchDate (), product3.getLaunchDate ()))==product2.getLaunchDate ()){
            product2.displayProductDetails ();
        }
        else{
            product3.displayProductDetails ();
    }

    }

    public int minimumPrice(int a, int b , int c){
        return Math.min(a,Math.min (b,c));
    }

    public int maxLaunchDate(int a,int b, int c){
        return Math.max(a,Math.max (b,c));
    }

}
