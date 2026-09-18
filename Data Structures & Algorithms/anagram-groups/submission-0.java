class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr1 = str.toCharArray();
            Arrays.sort(arr1);
            String arr = new String(arr1);
            if(!map.containsKey(arr)){
                List<String> lst = new ArrayList<>();
                lst.add(str);
                map.put(arr,lst);

            }else{
                List<String> list = map.get(arr);
                list.add(str);
                map.put(arr,list);
            }

        }

        for (String s : map.keySet()) {
            List<String> toadd = map.get(s);
            ans.add(toadd);
        }
        return ans;
        
    }
}
