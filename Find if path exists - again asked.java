class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] pathArray = new ArrayList[n];
        for(int i=0;i<n;i++){
            pathArray[i]=new ArrayList<>();
        }

        for(int[] edge:edges){
            int e1=edge[0];
            int e2=edge[1];

            pathArray[e1].add(e2);
            pathArray[e2].add(e1);             
        }

        boolean[] visited=new boolean[n];

        return pathCheck(n,visited,pathArray,source,destination);
    }

    public boolean pathCheck(int n , boolean[] visited , ArrayList<Integer>[] graph,int src,int dest){
        if(src==dest) return true;

        visited[src]=true;

        for(int neighbour:graph[src]){
            if(!visited[neighbour]){
                if(pathCheck(n,visited,graph,neighbour,dest)){
                    return true;
                }
            }
        }

        return false;
    }
}