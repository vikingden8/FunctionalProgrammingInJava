package com.chapter.ch02;

import com.chapter.util.Folks;

import java.util.function.Predicate;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/6/22
 */
public class PickElementsMultipleCollection {

    public static void main(String[] args) {
        final long countFriendsStartN = Folks.friends.stream()
                .filter(name -> name.startsWith("N")).count() ;
        final long countEditorsStartN = Folks.editors.stream()
                .filter(name -> name.startsWith("N")).count() ;
        final long countComradesStartN = Folks.comrades.stream()
                .filter(name -> name.startsWith("N")).count() ;

        System.out.println(countFriendsStartN);
        System.out.println(countEditorsStartN);
        System.out.println(countComradesStartN);

        final Predicate<String> startN = name -> name.startsWith("N") ;

        final long countFriendsStartN_ = Folks.friends.stream()
                .filter(startN).count() ;
        final long countEditorsStartN_ = Folks.editors.stream()
                .filter(startN).count() ;
        final long countComradesStartN_ = Folks.comrades.stream()
                .filter(startN).count() ;

        System.out.println(countFriendsStartN_);
        System.out.println(countEditorsStartN_);
        System.out.println(countComradesStartN_);
    }
}
