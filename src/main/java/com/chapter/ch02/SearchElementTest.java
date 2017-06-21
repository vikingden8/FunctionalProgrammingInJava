package com.chapter.ch02;

import com.chapter.util.Folks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/6/21
 */
public class SearchElementTest {

    public static void main(String[] args) {
        List<String> startWithN = new ArrayList<>() ;

        //old java way
        for (String name : Folks.friends){
            if (name.startsWith("N")){
                startWithN.add(name) ;
            }
        }
        System.out.println(startWithN);

        //new java way
        startWithN.clear();
        startWithN = Folks.friends.stream()
                .filter(name -> name.startsWith("N"))
                .collect(Collectors.toList());
        System.out.println(startWithN);
    }
}
