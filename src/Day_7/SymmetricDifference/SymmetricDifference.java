package Day_7.SymmetricDifference;
import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
public class SymmetricDifference {
    public static Set<Integer>symmetricDifference(Set<Integer>set1,Set<Integer>set2){
        Set<Integer>difference=new HashSet<>(set1);
        difference.addAll(set2);
        Set<Integer>interaction= new HashSet<>(set1);
        interaction.retainAll(set2);
        difference.removeAll(interaction);
        return difference;

    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        Set<Integer> result = symmetricDifference(set1, set2);
        System.out.println("Symmetric difference :" + result);
    }


}
