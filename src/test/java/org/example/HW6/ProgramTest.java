package org.example.HW6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProgramTest {
    // Создаем поле мок - объекта InputList
    @Mock
    private InputList inputList;
    // Создаем поле spy - объекта ListAverage
    @Spy
    private ListAverage listAverage;
    // Создаем поле spy - объекта Program и внедряем в него мок-объект listAverage
    @Spy
    @InjectMocks
    private Program program;

    /**
     * Метод инициализации Spy - объектов
     * выполняется перед каждым запуском тестового метода
     */
    @BeforeEach
    public void setUp() {
        listAverage = new ListAverage();
        program = new Program(inputList, listAverage);
    }

    /**
     * Проводим сквозной тест общей работы программы
     */
    @Test
    void startCorrect() {
        // Задаем поведение мок объекта при вызове метода fillingList()
        when(inputList.fillingList()).thenReturn(new ArrayList<>(Arrays.asList(1, 1, 1)));
        // Задаем эталонное сообщение, которое ожидаем получить в консоли
        String expectMessage = """
                Среднее значение листа №1 = 1
                Среднее значение листа №2 = 1
                Средние значения равны
                """;
        // Перехватываем вывод в консоль
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // Запускаем выполнение программы
        program.start();
        // Помещаем вывод в консоль в строку, убирая сепараторы
        String actualMessage = outContent.toString().replaceAll("\r", "");
        // Возвращаем вывод в консоль в исходное состояние
        System.setOut(System.out);
        // Сравниваем эталонное и полученное сообщения
        assertEquals(expectMessage, actualMessage);
    }
}