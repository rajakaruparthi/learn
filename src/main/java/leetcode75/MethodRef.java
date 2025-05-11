package leetcode75;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRef {


    public static void main(String[] args) {

        Function<String, Integer> stringIntegerFunction = String::length;
        Integer l = stringIntegerFunction.apply("raja");
        System.out.println(l);

        Function<String, Integer> stringIntegerIntegerBiFunction = Integer::parseInt;
        stringIntegerIntegerBiFunction.apply("123");

        Function<Double, Double> area = r -> Math.PI * r * r;
        Function<Double, Double> calVolume = (x) -> x ;
        Double apply = area.apply(5.0);

    }

}

class CalculateArea {
    private int r;

    public double cal(int r) {
        return Math.PI * r * r;
    }
}
