package logicalprogram;

import java.util.Arrays;
import java.util.List;

public class FindAllNumberStartWith1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,14,18,1,50,20,30,40);
        list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(s-> System.out.println(s));


    }
}
