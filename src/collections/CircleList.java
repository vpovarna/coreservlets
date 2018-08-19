package collections;

import shapes.*;
import java.util.List;

import java.util.ArrayList;

public class CircleList {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        while (Math.random() > 0.01){
            Circle c = new Circle(10 * Math.random());
            list.add(c.getArea());
        }
        System.out.println(list);
        System.out.println(list.size());
    }

}
