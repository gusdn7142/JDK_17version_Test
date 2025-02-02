package com.example.jdk17Test.jdk17;



// Sealed 클래스 Animal
sealed class Animal permits Dog, Cat, Bird {      //상속을 Dog, Cat, Bird로 제한
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

// 1차 상속받는 final 클래스 Dog
final class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// 1차 상속받는 sealed 클래스 Cat
sealed class Cat extends Animal permits Persian {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// 1차 상속받는 non-sealed 클래스 Bird
non-sealed class Bird extends Animal  {
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}

// 2차 상속받는 final 클래스 Persian
final class Persian extends Cat {
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}



public class Sealed_Classes_Test {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Dog 객체를 생성

        // switch 문에서 Animal의 서브클래스를 다룰 때 (preview기능)
       /* switch (animal) {
            case Dog d -> System.out.println("It's a dog!");
            case Cat c -> System.out.println("It's a cat!");
            case Bird b -> System.out.println("It's a bird!");
            // 만약 새로운 Animal의 서브클래스가 추가되면,
            // 그에 대한 처리가 없으면 컴파일 오류가 발생합니다.
            default -> System.out.println("Unknown animal");
        }*/

        // switch 문 대신 instanceof를 사용하여 타입 검사
        if (animal instanceof Dog) {
            System.out.println("It's a dog!");
        } else if (animal instanceof Cat) {
            System.out.println("It's a cat!");
        } else if (animal instanceof Bird) {
            System.out.println("It's a bird!");
        } else {
            System.out.println("Unknown animal");
        }

    }
}
