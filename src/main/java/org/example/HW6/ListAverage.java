package org.example.HW6;

import java.util.ArrayList;
import java.util.List;

public class ListAverage {
    private List<Integer> firstList;
    private List<Integer> secondList;



    public ListAverage(List<Integer> firstList, List<Integer> secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }
    public ListAverage(){}
    public void setFirstList(List<Integer> firstList) {
        this.firstList = firstList;
    }

    public void setSecondList(List<Integer> secondList) {
        this.secondList = secondList;
    }

    public List<Integer> getFirstList() {
        return firstList;
    }

    public List<Integer> getSecondList() {
        return secondList;
    }
    public List<Integer> getAverage() throws RuntimeException {
        if (firstList.isEmpty() || secondList.isEmpty()) throw new RuntimeException("Список пуст!");
        List<Integer> resultList = new ArrayList<>();
        resultList.add(firstList.stream().reduce(Integer::sum).get() / firstList.size());
        resultList.add(secondList.stream().reduce(Integer::sum).get() / secondList.size());
        return resultList;
    }

    /**
     * Метод сравнивает средние значения двух листов.
     *
     */
    public String compareAverageLists() throws RuntimeException {
        List<Integer> averageList = this.getAverage();
        if (averageList.get(0) > averageList.get(1)) return "У первого списка среднее значение больше";
        else if (averageList.get(0) < averageList.get(1)) return "У второго списка среднее значение больше";
        else return "Средние значения равны";
    }
}
