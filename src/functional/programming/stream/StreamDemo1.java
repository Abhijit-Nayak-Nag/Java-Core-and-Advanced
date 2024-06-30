package functional.programming.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int pid;
    String name;
    int price;

    public Product(int pid, String name, int price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }



    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}' + "\n";
    }

    public Product() {

    }
}

    public class StreamDemo1 {
        public static void main(String[] args) {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product(111, "monitor", 5000));
            productList.add(new Product(222, "Keyboard", 4000));
            productList.add(new Product(333, "Mouse", 3000));
            List<Product>filteredList= productList.stream().filter(p->p.price>3000).toList();
            System.out.println(filteredList);


            StreamDemo1 d= new StreamDemo1();
            System.out.println(d.hello());
            String s= d.hello();
            System.out.println(s);



        }

        public String  hello(){
            return "hello";

//           return name;

        }
    }
