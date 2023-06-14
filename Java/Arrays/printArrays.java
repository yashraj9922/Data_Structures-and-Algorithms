public class printArrays {
    void printArray(int arr[]){
        int len = arr.length;
        for(int i = 0; i<len; i++){
            System.out.print(" "+arr[i]);
        }
    }

    static void printarray(int arr[]){
        int len = arr.length;
        for(int i = 0; i<len; i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {

        int array[] = {1,4,2,5,67,3,34};
        printArrays obj = new printArrays();

        obj.printArray(array);
        System.out.println("\n");
        printarray(array);
    }
}
