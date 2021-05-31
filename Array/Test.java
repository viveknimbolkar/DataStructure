package Array;

import Algorithms.InsertionSort;
/**
 * @author vivek nimbolkar
 *
 */
public class Test {

	public void insertionSort(int[] arr){

		int n = arr.length;

		for (int i = 0; i < n; i++) {

			int key = arr[i];
			int j = i -1;

			while (j >= 0 && arr[j] > key ){
				arr[j+1] = arr[j];
				j--;
			}

			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		InsertionSort is = new InsertionSort();

		int[] a = {34,32,7,3,76,9,5,87,3,85,465,4,6,2,6,5};

		t.insertionSort(a);
		is.printSortedArray(a);

	}

}
