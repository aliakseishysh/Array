package by.alekseyshysh.array.service;

class InsertionSort {

	public static int[] insertionSortImperative(int[] arrayToSort) {
	    for (int i = 1; i < arrayToSort.length; i++) { 
	        int key = arrayToSort[i]; 
	        int j = i - 1;
	        while (j >= 0 && arrayToSort[j] > key) {
	            arrayToSort[j + 1] = arrayToSort[j];
	            j = j - 1;
	        }
	        arrayToSort[j + 1] = key; 
	    }
	    return arrayToSort;
	}
}
