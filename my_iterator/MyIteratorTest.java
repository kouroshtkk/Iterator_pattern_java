package my_iterator;

import static java.util.Arrays.asList;

/*
stampa
a
a
null
null
b
b
*/
public class MyIteratorTest {
    public static void main(String[] args) {
        var list = asList(new String[]{"a", null, "b"}); // crea la lista ["a",null,"b"]
        var it = list.iterator(); // ottiene un Iterator di list
        var myIt = new GetMyIterator<>(it); // ottiene un MyIterator da it
        
        while (myIt.advance()) {
            System.out.println(myIt.element());
            System.out.println(myIt.element());
        }
    }
}