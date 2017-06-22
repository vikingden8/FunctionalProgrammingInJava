package com.chapter.ch02;

import com.chapter.util.Folks;

import java.util.Optional;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/6/22
 */
public class PickALongest {

    public static void main(String[] args) {
        System.out.println("//" + "START:SUM_OUTPUT");
        System.out.println("Total number of characters in all names: " +
                Folks.friends.stream()
                        .mapToInt(name -> name.length())
                        .sum());
        System.out.println("//" + "END:SUM_OUTPUT");

        System.out.println("//" + "END:AVERAGE_OUTPUT");
        System.out.println("//" + "START:REDUCE_OUTPUT");
        final Optional<String> aLongName =
                Folks.friends.stream()
                        .reduce((name1, name2) ->
                                name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name ->
                System.out.println(String.format("A longest name: %s", name)));
        System.out.println("//" + "END:REDUCE_OUTPUT");

        final String steveOrLonger =
                Folks.friends.stream()
                        .reduce("Steve", (name1, name2) ->
                                name1.length() >= name2.length() ? name1 : name2);

        System.out.println(steveOrLonger);
    }
}
