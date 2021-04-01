package by.alekseyshysh.array.service.util.impl;

import by.alekseyshysh.array.service.util.ShellSort;

public class ShellSortImpl implements ShellSort {

	public int[] shellSort(int[] arrayToSort) {
		int length = arrayToSort.length;
		for (int gap = length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < length; i++) {
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
