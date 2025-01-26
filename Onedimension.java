import java.util.*;
public class Onedimension{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i<5; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Elements in array are: ");
        for(int i = 0; i<5; i++){
            System.out.print(array[i]+" ");
        }
    }
}




