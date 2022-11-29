package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }
    public int countNumberOccurrences(String value) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i].equals(value)){
                count++;
            }
        }
        return count;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int numberOfElements = 0;
        for(int i = 0; i < array.length; i++) {
            if(countNumberOccurrences(array[i]) < maxNumberOfDuplications) {
                numberOfElements++;
            }
        }
        int tracker = 0;
        String[] newArray = new String[numberOfElements];
        for(int j = 0; j < array.length; j++){
            if(countNumberOccurrences(array[j]) < maxNumberOfDuplications) {
                newArray[tracker] = (array[j]);
                tracker++;
            }
        }
        return newArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int numberOfElements = 0;
        for(int i = 0; i < array.length; i++){
            if(countNumberOccurrences(array[i]) != exactNumberOfDuplications){
                numberOfElements++;
            }
        }
        int tracker = 0;
        String[] newArray = new String[numberOfElements];
        for (int j = 0; j < array.length; j++){
            if(countNumberOccurrences(array[j]) != exactNumberOfDuplications) {
                newArray[tracker] = array[j];
                tracker++;
            }
        }
        return newArray;
    }
}
