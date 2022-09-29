package module4.part2.task4;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.
public class BillAggregator {
    private List<Bill> billList;

    public BillAggregator() {
    }

    public BillAggregator(List<Bill> billList) {
        this.billList = billList;
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public Bill block(String billNumber) {
        for (Bill bill : billList) {
            if (billNumber.equals(bill.getBillNumber())) {
                bill.setBillStatus(false);
                return bill;
            }
        }
        return null;
    }

    public Bill unlock(String billNumber) {
        for (Bill bill : billList) {
            if (billNumber.equals(bill.getBillNumber())) {
                bill.setBillStatus(true);
                return bill;
            }
        }
        return null;
    }

    public void toFind(String idClient) {
        for (Bill client : billList) {
            if (idClient.equals(client.getIdClient())) {
                System.out.print(client);
            }
        }
    }

    public void sort() {
        billList.sort(new Comparator<Bill>() {
            @Override
            public int compare(Bill o1, Bill o2) {
                return (o1.getMoneyType().compareTo(o2.getMoneyType()));
            }
        });
    }

    public void moneySumAll(String idClient) {
        BigDecimal sumDollar = BigDecimal.valueOf(0);
        BigDecimal sumEuro = BigDecimal.valueOf(0);
        BigDecimal sumBYN = BigDecimal.valueOf(0);
        BigDecimal sumRUB = BigDecimal.valueOf(0);

        for (Bill bill : billList) {
            if (idClient.equals(bill.getIdClient())) {
//                if (bill.getMoneyType() == MoneyType.DOLLAR) {
//                    sumDollar = sumDollar.add(bill.getBalance());
//                } else if (bill.getMoneyType() == MoneyType.EURO) {
//                    sumEuro = sumEuro.add(bill.getBalance());
//                } else if (bill.getMoneyType() == MoneyType.RUB) {
//                    sumRUB = sumRUB.add(bill.getBalance());
//                } else if (bill.getMoneyType() == MoneyType.BUN) {
//                    sumBUN = sumBUN.add(bill.getBalance());
//                }
                switch (bill.getMoneyType()) {
                    case DOLLAR:
                        sumDollar = sumDollar.add(bill.getBalance());
                        break;
                    case EURO:
                        sumEuro = sumEuro.add(bill.getBalance());
                        break;
                    case RUB:
                        sumRUB = sumRUB.add(bill.getBalance());
                        break;
                    case BYN:
                        sumBYN = sumBYN.add(bill.getBalance());
                        break;
                    default:
                        System.out.println("валюты не найдено");
                }
            }
        }
        System.out.println("сумма в BYN: " + sumBYN);
        System.out.println("сумма в USD: " + sumDollar);
        System.out.println("сумма в Euro: " + sumEuro);
        System.out.println("сумма в RUB: " + sumRUB);
    }

    public void moneySumNegativeAndPositive(String idClient) {
        BigDecimal sumDollarPositive = BigDecimal.valueOf(0);
        BigDecimal sumDollarNegative = BigDecimal.valueOf(0);
        BigDecimal sumEuroPositive = BigDecimal.valueOf(0);
        BigDecimal sumEuroNegative = BigDecimal.valueOf(0);
        BigDecimal sumBYNPositive = BigDecimal.valueOf(0);
        BigDecimal sumBYNNegative = BigDecimal.valueOf(0);
        BigDecimal sumRUBPositive = BigDecimal.valueOf(0);
        BigDecimal sumRUBNegative = BigDecimal.valueOf(0);
        BigDecimal zero = BigDecimal.valueOf(0);

        for (Bill bill : billList) {
            if (idClient.equals(bill.getIdClient())) {
                switch (bill.getMoneyType()) {
                    case DOLLAR:
                        if (bill.getBalance().compareTo(zero) == 1) {
                            sumDollarPositive = sumBYNPositive.add(bill.getBalance());
                        } else {
                            sumDollarNegative = sumDollarNegative.add(bill.getBalance());
                        }
                        break;
                    case EURO:
                        if (bill.getBalance().compareTo(zero) == 1) {
                            sumEuroPositive = sumEuroPositive.add(bill.getBalance());
                        } else {
                            sumEuroNegative = sumEuroNegative.add(bill.getBalance());
                        }
                        break;
                    case RUB:
                        if (bill.getBalance().compareTo(zero) == 1) {
                            sumRUBPositive = sumRUBPositive.add(bill.getBalance());
                        } else {
                            sumRUBNegative = sumRUBNegative.add(bill.getBalance());
                        }
                        break;
                    case BYN:
                        if (bill.getBalance().compareTo(zero) == 1) {
                            sumBYNPositive = sumBYNPositive.add(bill.getBalance());
                        } else {
                            sumBYNNegative = sumBYNNegative.add(bill.getBalance());
                        }
                        break;
                    default:
                        System.out.println("валюты не найдено");
                }
            }
        }
        System.out.println("положительная сумма в BYN: " + sumBYNPositive);
        System.out.println("отрицательная сумма в BYN: " + sumBYNNegative);
        System.out.println("положительная сумма в USD: " + sumDollarPositive);
        System.out.println("отрицательная сумма в USD: " + sumDollarNegative);
        System.out.println("положительная сумма в Euro: " + sumEuroPositive);
        System.out.println("отрицательная сумма в Euro: " + sumEuroNegative);
        System.out.println("положительная сумма в RUB: " + sumRUBPositive);
        System.out.println("отрицательная сумма в RUB: " + sumRUBNegative);
    }

    @Override
    public String toString() {
        return "BillAggregator{" +
                "billList=" + billList +
                '}';
    }
}
