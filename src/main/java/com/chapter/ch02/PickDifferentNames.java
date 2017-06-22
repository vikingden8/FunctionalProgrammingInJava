package com.chapter.ch02;

import com.chapter.util.Folks;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/6/22
 */
public class PickDifferentNames {

    public static void main(String[] args) {
        final Predicate<String> startsWithB = name -> name.startsWith("B") ;
        final Predicate<String> startsWithN = name -> name.startsWith("N") ;

        final long countStartWithB = Folks.friends.stream()
                .filter(startsWithB).count() ;
        final long countStartWithN = Folks.friends.stream()
                .filter(startsWithN).count() ;
        System.out.println(countStartWithB);
        System.out.println(countStartWithN);

        final long countStartWithB_ = Folks.friends.stream()
                .filter(checkIfStartWith("B")).count() ;
        final long countStartWithN_ = Folks.friends.stream()
                .filter(checkIfStartWith("N")).count() ;
        System.out.println(countStartWithB_);
        System.out.println(countStartWithN_);

        final Function<String, Predicate<String>> startsWithLetter =
                letter -> name -> name.startsWith(letter);
        final long countStartWithB__ = Folks.friends.stream()
                .filter(startsWithLetter.apply("B")).count() ;
        final long countStartWithN__ = Folks.friends.stream()
                .filter(startsWithLetter.apply("N")).count() ;
        System.out.println(countStartWithB__);
        System.out.println(countStartWithN__);
    }

    public static Predicate<String> checkIfStartWith(final String letter){
        return name -> name.startsWith(letter) ;
    }
}
