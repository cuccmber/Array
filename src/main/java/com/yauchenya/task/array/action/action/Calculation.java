package com.yauchenya.task.array.action.action;

import com.yauchenya.task.array.action.entity.Array;

public class Calculation {

    public double calculateAvg(Array array){
        int sum = 0;
        int size = array.size();

        for(int i = 0; i < size; i++){
            sum += array.getElement(i);
        }

        return (double)sum/size;
    }

    public int findMaxValue(Array array){
//        this.array = array;

        int max = array.getElement(0);
        int size = array.size();

        for(int i = 0; i < size; i++){
            if(array.getElement(i) > max){
                max = array.getElement(i);
            }
        }
        return max;
    }

    public int findMinValue(Array array){
//        this.array = array;

        int min = array.getElement(0);
        int size = array.size();

        for(int i = 0; i < size; i++){
            if(array.getElement(i) < min){
                min = array.getElement(i);
            }
        }
        return min;
    }

    public int calculateSum(Array array){
        int sum = 0;
        int size = array.size();

        for(int i = 0; i < size; i++){
            sum += array.getElement(i);
        }

        return sum;
    }

    public int calculatePositiveSum(Array array){
        int sum = 0;
        int size = array.size();
        for(int i = 0; i < size; i++){
            if(array.getElement(i) > 0){
                sum += array.getElement(i);
            }
        }
        return sum;
    }

}
