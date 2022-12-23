package classificandomatrizes;

import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i;
        int j;
        int imparBug;
        int N = input.nextInt();
        int[] nums = new int[N];

        for (i = 0; i < N; i++) {

            nums[i] = input.nextInt();

        }

        for (i = 0; i < N; i++) {

            if (nums[i] % 2 != 0) {

                for (j = i + 1; j < N; j++) {

                    if (nums[j] % 2 == 0) {

                        imparBug = nums[i];
                        nums[i] = nums[j];
                        nums[j] = imparBug;
                        j = N;


                    }
                }
            }
        }

        for (i = 0; i < N; i++) {

            System.out.println(nums[i]);
        }
    }
}



