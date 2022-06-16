public class q134 {
    

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int len = gas.length;
        /*int sum = 0;


        for(int i = 0; i < len; i++) {
            sum += (gas[i] - cost[i]);
        }

        // Total amount of gas is less than the total cost
        if(sum < 0) {
            return -1;
        }*/

        int start = -1;
        int myGas = 0;
        for(int i = 0; i < len; i++) {
            myGas += gas[i] - cost[i];
            if(myGas < 0) {
                start = i + 1;
                myGas = 0;
            }
            
        }

        return start;
    }

    public static void main(String[] args) {
        int []gas = {1,2,3,4,5};
        int []cost = {3,4,5,1,2};
        q134 sol = new q134();
        System.out.println(sol.canCompleteCircuit(gas, cost));
    }
}
