class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int e[] : edges){
            int u=e[0];
            int v=e[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited=new boolean[n];

        return dfs(source,destination,graph,visited);
    }


    public boolean dfs(int source , int destination , ArrayList<Integer>[] graph , boolean[] visited){
        if(source==destination) return true;

        visited[source]=true;
        for(int nei:graph[source]){
            if(!visited[nei]){
                if(dfs(nei,destination,graph,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}