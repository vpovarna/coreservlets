package shapes;

public interface Shape {
    double getArea();

    static double sumAreas(Shape[] shapes){
        double sum = 0;
        for(Shape s: shapes){
            sum += s.getArea();
        }
        return (sum);
    }
}
