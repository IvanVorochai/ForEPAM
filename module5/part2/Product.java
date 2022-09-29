package module5.part2;

public enum Product {
    Milk1("Молоко 1.5%", 1.50),
    Milk2("Молоко 2.5%", 2.10),
    Milk3("Молоко 3.5%", 2.60),
    Cheese1("Сыр Российский", 3.50),
    Cheese2("Сыр Эдам", 3.66),
    Cheese3("Сыр Мастдай", 10.99);

    String character;
    double price;

    Product(String character, double price) {
        this.character = character;
        this.price = price;
    }

    public String getCharacter() {
        return character;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "character='" + character + '\'' +
                ", price=" + price +
                '}';
    }
}
