class Solution {
    public static int numberOfSteps(int num) {
        int counter = 0;
        while(num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                counter++;
            } else {
                num = num - 1;
                counter++;
            }
        }

    return counter;
    }
}


public class NumberOfSteps {

    public static void main(String[] args) {


        int input = 123;

        int result = Solution.numberOfSteps(input);
        System.out.println(String.valueOf(result));


    }


}
