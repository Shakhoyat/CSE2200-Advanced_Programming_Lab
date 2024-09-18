import java.util.Scanner;

public class Roll2107104_task1 {
    public static void main(String[] args) {
        Scanner skt = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int size = skt.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = skt.nextInt();
        }
        System.out.print("Enter your target ,that's frequency you want to find =");
        int target = skt.nextInt();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == target) {
                count++;
            }
        }
        System.out.println("The Frequency of the chosen target : " + target + " is actually = " + count);
    }

}
