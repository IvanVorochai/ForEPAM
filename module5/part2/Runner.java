package module5.part2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        List<Sale.Goods> goodsList1 = new ArrayList<>();
        goodsList1.add(new Sale().new Goods(Product.Cheese1));
        goodsList1.add(new Sale().new Goods(Product.Cheese2));
        goodsList1.add(new Sale().new Goods(Product.Milk1));
        goodsList1.add(new Sale().new Goods(Product.Milk3));

        Sale check1 = new Sale(goodsList1);
        check1.bill();
    }
}