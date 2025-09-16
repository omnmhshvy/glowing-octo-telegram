package FunctionalInterface;
import java.util.Comparator;

public class ComparatorImpl {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return a.compareTo(b);
            }
        };

        System.out.println(comp.compare(18,12));
        Comparator<Integer> complam = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println(complam.compare(10,11));

        Comparator<Integer> complam_np = (a,b) -> a.compareTo(b);
        System.out.println(complam_np.compare(9,10));
    }
}

