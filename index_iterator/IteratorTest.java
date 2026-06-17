package index_iterator;

import static java.util.Arrays.asList;

public class IteratorTest {
    public static void main(String[] args) {
        var l = asList("a", "b", "c"); // crea la lista ["a";"b";"c"]
        var it = new IndexIterator<>(l.iterator());
        while (it.hasNext()) {
            System.out.println(it.next()); // stampa le tre linee (0,a) (1,b) (2,c)
        }
    }
}
