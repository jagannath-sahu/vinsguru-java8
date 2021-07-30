package com.logicbig.usingFunction;

import com.logicbig.service.DataService;

import java.util.Collections;
import java.util.List;


/**
 * This example demonstrate how to use static method ref.
 */
public class StaticRefExample {

    public static void main(String[] args) {
        DataService dataService = new DataService();
        List<String> list = dataService.getAllUserNames();

        System.out.println("User list " + list);
        //using static method reference
        Collections.sort(list, StaticRefExample::compare);

        System.out.println("User list sorted by last names: " + list);
    }

    /**
     * This method sorts all user by their last names
     */
    private static int compare(String a, String b) {
        return getLastName(a).compareTo(getLastName(b));
    }

    private static String getLastName(String name) {
        int i = name.indexOf(" ");
        return i != -1 ? name.substring(i + 1) : name;
    }
}