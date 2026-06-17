package index_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import static java.util.Objects.requireNonNull;

public class IndexIterator<E> implements Iterator<Pair<Integer, E>> {
    private final Iterator<E> iterator; // invariant: iterator!=null
    private int index;

    // (b) completare il costruttore della classe IndexIterator<E>.
    public IndexIterator(Iterator<E> iterator) {
        this.iterator = requireNonNull(iterator);
        this.index = 0;
    }

    // (c) completare il metodo hasNext() della classe IndexIterator<E>.
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    // (d) completare il metodo next() della classe IndexIterator<E>.
    @Override
    public Pair<Integer, E> next() {
        if (hasNext()) {
            return new Pair<>(index++, iterator.next());
        }
        throw new NoSuchElementException();
    }
}
