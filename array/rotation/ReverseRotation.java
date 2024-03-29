package array.rotation;

public class ReverseRotation {

	//reverse the array
	void reverseArray(int[] arr, int rotateby) {
		if (rotateby == 0) return;
		int arrayLength = arr.length;
		rotateby = rotateby % arrayLength;
		
		reverseArrayByOne(arr,      0,         rotateby-1); //reverse the A array
// 						    (starting indexx) (end index)
		
		reverseArrayByOne(arr,rotateby,       arrayLength-1); //reverse the B array
//		                 (starting indexx) (end index)

		reverseArrayByOne(arr, 0,              arrayLength-1); //reverse the whole array
//		                    (starting indexx) (end index)
	}
	
	//reverse a single array
	void reverseArrayByOne(int[] arr, int start, int end) {
		int temp; //create a temperary variable for swapping
		while (start < end) {
			//swapping the array one by one
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;	
			start++;//go towards end
			end--; //go towards start
		}
	}
	
	//print the array
	void printArray(int[] arr) {
		for (int data:arr)
			System.out.print(data+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int data[] = {1,2,3,4,5,6,7,8,9};
//                   [ A  ][     B    ]
		int arrayLength = data.length;
		int rotate = 2;
		ReverseRotation reverse = new ReverseRotation();
		reverse.reverseArray(data, rotate);
		reverse.printArray(data);
	}

}
