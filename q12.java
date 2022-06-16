public class q12 {

    public String intToRoman(int num) {

        // Check if it's a valid number
        if (num < 1 || num > 3999) {
            return "";
        }
        int []nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        int index = 0;
        while(num > 0) {
            while(num >= nums[index]) {
                num -= nums[index];
                res.append(roman[index]);
            }
            index++;
        }

        return res.toString();
    }

    public static void main(String[] args) {
        q12 sol = new q12();

        System.out.println(sol.intToRoman(1994));
    }
}
