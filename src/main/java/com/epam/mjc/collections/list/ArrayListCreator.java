package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 2; i < sourceList.size(); i += 3) {
            try {
                String element = sourceList.get(i);
                result.add(element);
                result.add(element);
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }

        return result;
    }
}
