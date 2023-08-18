package PS;

// Find peak index in a mountain array => Leetcode 852
public class peakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        // finding a max no. in an array
        //here we are given that the array is a mountain array
        //array is sorted in increasing order till a point and then in decreasing order

        int start = 0;
        int end = arr.length - 1;

        while(start < end ){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                //you are in decreasing part of an array
                //this may be the answer, but look at left
                //this is why end != mid-1
                end = mid;
            }else{
                //you are in ascending part of an array 
                start = mid + 1; // because we know that mod + 1 element is greater than mid element
            }
        }//at the end start == end and pointing to the largest number because of the two checks above 
         // start and end are always trying to find max element in above two checks
         //hence, when they are pointing to just one element, that is what the checks say
        return start;// or return end as both are equal
    }
}
