package Array;/**
 * @author vivek nimbolkar
 *
 */
public class ArrayRotation {
	
	//Rotate the array to left by one
	void leftRotate(int arr[], int size, int place) {
		
		for(int i = 0; i < place; i++) {
			
			leftRotateByOne(arr, size); //call a method to rotate one by one
		}
	}
	
	//Rotate the array
	void leftRotateByOne(int arr[], int size) {
		
		int i, temp;
		
		temp = arr[0]; //creating a temperary array
		
		for(i = 0; i < size - 1; i++) {
			
			arr[i] = arr[i+1]; //shifting the position to left by one index
		}
		
		arr[size - 1] = temp; 
		
	}
	
	//Print the array
	void printArray(int arr[], int size) {
		
		for(int i = 0; i < size; i++)
			
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		
		ArrayRotation rotateArray = new ArrayRotation();
		
		int test[] = {1,2,3,4,5,6,7,8,9};
		
		rotateArray.leftRotate(test, test.length, 3);
		rotateArray.printArray(test, test.length);
		
		
	}

}
