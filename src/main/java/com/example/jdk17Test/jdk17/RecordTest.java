package com.example.jdk17Test.jdk17;

public class RecordTest {
    public static void main(String[] args) {

        //1) record 사용 전
        Person person = new Person("depth", 20);
        System.out.println("person's name : " + person.getName());
        System.out.println("person's age : " + person.getAge());

        //2) record 사용 후
        PersonRecord personRecord = new PersonRecord("depth", 20);
        System.out.println("personRecord's name : " + personRecord.name());
        System.out.println("personRecord's age : " + personRecord.age());

        PersonRecord personRecord2 = new PersonRecord("depth", 20);
        System.out.println(personRecord.equals(person));           //false (same)
        System.out.println(personRecord.equals(personRecord2));    //true (different)

        System.out.println(person.hashCode());          //-1146743514
        System.out.println(personRecord.hashCode());   //-133532512
        System.out.println(personRecord2.hashCode());  //-133532512
    }
}
