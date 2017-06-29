package com.chapter.ch03;

/**
 * Author : Viking Den <vikingden7@gmail.com>
 * Date : 2017/6/29
 */
public class IteraterString {

    static final String str = "test123" ;

    public static void main(String[] args) {
        str.chars().forEach(ch -> System.out.println(ch));

        System.out.println("**********************************");

        str.chars().forEach(System.out::println);

        System.out.println("**********************************");

        str.chars().forEach(IteraterString::printChar);

        System.out.println("**********************************");

        str.chars()
                .mapToObj(ch -> Character.valueOf((char)ch))
                .forEach(System.out :: println);

        System.out.println("**********************************");

        str.chars()
                .filter(ch -> Character.isDigit(ch))
                .forEach(System.out :: println);
    }

    private static void printChar(int charStr){
        System.out.println((char) charStr);
    }
}
