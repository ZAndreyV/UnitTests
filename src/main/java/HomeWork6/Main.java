package HomeWork6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(6, 7, 8, 9, 10);

        NumberAnalyzer analyzer = new NumberAnalyzer(list1, list2);
        String result = analyzer.compareAverageValues();
        System.out.println(result);
    }
}
