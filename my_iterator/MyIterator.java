package my_iterator;

public interface MyIterator<E> { 
    boolean advance(); 
    E element(); 
}