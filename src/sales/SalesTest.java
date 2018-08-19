package sales;

public class SalesTest {
    public static void main(String[] args) {
        CarSale car1 = new CarSale("Ferrari", 4, 300_000);
        CarSale car2 = new CarSale("Dacia", 10, 10_000);
        PaperclipSale sale1 = new PaperclipSale("silver", 1.55, 1_000);
        PaperclipSale sale2 = new PaperclipSale("red", 1.22, 3_000);
        Sallable[] sales = {car1, car2, sale1,sale2};
        for (Sallable sale:sales){
            System.out.println("  " + sale);
        }

        System.out.println("cheapest item: " + Sallable.cheapest(sales));
        System.out.println("total cost: " + Sallable.totalCost(sales));
    }

}
