package logicalprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.addAll(Arrays.asList(10,15,8,49,25,98,32));
        System.out.println(integerList);
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        System.out.println(list);
        list.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
