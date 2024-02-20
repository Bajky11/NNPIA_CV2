package com.example.nnpia_cv_2;

import java.util.HashMap;
import java.util.Map;

public class ServisImpl {
    private Map<Integer, Person> people = new HashMap<>();

    public ServisImpl() {
        people.put(1, new Person(1, "Lukas", 24));
        people.put(2, new Person(2, "Lucie", 24));
        people.put(3, new Person(3, "Nicholas", 24));
    }

    public String getById(String id) {
        int safeId = Integer.parseInt(id);
        return people.get(safeId).toString();
    }

    public String toString() {
        return people.toString();
    }
}
