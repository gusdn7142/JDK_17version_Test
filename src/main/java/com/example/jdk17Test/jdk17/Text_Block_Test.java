package com.example.jdk17Test.jdk17;

public class Text_Block_Test {

    public static void main(String[] args) {

        //1) Java 15 이전의 문자열 사용
        String jsonStrInJava14 = "{\n" +
                "  \"name\": \"depth\",\n" +
                "  \"age\": 28,\n" +
                "  \"city\": \"Seoul\"\n" +
                "}";
        System.out.println(jsonStrInJava14);


        //2) Java 15 이후의 문자열 사용
        String jsonStrInJava15 = """
            {
                "name": "depth",
                "age": 28,
                "city": "Seoul"
            }
            """;
        System.out.println(jsonStrInJava15);
    }
}
