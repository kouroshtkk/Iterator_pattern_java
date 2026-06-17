package smart_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GetSmartIterator<E> implements SmartIterator<E> {
    // (a) definire in GetSmartIterator<E> il/i campo/i strettamente necessario/i 
    // per una corretta implementazione della classe, insieme ai loro possibili invarianti.
    private final E[] data;
    private int index;
    private boolean valid;

    // (b) definire in GetSmartIterator<E> il/i costruttore/i strettamente necessario/i 
    // per una corretta implementazione della classe.
    public GetSmartIterator(E[] array){
        this.data = array;
        this.index = -1; // Suggerimento: inizia prima del primo elemento
        this.valid = false;
    }

    // (c) definire in GetSmartIterator<E> il metodo moveNext() necessario 
    // per una corretta implementazione della classe.
    @Override
    public boolean moveNext() {
        if(index + 1 < data.length){
            index += 1;
            valid = true;
            return true;
        }
        valid = false;
        return false;
    }

    // (d) definire in GetSmartIterator<E> il metodo current() necessario 
    // per una corretta implementazione della classe.
    @Override
    public E current() {
        if(valid){
            return data[index];
        }
        throw new NoSuchElementException();
    }
}
