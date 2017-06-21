package com.chapter.ch02;

import com.chapter.util.Folks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/6/21
 */
public class TransformTest {

    public static void main(String[] args) {
        final List<String> uppercaseNames = new ArrayList<>() ;

        //old java way
        for (String name : Folks.friends){
            uppercaseNames.add(name.toUpperCase()) ;
        }
        System.out.println(uppercaseNames);

        //or forEach
        uppercaseNames.clear();
        Folks.friends.forEach(s -> uppercaseNames.add(s.toUpperCase()));
        System.out.println(uppercaseNames);

        //or lambda expression
        uppercaseNames.clear();
        Folks.friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
        System.out.println();

        //more simple way
        uppercaseNames.clear();
        Folks.friends.stream()
                .map(String :: toUpperCase)
                .forEach(name -> System.out.println(name));
        System.out.println();
    }
}
