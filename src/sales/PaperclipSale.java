package sales;

public class PaperclipSale implements Sallable{
    private String color;
    private Double price;
    private int nrBoxes;

    public PaperclipSale(String color, Double price, int nrBoxes) {
        this.color = color;
        this.price = price;
        this.nrBoxes = nrBoxes;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }

    public int getNrBoxes() {
        return nrBoxes;
    }

    @Override
    public double getCost() {
        return (price * nrBoxes);
    }

    @Override
    public String toString() {
        return "PaperclipSale{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", nrBoxes=" + nrBoxes +
                '}';
    }
}
