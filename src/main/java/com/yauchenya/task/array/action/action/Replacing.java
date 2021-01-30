package com.yauchenya.task.array.action.action;

import com.yauchenya.task.array.action.entity.Array;

import static java.lang.Math.abs;

public class Replacing {

    public void replaceItem(Array array){

        for(int i = 0; i < array.size(); i++){
            if(array.getElement(i) < 0){
                array.setElement(abs(array.getElement(i)), i);
            }
        }

    }
}
