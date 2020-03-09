package com.zipcodewilmington.arrayutility;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T>{
    private T[] genArray;



    public ArrayUtility(T[] testArray){
        this.genArray = testArray;
    }

//    public T[] getObject(){
//        return this.genArray;
//    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        ArrayList<T> list = new ArrayList<T>(Arrays.asList(arrayToMerge));
        list.addAll(Arrays.asList(genArray));
        Integer count = Collections.frequency(list, valueToEvaluate);
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        return null;
    }

    public T[] removeValue(T valueToRemove) {
        return null;
    }
}
