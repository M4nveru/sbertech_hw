package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        // task 1
        IntStream streamInt = IntStream.of(10, 12, 4, 483, 124, 1, 56, 43, 100, 0)
                .filter((value) -> {
                    return value > 9 && value < 100;
                })
                .sorted();

        OptionalDouble avg = streamInt.average();
        System.out.println(avg.isPresent() ? avg.getAsDouble() : "Not an object");

        // task 3
        Stream<String> stringStream = (new ArrayList(Arrays.asList("Mike", "Matt", "Alex", "Tihomir"))).stream();
        Map<Long, String> nameMap = stringStream.map(
                (n) -> {
                    return new StreamContainer(n, (new Random()).nextInt(100));
                })
                .peek(StreamContainer::print)
                .collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName));

        System.out.println(nameMap);

        //task 4
        Map<String, List<String>> hashMap = new HashMap();
        hashMap.put("Directors", Arrays.asList("Dmitriy", "Vladimir"));
        hashMap.put("Engineers", Arrays.asList("Viktor", "Kristina", "Anton"));
        hashMap.put("MainVacancy", List.of("Mikhail"));

        Stream<StreamContainer> streamOfContainerStream = hashMap.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .map((n) -> {
                    return new StreamContainer(n, (new Random()).nextInt(100));
                });

        List<?> list = streamOfContainerStream.toList();
        System.out.println(list);
        Long objectCount = list.stream()
                .count();
        System.out.println(objectCount);

        // task 5
        String str = "1010010101";
        Stream<Boolean> booleanStream = str.chars()
                .mapToObj((ch) -> {
                    return (char) ch;
                })
                .map((ch) -> {
                    return ch == '1';
                });

        Optional<Boolean> result = booleanStream.reduce((b, x) -> {
            return b && x;
        });
        System.out.println(result.isPresent() ? result.get() : "Not an object");
    }
}