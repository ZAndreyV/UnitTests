package HomeWork6;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class NumberAnalyzerTest {

    @Test
    public void testCompareAverageValues() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(6, 7, 8, 9, 10);

        NumberAnalyzer analyzer = new NumberAnalyzer(list1, list2);
        String result = analyzer.compareAverageValues();

        assertEquals("Второй список имеет большее среднее значение", result);
    }
    @Test
    public void testCompareAverageValues_FirstListGreater() {
        List<Integer> list1 = List.of(6, 7, 8, 9, 10);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5);

        NumberAnalyzer analyzer = new NumberAnalyzer(list1, list2);
        String result = analyzer.compareAverageValues();

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverageValues_SecondListGreater() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(6, 7, 8, 9, 10);

        NumberAnalyzer analyzer = new NumberAnalyzer(list1, list2);
        String result = analyzer.compareAverageValues();

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverageValues_EqualAverages() {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(1, 4, 1, 4);

        NumberAnalyzer analyzer = new NumberAnalyzer(list1, list2);
        String result = analyzer.compareAverageValues();

        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareAverageValues_EmptyLists() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of();

        NumberAnalyzer analyzer = new NumberAnalyzer(list1, list2);
        String result = analyzer.compareAverageValues();

        assertEquals("Средние значения равны", result);
    }

}
