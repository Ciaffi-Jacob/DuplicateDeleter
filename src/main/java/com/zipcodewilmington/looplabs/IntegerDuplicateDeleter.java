package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int tempCount;
        Integer mostFreq = null;
        for (int i = 0; i < array.length -1; i++) {
            tempCount = 0;
            for (int j = 0; j < array.length; j++) { //compares current index and adds to tempCount
                if(array[i] == array[j]){
                    tempCount++;
                }
            }
            if(tempCount == maxNumberOfDuplications){
                mostFreq = array[i]; //change mostFreq to current index
            }
        }
        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return new Integer[0];
    }
}
