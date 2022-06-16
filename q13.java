public class q13 {

    public int romanToInt(String s) {
        int num = 0;
        char[] str = s.toCharArray();

        for (int i = str.length - 1; i >= 0; i--) {
            if(i >= 1) {
                if(str[i] =='M' && str[i - 1] == 'C') {
                    num += 900;
                    i--;
                }
                else if(str[i] == 'M') {
                    num += 1000;
                }
                else if(str[i] == 'D' && str[i - 1] == 'C') {
                    num += 400;
                    i--;
                }
                else if(str[i] == 'D') {
                    num += 500;
                }
    
                else if(str[i] == 'C' && str[i - 1] == 'X') {
                    num += 90;
                    i--;
    
                }
    
                else if(str[i] == 'C') {
                    num += 100;
                }
    
                else if(str[i] == 'L' && str[i - 1] == 'X') {
                    num += 40;
                    i--;
                }
    
                else if(str[i] == 'L') {
                    num += 50;
                }
                else if(str[i] == 'X' && str[i - 1] == 'I') {
                    num += 9;
                    i--;
                }
    
                else if(str[i] == 'X') {
                    num += 10;
                }
                else if(str[i] == 'V' && str[i - 1] == 'I') {
                    num += 4;
                    i--;
                }
    
                else if(str[i] == 'V') {
                    num += 5;
                }
                else if(str[i] == 'I') {
                    num += 1;
                }
            } else {
                if(str[i] == 'M') {
                    num += 1000;
                }
                else if(str[i] == 'D') {
                    num += 500;
                }
       
                else if(str[i] == 'C') {
                    num += 100;
                }
    
                else if(str[i] == 'L') {
                    num += 50;
                }
    
                else if(str[i] == 'X') {
                    num += 10;
                }
                else if(str[i] == 'V') {
                    num += 5;
                }
                else if(str[i] == 'I') {
                    num += 1;
                }
            }

           // System.out.println(num);
        }

        return num;
    }

    public static void main(String[] args) {
        String s = "LDL";
        q13 sol = new q13();

        System.out.println(sol.romanToInt(s));
    }
}
