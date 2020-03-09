package com.zipcodewilmington.arrayutility;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

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
        ArrayList<T> list = new ArrayList<T>(Arrays.asList(arrayToMerge));
        list.addAll(Arrays.asList(genArray));
        int n = list.size();
        T temp = list.get(0);
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1))
                currentCount++;
            else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    temp = list.get(i - 1);
                }
                currentCount = 1;
            }
        }
        if (currentCount > maxCount){
            maxCount = currentCount;
            temp = list.get(n - 1);
        }
        System.out.println(temp);
        return temp;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i < genArray.length; i++) {
            if (genArray[i] == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        return null;
    }
}
