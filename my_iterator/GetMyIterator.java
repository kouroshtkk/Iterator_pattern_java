package my_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class GetMyIterator<E> implements MyIterator<E> { 
    
    // (a) definire in GetMyIterator<E> i campi strettamente necessari
    // per una corretta implementazione della classe, insieme ai loro possibili invarianti.
    private final Iterator<E> it; // L'iteratore da incapsulare. Invariante: non null.
    private E current;            // Memorizza l'elemento corrente.
    private boolean valid;        // Indica se l'elemento corrente è valido

    // (b) definire in GetMyIterator<E> il costruttore necessario
    // per una corretta implementazione della classe.
    public GetMyIterator(Iterator<E> e){
        this.it = Objects.requireNonNull(e);
        this.valid = false;
    }

    // (c) definire in GetMyIterator<E> il metodo advance().
    @Override
    public boolean advance() {
        if(it.hasNext()){
            current=it.next();
            valid=true;
            return true;
        }
        else{
            valid=false;
            return false;
        }
    }

    // (d) definire in GetMyIterator<E> il metodo element().
    @Override
    public E element() {
        if(valid){
            return current;
        }
        throw new NoSuchElementException();
    }
}