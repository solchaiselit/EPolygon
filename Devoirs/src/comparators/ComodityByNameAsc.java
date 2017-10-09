package comparators;

import java.util.Comparator;

import paging.Comodity;

public class ComodityByNameAsc implements Comparator<Comodity> {
    @Override
    public int compare(Comodity o1, Comodity o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
