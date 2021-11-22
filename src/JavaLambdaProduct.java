import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class JavaLambdaProduct {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(2,"Keyboard", 300f));
        list.add(new Product(3, "Dell Mouse", 170f));
        System.out.println("Sorting on the basis of names ---");
        Collections.sort(list,(p1, p2) ->{
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list){
            System.out.println(p.id+ " " +p.name+ " " +p.price);
        }

        Stream<Product> filtered_product = list.stream().filter(p -> p.price > 300);
        filtered_product.forEach(
                product -> System.out.println(product.name+ ":" + product.price)
        );

    }
}
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

