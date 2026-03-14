package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();

        for (var el : sourceList) {
            if (el % 2 == 0) result.addLast(el);
            else result.addFirst(el);
        }

        return result;
    }
}
