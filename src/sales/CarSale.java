package sales;

public class CarSale implements Sallable{
    private final String carName;
    private final double carDiscount;
    private final double listPrice;

    public CarSale(String carName, double carDiscount, double listPrice) {
        this.carName = carName;
        this.carDiscount = carDiscount;
        this.listPrice = listPrice;
    }

    public String getCarName() {
        return carName;
    }

    public double getCarDiscount() {
        return carDiscount;
    }

    public double getListPrice() {
        return listPrice;
    }

    //** Calculate the final price of the car
    // The discound is in persentage */
    @Override
    public double getCost() {
        return(listPrice * (1.0 - carDiscount/100));
    }

    @Override
    public String toString() {
        return  ("Car Name='" + carName + '\'' +
                ", Car Discount=" + carDiscount + "% " +
                ", with the list price=" + listPrice);
    }

}
