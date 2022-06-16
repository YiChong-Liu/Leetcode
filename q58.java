public class q58 {
    public int lengthOfLastWord(String s) {
        String []words = s.split(" ");
        /*for(String str : words ) {
            System.out.print(str + ' ');
        }
        System.out.println();*/

        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World moon ";
        q58 sol = new q58();
        System.out.println(sol.lengthOfLastWord(s));
    }
}
