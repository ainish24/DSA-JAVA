import java.util.*;
public class reverseArray {
    public static int[] reversedArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array to be reversed");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] rvrsdArr=reversedArray(arr);
        System.out.println("Reversed Array: ");
        for (int i : rvrsdArr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
