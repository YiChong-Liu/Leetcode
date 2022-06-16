import java.util.List;
import java.util.ArrayList;
public class q1773 {
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int index = 0;
        if(ruleKey.equals("type")) {
            index = 0;
        } else if(ruleKey.equals("color")) {
            index = 1;
        }
        else if(ruleKey.equals("name")) {
            index = 2;
        }

        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).get(index).equals(ruleValue)){
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        q1773 sol = new q1773();
        List<List<String>> all = new ArrayList <List<String>>();
        List<String> l1 = new ArrayList<>();

        l1.add("phone");
        l1.add("blue");
        l1.add("pixel");

        List<String> l2 = new ArrayList<>();

        l2.add("computer");
        l2.add("silver");
        l2.add("lenovo");

        List<String> l3 = new ArrayList<>();

        l3.add("phone");
        l3.add("gold");
        l3.add("iphone");

        all.add(l1);
        all.add(l2);
        all.add(l3);

        System.out.println(sol.countMatches(all, "color", "silver"));
    }
}
