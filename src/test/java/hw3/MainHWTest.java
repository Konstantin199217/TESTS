package hw3;

import org.example.HW3.MainHW;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @Test
    void evenOddNumber() {
        //Проверяем метод на четное число
        boolean evenOddNumberTrue = true;
        int num = 2;
        boolean evenOddNumberMet = MainHW.evenOddNumber(num);
        assertEquals(evenOddNumberTrue, evenOddNumberMet, "Число не четное");

        //Проверяем метод на не четное число
        boolean evenOddNumberFalse = false;
        int numFalse = 3;
        boolean evenOddNumberMetFalse = MainHW.evenOddNumber(numFalse);
        assertEquals(evenOddNumberFalse, evenOddNumberMetFalse, "Число четное");

    }


    @Test
    void rangeNumber() {
        //Проверяем метод на поподание в диапозон
        boolean rangeTrue = true;
        int num = 27;
        boolean rangeMethod = MainHW.rangeNumber(num);
        assertEquals(rangeTrue, rangeMethod, "Число НЕ в диапозоне от 25 до 100");

        //Проверяем метод на не поподание в диапозон
        boolean rangeFalse = false;
        int numFalseRange = 123;
        boolean rangeMethodFalse = MainHW.rangeNumber(numFalseRange);
        assertEquals(rangeFalse, rangeMethodFalse, "Число В диапозоне от 25 до 100");


    }
}