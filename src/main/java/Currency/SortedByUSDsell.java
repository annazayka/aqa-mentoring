package Currency;

import java.util.Comparator;

public class SortedByUSDsell implements Comparator<Summary> {
    @Override
    public int compare(Summary o1, Summary o2) {
        double change1 = o1.getUsd_buy();
        double change2 = o2.getUsd_buy();
        if (change1 > change2) return -1;
        if (change1 < change2) return 1;
        return 0;
    }
}

