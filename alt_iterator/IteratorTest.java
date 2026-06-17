package alt_iterator;

import java.util.Arrays;
import java.util.Collections;

public class IteratorTest {
    public static void main(String[] args) {
        System.out.println("Test 1 (Mixed):");
        var it1 = Arrays.asList(1, 2, 3).iterator();
        var it2 = Arrays.asList(4, 5).iterator();
        var it = new AltIterator<>(it1, it2);
        while(it.hasNext()) System.out.print(it.next() + " "); // stampa 1 4 2 5 3
        System.out.println();

        System.out.println("\nTest 2 (First empty):");
        it1 = Collections.<Integer>emptyIterator();
        it2 = Arrays.asList(4, 5).iterator();
        it = new AltIterator<>(it1, it2);
        while(it.hasNext()) System.out.print(it.next() + " "); // stampa 4 5
        System.out.println();

        System.out.println("\nTest 3 (Second empty):");
        it1 = Arrays.asList(1, 2, 3).iterator();
        it2 = Collections.<Integer>emptyIterator();
        it = new AltIterator<>(it1, it2);
        while(it.hasNext()) System.out.print(it.next() + " "); // stampa 1 2 3
        System.out.println();
    }
}
