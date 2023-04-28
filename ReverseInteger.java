public class ReverseInteger {
        public int reverse(int x) {
            long ans = 0;
            //checking if the input digit is zero or not
            while (x != 0) {
                // reversing the digit!!!
                ans = ans * 10 + x % 10;
                x /= 10;
            }
            return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
        }
    }
