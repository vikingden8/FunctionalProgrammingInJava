package com.chapter.ch02;

import com.chapter.util.Folks;

import java.util.List;
import java.util.Optional;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/6/22
 */
public class PickAnElement {

    public static void main(String[] args) {
        pickName(Folks.friends, "N");
        pickName1(Folks.friends, "N");
    }

    public static void pickName1(final List<String> names, final String startingLetter) {
        final Optional<String> foundName =
                names.stream()
                        .filter(name ->name.startsWith(startingLetter))
                        .findFirst();
        System.out.println(String.format("A name starting with %s: %s",
                startingLetter, foundName.orElse("No name found")));
    }

    public static void pickName(final List<String> names, final String startingLetter) {
        String foundName = null;
        for(String name : names) {
            if(name.startsWith(startingLetter)) {
                foundName = name;
                break;
            }
        }
        System.out.print(String.format("A name starting with %s: ", startingLetter));
        if(foundName != null) {
            System.out.println(foundName);
        } else {
            System.out.println("No name found");
        }
    }
}
