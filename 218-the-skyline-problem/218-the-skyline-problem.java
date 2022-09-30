class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> r=new ArrayList();
        List<int []> h=new ArrayList();
        convert(buildings,h);
        Collections.sort(h, (a,b) -> {
            if(a[0] == b[0]) 
                return a[1] - b[1];
            return a[0] - b[0];
        });
         PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a)); // 
        pq.offer(0);
        int prevMax = 0;
        for(int [] ht : h) // n 
        {
            if(ht[1]<0)
                pq.offer(-ht[1]);
            else
                pq.remove(ht[1]); // n
            int currMax = pq.peek();
            if(currMax != prevMax)
            {
                List<Integer> subRes = new ArrayList<>();
                subRes.add(ht[0]);
                subRes.add(currMax);
                
                //add subRes to result
                r.add(subRes);
                prevMax = currMax;
            }
        }
        return r;
    }
    public void convert(int[][] b,List<int[]> h){
        for(int[] x:b){
            h.add(new int[]{x[0],-x[2]});
            h.add(new int[] {x[1],x[2]});
        }
    }
}