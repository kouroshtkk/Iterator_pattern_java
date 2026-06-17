package string_array_rev;

import java.util.Iterator;
import java.util.NoSuchElementException;
import static java.util.Objects.requireNonNull;

public class StringArrayRevIterator implements Iterator<String> {
    // (a) definire i campi e i relativi costruttori, anche uno solo se reputato sufficiente, 
    // strettamente necessari alla classe;
    private final String[] array;
    private int index;

    public StringArrayRevIterator(String... arr){
        this.array = requireNonNull(arr);
        this.index = arr.length - 1;
    }

    // (b) implementare il metodo hasNext() dell’interfaccia Iterator;
    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    // (c) implementare il metodo next() dell’interfaccia Iterator.
    @Override
    public String next() {
        if (hasNext()) {
            return array[index--];
        }
        throw new NoSuchElementException();
    }
}
