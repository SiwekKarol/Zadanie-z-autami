public class Product {
    String name;
    String producer;
    double price;
    String category;


    public Product(String name, String producer, double price, String category) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.category = category;
    }

    public Product(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }
}
