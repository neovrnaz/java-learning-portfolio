package com.neo.streams.java_streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach ❌

        // Here we are defining every single step of what we are trying to achieve

        /*

        List<Person> females = new ArrayList<>();

        for (Person person : people) {

            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(System.out::println);

        */

        // So instead of defining this implementation in the for loop,
        // using streams, can simply tell Java what we want from our collection

        // Declarative approach ✅

        // Filter
        List<Person> females = people.stream()

                // Filter takes a predicate. A predicate simply means true or false
                // and this is what we want to keep from our original list
//             ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
//             ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ↓ ━━━━━━━━━━━━━━━┛
//                                                     Quick tip: To extract a variable highlight this chunk of code and use ⌘⌃V to extract variable.
//                                                               (First you need to get rid of "List<Person> females = " but keep "people.stream()".
//                                                               You may also select people.stream() when selecting .filter .collect. The same can
//                                                               be done for all of the other streams bellow.)

//        females.forEach(System.out::println);

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);

        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 5);
        System.out.println(allMatch);

        // Non match
        boolean nonMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));
        System.out.println(nonMatch);

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
        });

        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleAge.ifPresent(name -> System.out.println(name));
    }


    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}