package module4.part2.task5;

import module4.part2.task5.forEnums.*;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class TouristHotel {

    private TourTo tourTo;
    private Days days;
    private Transport transport;
    private Eat eat;
    private Relax relax;
    private Excursion excursion;
    private Treatment treatment;
    private Shoping shoping;
    private Cruise cruise;
    private StarsNumber starsNumber;
    private Persons persons;
    private int price;

    public TouristHotel() {
    }

    public TouristHotel(TourTo tourTo, Days days, Transport transport, Eat eat, Relax relax, Excursion excursion,
                        Treatment treatment, Shoping shoping, Cruise cruise, StarsNumber starsNumber, Persons persons,
                        int price) {
        this.tourTo = tourTo;
        this.days = days;
        this.transport = transport;
        this.eat = eat;
        this.relax = relax;
        this.excursion = excursion;
        this.treatment = treatment;
        this.shoping = shoping;
        this.cruise = cruise;
        this.starsNumber = starsNumber;
        this.persons = persons;
        this.price = price;
    }

    public TourTo getTourTo() {
        return tourTo;
    }

    public void setTourTo(TourTo tourTo) {
        this.tourTo = tourTo;
    }

    public Days getDays() {
        return days;
    }

    public void setDays(Days days) {
        this.days = days;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public Relax getRelax() {
        return relax;
    }

    public void setRelax(Relax relax) {
        this.relax = relax;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Shoping getShoping() {
        return shoping;
    }

    public void setShoping(Shoping shoping) {
        this.shoping = shoping;
    }

    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }

    public StarsNumber getStarsNumber() {
        return starsNumber;
    }

    public void setStarsNumber(StarsNumber starsNumber) {
        this.starsNumber = starsNumber;
    }

    public Persons getPersons() {
        return persons;
    }

    public void setPersons(Persons persons) {
        this.persons = persons;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TouristHotel{" +
                "tourTo=" + tourTo +
                ", days=" + days +
                ", transport=" + transport +
                ", eat=" + eat +
                ", relax=" + relax +
                ", excursion=" + excursion +
                ", treatment=" + treatment +
                ", shoping=" + shoping +
                ", cruise=" + cruise +
                ", starsNumber=" + starsNumber +
                ", persons=" + persons +
                ", price=" + price +
                '}';
    }
}
