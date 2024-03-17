package packt.addressbook.util;
import java.util.ArrayList;
import java.util.List;

public class SortUtil<T> {
    public List<T> sort(List<T> list, java.util.Comparator<? super T> comparator) {
        list.sort(comparator);
        return list;
    }
}

