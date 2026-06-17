package smart_iterator;

public class IteratorTest {
    /*
    stampa
    a
    a
    null
    null
    b
    b
    */
    public static void main(String[] args) {
        var arr = new String[] { "a", null, "b" }; // crea l'array ["a",null,"b"]
        var smartIt = new GetSmartIterator<>(arr); // ottiene un iteratore smart per arr
        while (smartIt.moveNext()) {
            System.out.println(smartIt.current());
            System.out.println(smartIt.current());
        }
    }
}
