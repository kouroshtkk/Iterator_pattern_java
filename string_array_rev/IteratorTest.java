package string_array_rev;

public class IteratorTest {
    public static void main(String[] args) {
        System.out.println("Test 1:");
        var it = new StringArrayRevIterator(new String[] { "a", "b", "c" });
        while (it.hasNext())
            System.out.println(it.next()); // stampa le tre linee c b a

        System.out.println("\nTest 2:");
        it = new StringArrayRevIterator("one", "two", "three");
        while (it.hasNext())
            System.out.println(it.next()); // stampa le tre linee three two one

        System.out.println("\nTest 3 (empty):");
        it = new StringArrayRevIterator(new String[0]);
        while (it.hasNext())
            System.out.println(it.next()); // non stampa nulla
    }
}
