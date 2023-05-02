
public class SignProductsOfArray {
    //Method -1 Without considering any constraints but after considering constraints we get error and our output exceeds the range of integer
    public static int signarray(int nums[]) {
        int res = 0;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                product = 0;
                break;
            }
            product = product * nums[i];
        }

        if (product == 0) {
            return 0;
        }
        if (product > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    //Method-2
    public static int ArraySign(int nums[]) {
        int neg = 0;
        boolean Predict = true;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                Predict = false;
                break;
            }
//            product=product*nums[i];
            if (nums[i] < 0) {
                neg = neg + 1;
            }
        }
        if (!Predict) {
            return 0;
        }
        if (neg % 2 == 0) {
            return 1;
        }
        else  {
            return -1;
        }

    }

    public static void main(String [] args){

        int [] nums =
                {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int A=signarray(nums);
        int B= ArraySign(nums);
        System.out.println(A);
        System.out.println(B);

    }
}
