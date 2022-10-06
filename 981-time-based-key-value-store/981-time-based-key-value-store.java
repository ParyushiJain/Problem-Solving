class TimeMap {
       HashMap<String, ArrayList<Pair<Integer, String>>> hm;
    public TimeMap() {
        hm=new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!hm.containsKey(key)) {
            hm.put(key, new ArrayList());
        }
        
        hm.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
             if (!hm.containsKey(key)) {
            return "";
        }
        
        if (timestamp < hm.get(key).get(0).getKey()) {
            return "";
        }
        
        // Using binary search on the list of pairs.
        int left = 0;
        int right = hm.get(key).size();
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (hm.get(key).get(mid).getKey() <= timestamp) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // If iterator points to first element it means, no time <= timestamp exists.
        if (right == 0) {
            return "";
        }
                
        return hm.get(key).get(right - 1).getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */