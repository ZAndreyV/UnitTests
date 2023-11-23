package HomeWork6;

import java.util.List;

public class NumberAnalyzer {
    private List<Integer> list1;
    private List<Integer> list2;

    public NumberAnalyzer(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double calculateAverage(List<Integer> numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return numbers.size() > 0 ? sum / numbers.size() : 0;
    }

    public String compareAverageValues() {
        double list1Average = calculateAverage(list1);
        double list2Average = calculateAverage(list2);

        if (list1Average > list2Average) {
            return "Первый список имеет большее среднее значение";
        } else if (list2Average > list1Average) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
