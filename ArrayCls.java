//Impleenting array class using methods

import java.util.Arrays;

public class ArrayCls {
    public static void main(String args[])
    {
        int arr1[] = {10,20,30,40,50};

        int arr2[] = {3,5,7,2};

        // using asList Method.
        System.out.println("Array elements as list are: ");
        for(int i=0;i<arr1.length;i++) {
            
            System.out.print(Arrays.asList(arr1[i]) + " ");
        }
        System.out.println();
        // BinarySearch Method.
        Arrays.sort(arr1);
        int keyEle = 20;
        System.out.println(keyEle + " is at index: " + Arrays.binarySearch(arr1,keyEle));

        //using compare method.
        System.out.println("Array comparision: " + Arrays.compare(arr1,arr2));
    }
    
}
