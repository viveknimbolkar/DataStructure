package algorithms;

public class InterpolationSearch {

    public static void main(String[] args) {
        InterpolationSearch is = new InterpolationSearch();
        int[] elements = {1,3,5,7,11,13,15,17,19,21};
        int find = 17;
        System.out.println(is.interpolationSearch(
                elements,
                find,
                elements[0],
                elements[elements.length-1])
        );
    }

    int interpolationSearch(int[] arr, int search, int low, int high){
        int indexOfElement;

        //elemenet should be lies in between low and high element
        if (search >= arr[low] && search <= arr[high] && low <= high){
            indexOfElement = low +((high - low)/ (arr[high] - arr[low])) * (search - arr[low]);

            if (arr[indexOfElement] == search)
                return indexOfElement;

            //if array is not uniformaly distributed
            //i.e. element is less than indexOfElement
            if (arr[indexOfElement] < search)
                return interpolationSearch(arr,search,indexOfElement+1,high);

            //i.e. element is greater than indexOfElement
            if (arr[indexOfElement] > search)
                return interpolationSearch(arr,search,low,indexOfElement-11);
        }
        return -1;
    }
}
