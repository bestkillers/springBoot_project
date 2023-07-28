package copy;

import java.util.Optional;

public class T1 {
    static class Person {
        Integer age;
        String name;

        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String toString() {
            return "Person " + "age = " + age + " name = " + name;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person(24, "刘顺");
        // Optional<String> strOpt = Optional.of("Hello World");
        // strOpt.ifPresent(System.out::println);
        Optional<Person> pOp = Optional.of(p1);
        pOp.ifPresent(System.out::println);
    }
}
