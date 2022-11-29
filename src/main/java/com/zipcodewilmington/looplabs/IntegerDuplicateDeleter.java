package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }
    public int countNumberOfOccurrences(int number){
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == number){
                count++;
            }
        }
        return count;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int numberOfElements = 0;
        for(int i = 0; i < array.length; i++) {
            if(countNumberOfOccurrences(array[i]) < maxNumberOfDuplications){
                numberOfElements++;
            }
        }
        int tracker = 0;
        Integer[] newArray = new Integer[numberOfElements];
        for(int j = 0; j < array.length; j++){
            if(countNumberOfOccurrences(array[j]) < maxNumberOfDuplications){
                newArray[tracker] = array[j];
                tracker++;
            }
        }
        return newArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int numberOfElements = 0;
        for(int i = 0; i < array.length; i++){
            if(countNumberOfOccurrences(array[i]) != exactNumberOfDuplications){
                numberOfElements++;
            }
        }
        int tracker = 0;
        Integer[] newArray = new Integer[numberOfElements];
        for(int j = 0; j < array.length; j++){
            if (countNumberOfOccurrences(array[j]) != exactNumberOfDuplications){
                newArray[tracker] = array[j];
                tracker++;
            }
        }
        return  newArray;
    }
}
