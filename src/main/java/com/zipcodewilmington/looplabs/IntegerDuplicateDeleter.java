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
        IntegerDuplicateDeleter deleter = new IntegerDuplicateDeleter(this.array);
        int tempCount;
        int arraySubtractCounter = 1;
        Integer mostFreq = null;
        Integer checker;
        for (int i = 0; i < deleter.array.length -1; i++) {
            tempCount = 0;
            for (int j = i+1; j < deleter.array.length; j++) { //compares current index and adds to tempCount
                if(this.array[i].equals(deleter.array[j])){
                    tempCount++;
                }
            }
            if(tempCount >= maxNumberOfDuplications){ //null index if repeats is at least max
                for (int j = i+1; j < deleter.array.length; j++) {
                    if (deleter.array[i].equals(array[j])) {
                        deleter.array[j] = null;
                    }
                }
                arraySubtractCounter += tempCount;
              //  mostFreq = array[i]; //change mostFreq to current index
            }
        }
        Integer[] arr = new Integer[deleter.array.length - arraySubtractCounter];
        int arrSpot = 0;
        for (int i = 0; i < deleter.array.length; i++) {
            if (deleter.array[i] != null){
                arr[arrSpot] = deleter.array[i];
                arrSpot++;
            }
        }
        return arr;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return new Integer[0];
    }
}
