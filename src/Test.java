import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int liczba = random.nextInt(1000);
            set.add(liczba);
        }

        System.out.println("Najmniejsza liczba to: " + ((TreeSet<Integer>) set).first());

        System.out.println("Największa liczba to: " + ((TreeSet<Integer>) set).last());

        Iterator<Integer> iterator = set.iterator();
        double suma = 0;
        while (iterator.hasNext()){
            Integer x = iterator.next();
            suma = suma + x;
        }
        double srednia = suma / set.size();
        System.out.println("Srednia wynosi: " + srednia);

        System.out.print("Liczby większe od średniej: ");
        Iterator<Integer> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            Integer y = iterator1.next();
            if(y > srednia){
                System.out.print(y + " ");
            }
        }

    }
}
