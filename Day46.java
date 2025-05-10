class Solution {
    public static int findUnion(int a[], int b[]) {
        // Using HashSet to store the elements.
        HashSet<Integer> s = new HashSet<>();

        // Insert all the elements of the first array into the HashSet.
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }

        // Insert all the elements of the second array into the HashSet.
        // HashSet automatically handles duplicates.
        for (int i = 0; i < b.length; i++) {
            s.add(b[i]);
        }

        // Returning the size of the HashSet which is the total number
        // of unique elements in the union of both arrays.
        return s.size();
    }
}
