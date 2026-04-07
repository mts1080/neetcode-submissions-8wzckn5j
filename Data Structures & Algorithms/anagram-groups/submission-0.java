class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            HashMap<Character, Integer> s = new HashMap<>();
            for (int x = 0; x < str.length(); x++) {
                s.put(str.charAt(x), s.getOrDefault(str.charAt(x),0)+1);
            }

            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
                
            map.get(s).add(str);
        }

        List<List<String>> list = new ArrayList<>();
        for (HashMap<Character, Integer> key : map.keySet()) {
            list.add(map.get(key));
        }

        return list;
    }
}
