package Day_5;
import java.util.List;

public class SumCalculator {
    public static<T extends Number> double sumList(List<T>list){
    double sum = 0.0;
    for (T element : list){
        sum+=element.doubleValue();
    }
    return sum;

    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,5);
        System.out.println("Sum of integers: " +sumList(intList));
        List<Double> doubleList=List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        System.out.println("Sum of doubles: " +sumList(doubleList));

    }


}
