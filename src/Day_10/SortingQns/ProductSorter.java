package Day_10.SortingQns;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 class Product {
     String productName;
     String productCategory;
     double productPrice;
     public Product(String productName, String productCategory, double productPrice){
         this.productName=productName;
         this.productCategory=productCategory;
         this.productPrice=productPrice;
     }
}
public class ProductSorter{
    public static void main(String[] args) {
        List<Product>products=new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 800));
        products.add(new Product("Shoes", "Fashion", 50));
        products.add(new Product("Headphones", "Electronics", 100));
        products.add(new Product("T-shirt", "Fashion", 20));
        sortProducts(products);
        for (Product p : products){
            System.out.println(p.productName + " - " + p.productCategory + " - $" + p.productPrice);

        }
    }
    public static void sortProducts(List<Product>products){
        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2){
                int catagoryComparision=p1.productCategory.compareTo(p2.productCategory);
                if(catagoryComparision!=0){
                    return catagoryComparision;
                }
                return Double.compare(p1.productPrice,p2.productPrice);
            }
        });

    }
}
