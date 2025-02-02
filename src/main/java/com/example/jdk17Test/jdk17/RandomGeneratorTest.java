package com.example.jdk17Test.jdk17;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;


public class RandomGeneratorTest {
    public static void main(String[] args) {

        /**
         * 1) Java 17이전 - Random을 사용해 정수와 실수 난수 생성
         */

        //1-1) Random 객체 생성
        Random random = new Random();

        //1-2) 정수 난수 생성 (0~99 범위)
        int randomIntInJava16 = random.nextInt(100);
        System.out.println("Random integer: " + randomIntInJava16);

        //1-3) 실수 난수 생성 (0.0~1.0 범위)
        double randomDoubleInJava16 = random.nextDouble();
        System.out.println("Random double: " + randomDoubleInJava16);

        //1-4) 스트림을 사용하여 난수 생성 (10개의 정수 생성)
        IntStream.generate(() -> random.nextInt(100))
                .limit(10)
                .forEach(System.out::println);

        //1-5) 특정 분포에 따른 난수 생성 (정규 분포)
        random.doubles(10, 0.0, 1.0)
                .forEach(System.out::println);



        /**
         * 2) Java 17 - RandomGenerator를 사용해 정수와 실수 난수 생성
         */

        //2-1) RandomGenerator를 사용하여 기본 난수 생성기 생성
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        //RandomGenerator randomGenerator2 = RandomGenerator.of("L128X1024MixRandom");
        //RandomGenerator randomGenerator = new SplittableRandom();

        //2-2) 정수 난수 생성 (0~99 범위)
        int randomInt = randomGenerator.nextInt(100);
        System.out.println("Random integer: " + randomInt);

        //2-3) 실수 난수 생성 (0.0~1.0 범위)
        double randomDouble = randomGenerator.nextDouble();
        System.out.println("Random double: " + randomDouble);

        //2-4) 스트림을 사용하여 난수 생성 (10개의 정수 생성)
        randomGenerator.ints(10, 1, 100)
                .forEach(System.out::println);

        //2-5) 특정 분포에 따른 난수 생성 (정규 분포)
        randomGenerator.doubles(10, 0.0, 1.0)
                .forEach(System.out::println);
    }
}
