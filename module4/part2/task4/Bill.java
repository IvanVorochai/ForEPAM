package module4.part2.task4;

import java.math.BigDecimal;

//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.
public class Bill {

    private String clientName;
    private String clientFamily;
    private String clientMiddleName;
    private String idClient;
    private String billNumber;
    private BigDecimal balance;
    private MoneyType moneyType;
    private boolean billStatus;

    public Bill() {
    }

    public Bill(String clientName, String clientFamily, String clientMiddleName, String idClient, String billNumber,
                BigDecimal balance, MoneyType moneyType, boolean billStatus) {
        this.clientName = clientName;
        this.clientFamily = clientFamily;
        this.clientMiddleName = clientMiddleName;
        this.idClient = idClient;
        this.billNumber = billNumber;
        this.balance = balance;
        this.moneyType = moneyType;
        this.billStatus = billStatus;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientFamily() {
        return clientFamily;
    }

    public void setClientFamily(String clientFamily) {
        this.clientFamily = clientFamily;
    }

    public String getClientMiddleName() {
        return clientMiddleName;
    }

    public void setClientMiddleName(String clientMiddleName) {
        this.clientMiddleName = clientMiddleName;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public MoneyType getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    public boolean isBillStatus() {
        return billStatus;
    }

    public void setBillStatus(boolean billStatus) {
        billStatus = billStatus;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "clientName='" + clientName + '\'' +
                ", clientFamily='" + clientFamily + '\'' +
                ", clientMiddleName='" + clientMiddleName + '\'' +
                ", idClient=" + idClient +
                ", billNumber='" + billNumber + '\'' +
                ", balance=" + balance +
                ", manyType='" + moneyType + '\'' +
                ", BillStatus=" + billStatus +
                '}' + "\n";
    }

}
