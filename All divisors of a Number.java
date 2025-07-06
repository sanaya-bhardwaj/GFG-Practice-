class Solution {
    public static void print_divisors(int n) {
        // code here
        int i;
        List<Integer> list = new ArrayList<>();
        for(i=1;i<= Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                
                if((n/i)!=i){
                    list.add(n / i);
                }
            }
            
        }
        Collections.sort(list);
        for (int N : list) {
            System.out.print(N + " ");
        }
    }
}
