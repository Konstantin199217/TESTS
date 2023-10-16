package org.example.HW6;

import java.util.List;

/**
 * Класс содержащий логику программы
 */
public class Program {
    private InputList inputList;
    private ListAverage listAverage;

    public Program(InputList inputList, ListAverage listAverage) {
        this.inputList = inputList;
        this.listAverage = listAverage;
    }

    public void start(){
        try{
            List<Integer> listOne = inputList.fillingList();
            List<Integer> listTwo = inputList.fillingList();
            listAverage.setFirstList(listOne);
            listAverage.setSecondList(listTwo);
            System.out.printf("Среднее значение листа №1 = %d\n", listAverage.getAverage().get(0));
            System.out.printf("Среднее значение листа №2 = %d\n", listAverage.getAverage().get(1));
            String result = listAverage.compareAverageLists();
            System.out.println(result);
        } catch (NumberFormatException e){
            System.out.println("Введены не корректные данные");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
