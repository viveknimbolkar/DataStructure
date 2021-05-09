/*
 * @author Vivek Nimbolkar
 * Sum of given array
 */
public class SumOfArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,34,34,654,3,234,34,654,654,684,654,654651,64,84,654,684,654,68,51,684,65,489,874,98,7,684,654,654,168,498,47,654,9648,68,49,674,654};
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];		
		}
		
		System.out.println(sum);
	}

}
