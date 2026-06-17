package js_iterator;

import static java.util.Arrays.asList;

public class IteratorTest {
    public static void main(String[] args) {
        var l = asList("a", "b", "c"); // crea la lista ["a";"b";"c"]
        var javaIt = l.iterator(); // iteratore per la lista l in stile Java
        var jsIt = new ToJSIterator<>(javaIt); // converte in iteratore in stile JavaScript
        var res = jsIt.next();
        
        while (!res.done()) {
            System.out.println(res.value()); // stampa le tre linee a b c
            res = jsIt.next();
        }
    }
}
