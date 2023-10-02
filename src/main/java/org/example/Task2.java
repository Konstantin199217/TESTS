package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<Integer> sumLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            result.add(list1.get(i) + list2.get(i));
        }
        return result;
    }
    //sumLists: Этот метод принимает два списка list1 и list2 и возвращает новый список,
    // в котором каждый элемент равен сумме соответствующих элементов из list1 и list2.

    public static int findMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    //findMax: Этот метод находит максимальное значение в списке numbers и возвращает его.

    public static List<String> filterStrings(List<String> words, int minLength) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= minLength) {
                result.add(word);
            }
        }
        return result;
    }
    //filterStrings: Этот метод принимает список строк words и минимальную длину minLength.
    // Он возвращает новый список, содержащий только те строки из words,
    // которые имеют длину больше или равную minLength.
}