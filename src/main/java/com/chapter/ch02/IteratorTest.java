package com.chapter.ch02;

import com.chapter.util.Folks;

import java.util.function.Consumer;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/6/21
 */
public class IteratorTest {
    public static void main(String[] args) {

        //old java way
        for (int i = 0 ; i < Folks.friends.size() ; i++){
            System.out.println("old way for : " + Folks.friends.get(i));
        }

        //for each
        for (String name : Folks.friends){
            System.out.println("old for-each : " + name);
        }

        System.out.println("//" + "START:INTERNAL_FOR_EACH_OUTPUT");

        Folks.friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.err.println("new forEach : " + s);
            }
        });
        System.out.println("//" + "END:INTERNAL_FOR_EACH_OUTPUT");

/*        System.out.println("//" + "START:INTERNAL_OUTPUT");
        Folks.friends.forEach((final String name) -> System.out.println(name));
        System.out.println("//" + "END:INTERNAL_OUTPUT");

        Folks.friends.forEach((name) -> System.out.println(name));

        Folks.friends.forEach(name -> System.out.println(name));

        Folks.friends.forEach(System.out::println);*/
    }
}
