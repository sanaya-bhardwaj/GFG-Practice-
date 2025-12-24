class Solution {

    // Find with path compression
    private int find(int x, int par[]) {
        if (par[x] != x) {
            par[x] = find(par[x], par);
        }
        return par[x];
    }

    // Union two nodes
    public void union_(int a, int b, int par[], int rank[]) {
        int rootA = find(a, par);
        int rootB = find(b, par);

        if (rootA == rootB) return;

        // Union by rank
        if (rank[rootA] < rank[rootB]) {
            par[rootA] = rootB;
        } else if (rank[rootA] > rank[rootB]) {
            par[rootB] = rootA;
        } else {
            par[rootB] = rootA;
            rank[rootA]++;
        }
    }

    // Check if two nodes are connected
    public Boolean isConnected(int a, int b, int par[], int rank[]) {
        return find(a, par) == find(b, par);
    }
}
