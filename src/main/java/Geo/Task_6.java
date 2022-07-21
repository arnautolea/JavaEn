package Geo;

public class Task_6 {

    public static void main(String[] args) {
        int low = 20, high = 50;

        while (low < high) {
            if(checkNumber(low))
                System.out.print(low + " ");
            ++low;
        }
    }

    public static boolean checkNumber(int num) {
        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {

            if(num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
//output 23 29 31 37 41 43 47