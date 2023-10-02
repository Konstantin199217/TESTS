import org.example.Task2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestTask2 {
    @Test
    public void sumListsTest() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));
        List<Integer> resultTest = Task2.sumLists(list1, list2);
        assertEquals(result,resultTest, "Сумма списков не верна");

    }

    @Test
    public void findMaxTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        int max = 3;
        int maxTest = Task2.findMax(list1);
        assertEquals(max,maxTest, "Не верное максимальное число");

    }

    @Test
    public void filterStringsTest(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Кот","на","столе"));
        int lengt = 4;
        List<String> result = new ArrayList<>(Arrays.asList("столе"));
        List<String> resultTest = Task2.filterStrings(list1, lengt);


        assertEquals(result,resultTest);
    }
}
