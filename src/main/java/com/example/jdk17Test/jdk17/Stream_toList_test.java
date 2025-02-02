package com.example.jdk17Test.jdk17;


import java.util.List;

public class Stream_toList_test {

    public static void main(String[] args) {
        List<String> names = List.of("Depth", "Bob", "Steve", "David");

        List<String> resultList = names.stream()
                .filter(name -> name.startsWith("D"))
                //.collect(Collectors.toList());        //Java 16 이전
                .toList();                         //Java 16 이후 - Stream.toList() 사용

        System.out.println(resultList);  // [Depth, David]
    }
}



