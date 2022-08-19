class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                int v=hm.get(nums[i]);
                v++;
                hm.put(nums[i],v);
            }
        }
        ArrayList<Integer> al=new ArrayList();
        while(k!=0){
        int key=Collections.max(hm.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
        al.add(key);
            hm.remove(key);
            k--;
        }
        int[] a=new int[al.size()];
        for(int i=0;i<al.size();i++){
            a[i]=al.get(i);
        }
        return a;
    }
}