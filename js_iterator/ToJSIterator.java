package js_iterator;

import java.util.Iterator;

public class ToJSIterator<E> implements JSIterator<E> {
    // (b) definire in ToJSIterator<E> il/i campo/i strettamente necessario/i 
    // per una corretta implementazione della classe, insieme ai loro possibili invarianti.
    private final Iterator<E> it; // L'iteratore Java da adattare.

    // (c) definire in ToJSIterator<E> il/i costruttore/i strettamente necessario/i 
    // per una corretta implementazione della classe.
    public ToJSIterator(Iterator<E> it){
        this.it = it;
    }

    // (d) definire in ToJSIterator<E> il metodo next() necessario 
    // per una corretta implementazione della classe.
    @Override
    public JSIteratorResult<E> next() {
        if (it.hasNext()) {
            return new JSIteratorResultRecord<>(it.next(), false);
        }
        return new JSIteratorResultRecord<>(null, true);
    }
}
