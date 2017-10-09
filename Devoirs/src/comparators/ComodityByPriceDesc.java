package comparators;

import java.util.Comparator;

import paging.Comodity;

public class ComodityByPriceDesc implements Comparator<Comodity> {
    @Override
    public int compare(Comodity o1, Comodity o2) {
        int a1 = o1.getPrice();
        int a2 = o2.getPrice();
        return (a1<a2)? 1:(a2<a1)?-1:0;
    }
}
