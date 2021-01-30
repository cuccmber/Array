package com.yauchenya.task.array.action.action;

import com.yauchenya.task.array.action.entity.Array;

public class Sorting {

    public void bubbleSortAscending(Array array){
        int size = array.size();

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (array.getElement(j) > array.getElement(j + 1))
                {
                    int temp = array.getElement(j);
                    array.setElement(array.getElement(j + 1), j);
                    array.setElement(temp, j + 1);
                }
    }


    public void gnomeSortAscending(Array array){
        int size = array.size();

        for (int i = 0; i < size; i++) {
            if (i == 0)
                i++;
            if (array.getElement(i) >= array.getElement(i - 1))
                i++;
            else {
                int temp = array.getElement(i);
                array.setElement(array.getElement(i - 1), i);
                array.setElement(temp, i - 1);
                i--;
            }
        }
    }

    public void insertionSortAscending(Array array){
        int size = array.size();

        for (int i = 1; i < size; ++i) {
            int key = array.getElement(i);
            int j = i - 1;

            while (j >= 0 && array.getElement(j) > key) {
                array.setElement(array.getElement(j), j + 1);
                j = j - 1;
            }
            array.setElement(key, j + 1);
        }
    }
}
