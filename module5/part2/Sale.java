package module5.part2;

import java.util.List;

public class Sale {
    private List<Goods> goodsList;

    public Sale(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public Sale() {
    }

    void bill() {
        double check = 0;
        for (Goods product : goodsList) {
            System.out.println(product.toString() + " " + product.getProduct().getPrice());
            check += product.getProduct().getPrice();
        }
        System.out.println(check);
    }

    class Goods {
        private Product product;

        public Goods(Product product) {
            this.product = product;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        @Override
        public String toString() {
            return "Goods{" +
                    "product=" + product +
                    '}';
        }
    }
}

