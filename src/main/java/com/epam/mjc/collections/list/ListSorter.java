package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int firstElement = Integer.parseInt(a);
        int secondElement = Integer.parseInt(b);

        int computedFirstValue = (int) (5  * Math.pow(firstElement, 2) + 3);
        int computedSecondValue = (int) (5  * Math.pow(secondElement, 2) + 3);

        if (computedFirstValue != computedSecondValue)
            return Integer.compare(computedFirstValue, computedSecondValue);

        return Integer.compare(firstElement, secondElement);
    }
}
