package sales;

public interface Sallable {
    double getCost();

    public static Sallable cheapest(Sallable[] items){
        Sallable chapestItem = null;
        double lowerCost = Double.MAX_VALUE;
        for (Sallable item: items){
            double cost = item.getCost();
            if (cost < lowerCost){
                chapestItem = item;
                lowerCost = cost;
            }
        }
        return (chapestItem);
    }

    public static double totalCost(Sallable[] items){
        double total = 0.0;
        for(Sallable item: items){
            total = total + item.getCost();
        }
        return (total);
    }
}
