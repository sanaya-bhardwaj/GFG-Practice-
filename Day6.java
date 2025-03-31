class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int a=nums.length/3;
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int j:map.keySet()){
            if(map.get(j)>a){
                res.add(j);
            }
        }
        return res;
    }
}
