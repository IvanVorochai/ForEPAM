package module4.part2.task4;

import java.math.BigDecimal;
import java.util.ArrayList;

////4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
////счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
////всем счетам, имеющим положительный и отрицательный балансы отдельно.
public class Runner {
    public static void main(String[] args) {
        ArrayList<Bill> bill = new ArrayList<>();

        bill.add(new Bill("Buratino", "", "", "1000qqq", "10001111QWE", BigDecimal.valueOf(6000.66), MoneyType.DOLLAR, true));
        bill.add(new Bill("Buratino", "", "", "1000qqq", "10001212QWE", BigDecimal.valueOf(-5000.99), MoneyType.EURO, false));
        bill.add(new Bill("Buratino", "", "", "1000qqq", "10001313QWE", BigDecimal.valueOf(4000.01), MoneyType.EURO, true));
        bill.add(new Bill("Buratino", "", "", "1000qqq", "10001414QWE", BigDecimal.valueOf(4000.01), MoneyType.DOLLAR, true));
        bill.add(new Bill("Buratino", "", "", "1000qqq", "10005555QWE", BigDecimal.valueOf(4000.01), MoneyType.EURO, true));
        bill.add(new Bill("Buratino", "", "", "1000qqq", "10008989QWE", BigDecimal.valueOf(-5000.01), MoneyType.RUB, true));
        bill.add(new Bill("Bazilio", "Cat", "Catovich", "1111www", "10002000QWE", BigDecimal.valueOf(200.50), MoneyType.DOLLAR, true));
        bill.add(new Bill("Bazilio", "Cat", "Catovich", "1111www", "10009999QWE", BigDecimal.valueOf(-5000), MoneyType.EURO, false));
        bill.add(new Bill("Alisa", "Lisa", "", "2222L", "10002122QWE", BigDecimal.valueOf(1000), MoneyType.BYN, true));
        bill.add(new Bill("Alisa", "Lisa", "", "2222L", "10002123QWE", BigDecimal.valueOf(2000), MoneyType.BYN, true));
        bill.add(new Bill("Alisa", "Lisa", "", "2222L", "10002124QWE", BigDecimal.valueOf(3000), MoneyType.RUB, true));

        BillAggregator aggregator = new BillAggregator(bill);
        System.out.println(aggregator.block("10002122QWE"));    //block

        System.out.println(aggregator.unlock("10009999QWE"));   //unlock

        aggregator.toFind("1000qqq");       // поиск по idClient

        aggregator.sort();                  // сортировка  по валюте
        System.out.println(aggregator);     //

        aggregator.moneySumAll("1000qqq");      //сумма по всем счетамм
        System.out.println();

        aggregator.moneySumNegativeAndPositive("1000qqq");  //сумма положительная и отрицательная


    }
}
//    public Bill(String clientName, String clientFamily, String clientMiddleName, String idClient,
//                String billNumber, Double balance, String manyType, boolean billStatus)