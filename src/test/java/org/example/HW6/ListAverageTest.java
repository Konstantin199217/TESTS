package org.example.HW6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class ListAverageTest {
    // Поле класса ListAverage
    private ListAverage listAverage;

    @BeforeEach
    void setUp() {
        listAverage = new ListAverage(
                Arrays.asList(1, 1, 1),
                Arrays.asList(2, 2, 2)
        );
    }

    /**
     * Тестирование получения листа firstList
     */
    @Test
    void getFirstList() {
        List<Integer> expectList = new ArrayList<>(Arrays.asList(1, 1, 1));
        assertEquals(expectList, listAverage.getFirstList());
    }

    /**
     * Тестирование получения листа secondList
     */
    @Test
    void getSecondList() {
        List<Integer> expectList = new ArrayList<>(Arrays.asList(2, 2, 2));
        assertEquals(expectList, listAverage.getSecondList());
    }

    /**
     * Тестирование задания листа firstList
     */
    @Test
    void setFirstList() {
        List<Integer> expectList = Arrays.asList(3, 3);
        listAverage.setFirstList(expectList);
        assertEquals(expectList, listAverage.getFirstList());
    }

    /**
     * Тестирование задания листа secondList
     */
    @Test
    void setSecondList() {
        List<Integer> expectList = Arrays.asList(3, 3);
        listAverage.setSecondList(expectList);
        assertEquals(expectList, listAverage.getSecondList());
    }

    @Test
    void getAverageShouldGeneratedExceptions() {
        // Задаем эталонное исключение
        Exception expectException = new RuntimeException();
        // Заполняем поле объекта класса listAverage пустым листом
        listAverage.setSecondList(Collections.emptyList());
        // Перехватываем сгенерированное исключение
        Exception actualException = assertThrows(RuntimeException.class,
                () -> listAverage.getAverage());
        // Сравниваем эталонное и актуальные исключения
        assertEquals(expectException.getClass(), actualException.getClass(),
                "метод getAverage некорректно генерирует исключение");
    }

    @Test
    void compareAverageListsShouldReturnCorrectMessage() {
        // Задаем эталонные возвращаемые значения
        String exMessageOne = "У первого списка среднее значение больше";
        String exMessageTwo = "У второго списка среднее значение больше";
        String exMessageThree = "Средние значения равны";
        // Получаем возвращаемое значение когда среднее значение первого листа больше значения второго листа
        listAverage.setFirstList(Arrays.asList(5, 5, 5));
        listAverage.setSecondList(Arrays.asList(1, 1));
        String acMessageOne = listAverage.compareAverageLists();
        // Получаем возвращаемое значение когда среднее значение первого листа меньше значения второго листа
        listAverage.setFirstList(Arrays.asList(1, 1));
        listAverage.setSecondList(Arrays.asList(5, 5, 5));
        String acMessageTwo = listAverage.compareAverageLists();
        // Получаем возвращаемое значение когда среднее значение обоих листов равное
        listAverage.setFirstList(Arrays.asList(1, 1));
        listAverage.setSecondList(Arrays.asList(1, 1));
        String acMessageThree = listAverage.compareAverageLists();
        // Проверяем эталонные и ожидаемые возвращаемые значения
        assertEquals(exMessageOne, acMessageOne, "метод compareAverageLists возвращает некорректное сообщение");
        assertEquals(exMessageTwo, acMessageTwo, "метод compareAverageLists возвращает некорректное сообщение");
        assertEquals(exMessageThree, acMessageThree, "метод compareAverageLists возвращает некорректное сообщение");
    }
}