package com.chapter.ch02;

import com.chapter.util.Folks;

import static java.util.stream.Collectors.joining;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/6/22
 */
public class PrintList {
    public static void main(String[] args) {
        System.out.println("//" + "START:FOREACH_OUTPUT");
        for(String name : Folks.friends) {
            System.out.print(name + ", ");
        }
        System.out.println();
        System.out.println("//" + "END:FOREACH_OUTPUT");

        System.out.println("//" + "START:FOR_OUTPUT");
        for(int i = 0; i < Folks.friends.size() - 1; i++) {
            System.out.print(Folks.friends.get(i) + ", ");
        }

        if(Folks.friends.size() > 0)
            System.out.println(Folks.friends.get(Folks.friends.size() - 1));
        System.out.println("//" + "END:FOR_OUTPUT");

        System.out.println("//" + "START:JOIN_OUTPUT");
        System.out.println(String.join(", ", Folks.friends));
        System.out.println("//" + "END:JOIN_OUTPUT");

        System.out.println("//" + "START:MAP_JOIN_OUTPUT");
        System.out.println(
                Folks.friends.stream()
                        .map(String::toUpperCase)
                        .collect(joining(", ")));
        System.out.println("//" + "END:MAP_JOIN_OUTPUT");
    }
}
