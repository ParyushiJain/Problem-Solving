class Solution {
   public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
		//get the index of the "x" using binary search ans if you didnt get "x" in array just return pointer "e" whose value will be -1 in the end;
        int index=bin(arr,x);
		//we will pass two pointers from here one will point at "index" and the other will point at "index+1"
        adder(arr,k,x,index,index+1,ans);
        return ans; 
    }
    public void adder(int[] nums,int k,int x,int s,int e,List<Integer> ans){
        while(k>0 && s>=0 && e<nums.length){
            if((Math.abs(nums[s]-x)<Math.abs(nums[e]-x)) || (Math.abs(nums[s]-x)==Math.abs(nums[e]-x) && nums[s]<nums[e])){
			    // to add at the start of the arraylist
                ans.add(0,nums[s]);
                s--;
            }else{
			    // to add at the end of arraylist
                ans.add(ans.size(),nums[e]);
                e++;
            }
            k--;
        }
		//if second pointer move fast and reached to the end ,and we still have k>0 than we have to append the first pointer value in the arraylist till k>0
        while(k>0 && s>=0){
            ans.add(0,nums[s]);
            s--;
            k--;
        }
		//if first pointer move fast and reached to s<0 ,and we still have k>0 than we have to append the second pointer value in the arraylist till k>0
        while(k>0 && e<nums.length){
            ans.add(ans.size(),nums[e]);
            e++;
            k--;
        }
    }
    public int bin(int[] arr,int x){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return e;
    }
}