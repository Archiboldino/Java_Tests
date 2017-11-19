package list;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * NoDeleteList
 * created on 19.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class NoDeleteList<T> extends ArrayList<T>{
    @Override
    public T remove(int i) {
        throw new NotImplementedException();
    }

    @Override
    public boolean remove(Object item) {
        throw new NotImplementedException();
    }

    @Override
    public boolean removeAll(Collection<?> items) {
        throw new NotImplementedException();
    }

    @Override
    public boolean removeIf(Predicate<? super T> predicate) {
        throw new NotImplementedException();
    }

}
