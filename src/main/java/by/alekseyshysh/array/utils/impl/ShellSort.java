package by.alekseyshysh.array.utils.impl;

import by.alekseyshysh.array.utils.ShellSortInterface;

public class ShellSort implements ShellSortInterface {
	
	public int[] shellSort(int arrayToSort[]) {
	    int n = arrayToSort.length;
	    for (int gap = n / 2; gap > 0; gap /= 2) {
	        for (int i = gap; i < n; i++) {
	            int key = arrayToSort[i];
	            int j = i;
	            while (j >= gap && arrayToSort[j - gap] > key) {
	                arrayToSort[j] = arrayToSort[j - gap];
	                j -= gap;
	            }
	            arrayToSort[j] = key;
	        }
	    }
	    return arrayToSort;
	}
	
}
