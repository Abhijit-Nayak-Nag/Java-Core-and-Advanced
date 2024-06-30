package Day_10.SortingQns;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Products {
    String name;
    int id;
    public Products(String name, int id){
        this.name=name;
        this.id=id;
    }

}
class Factory{
    int id;
    List<Product>products;
    List<Integer>productionRates;
    public Factory(int id){
        this.id=id;
        this.products=new ArrayList<>();
        this.productionRates=new ArrayList<>();
    }
    public void addproduct(Product product, int productRate){
        products.add(product);
        productionRates.add(productRate);
    }
}
class Store{
    int id;
    List<Product>products;
    List<Integer>demandRates;
    public Store(int id){
        this.id=id;
        this.products=new ArrayList<>();
        this.demandRates=new ArrayList<>();
    }
    public void addProduct(Product product, int demandRate){
        products.add(product);
        demandRates.add(demandRate);
    }
}
public class SupplyChainSystem{
    public static void main(String[] args) {
        Products product1= new Products("Product A" , 1);
        Products product2= new Products("Product B" , 2);
        List<Factory>factories=new ArrayList<>();
        factories.add(new Factory(3));
        factories.add(new Factory(1));
        factories.add(new Factory(2));
        Collections.sort(factories,Comparator.comparingInt(factory -> factory.id));
        List<Store>stores=new ArrayList<>();
        stores.add(new Store(2));
        stores.add(new Store(1));
        stores.add(new Store(3));
        Collections.sort(stores, Comparator.comparing(store -> store.id));
        System.out.println("Stored Factories");
        for(Factory factory : factories){
            System.out.println("Factory ID: " +factory.id);
        }
        System.out.println("\nSorted Stores: ");
        for(Store store : stores){
            System.out.println("Store ID: " + store.id);
        }
    }
}
