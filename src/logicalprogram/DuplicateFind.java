package logicalprogram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateFind {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(20,10,20,40,50,50,70,80,70);
        list.stream()
                .sorted()
                .forEach(System.out::println);

        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);


        List<String> stringList = Arrays.asList("Krishna","Krishna","mukesh");
        Set<String> stringSet = new HashSet<String>();
        stringList.stream().filter(s->!stringSet.add(s)).forEach(System.out::println);
        Set<Integer> set= new HashSet<Integer>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);
        //find first element of list
        List<Integer> myList = Arrays.asList(100,15,8,49,25,98,98,32,15);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
        //count how many numbers in list
        long count =  myList.stream()
                .count();
        System.out.println(count);

        //find highest numbner of list
       int max= myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);

        // find the first non-repeated character in it using Stream functions

        String input = "Java Hungry Blog Alive is Awesome";

        Character result = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        // find the first repeated character in it using Stream functions

        String input1 = "Java Hungry Blog Alive is Awesome";

        Character result1 = input1.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result1);
    }
}
