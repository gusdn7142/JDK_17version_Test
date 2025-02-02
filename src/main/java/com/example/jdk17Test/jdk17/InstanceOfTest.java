package com.example.jdk17Test.jdk17;

public class InstanceOfTest {
    public static void main(String[] args) {

        Object obj = "Hello, World!";

        //1) Java 15 이전 (기존 방식)
        if (obj instanceof String) {
            String strValue = (String) obj;            // 형변환을 명시적으로 해야 함
            System.out.println("String value: " + strValue.toUpperCase());
        }

        //2) Java 16 이후 (Pattern Matching 적용)
        if (obj instanceof String strValue) {                               // 패턴 매칭으로 형변환과 타입 검사를 동시에 처리
            System.out.println("String value: " + strValue.toUpperCase());  // str은 이미 String 타입
        }

    }
}
