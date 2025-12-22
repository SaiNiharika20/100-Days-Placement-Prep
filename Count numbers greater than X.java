import java.util.Scanner;
public class Main{
    static int Count(int[] arr , int x){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x value: ");
        int x = sc.nextInt();
        int result = Count(arr,x);
        System.out.println("Count = " + result);
    }
}
