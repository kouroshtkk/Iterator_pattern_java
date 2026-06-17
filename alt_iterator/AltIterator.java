package alt_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import static java.util.Objects.requireNonNull;

public class AltIterator<E> implements Iterator<E> {
    private Iterator<E> first, second; // invariant: first != null and second != null

    // (a) completare il costruttore della classe AltIterator.
    public AltIterator(Iterator<E> first, Iterator<E> second) {
        this.first = requireNonNull(first);
        this.second = requireNonNull(second);
    }

    // (b) completare il metodo hasNext() della classe AltIterator.
    @Override
    public boolean hasNext() {
        return first.hasNext() || second.hasNext();
    }

    // (c) completare il metodo next() della classe AltIterator.
    @Override
    public E next() {
        if (!hasNext()) throw new NoSuchElementException();

        // Se il primo iteratore è vuoto, dobbiamo per forza usare il secondo
        if (!first.hasNext()) {
            Iterator<E> temp = first;
            first = second;
            second = temp;
        }

        E res = first.next();

        // Se l'altro iteratore ha ancora elementi, scambiamo per alternare alla prossima chiamata
        if (second.hasNext()) {
            Iterator<E> temp = first;
            first = second;
            second = temp;
        }

        return res;
    }
}
