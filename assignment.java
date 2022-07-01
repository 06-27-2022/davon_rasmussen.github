package Starter.Revature_Work;

public class assignment {

    public static void main(String[] args) {
        int[] arr = new int[8];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;

        int sum = 0;

        int lengthOfArray = arr.length;

        for (int i = 0; i < lengthOfArray; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }

}
