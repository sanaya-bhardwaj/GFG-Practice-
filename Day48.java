class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        // HashMap to maintain groups of anagrams
        Map<String, ArrayList<String>> umap = new HashMap<>();

        for (String s : arr) {
            char[] charArray = s.toCharArray();

            // Sort each string
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add original string to corresponding sorted string in hash map
            umap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(s);
        }
        for (ArrayList<String> x : umap.values()) {
            result.add(x);
        }

        return result;
    }
}
