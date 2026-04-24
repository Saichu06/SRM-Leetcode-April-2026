class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] distance=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(distance[i],Integer.MAX_VALUE);
            distance[i][i]=0;
        }

        for(int[] edge:edges){
            int node1=edge[0];
            int node2=edge[1];
            int dist=edge[2];

            distance[node1][node2]=dist;
            distance[node2][node1]=dist;
        }

        for(int middle=0;middle<n;middle++){
            for(int source=0;source<n;source++){
                for(int destination=0;destination<n;destination++){
                    if (distance[source][middle] == Integer.MAX_VALUE || 
    distance[middle][destination] == Integer.MAX_VALUE) {
    continue;
}

                    distance[source][destination]=Math.min(distance[source][destination],distance[source][middle] + distance[middle][destination]);
                }
            }
        }


        int ans=-1;
        int minCount=Integer.MAX_VALUE;

        for(int source=0;source<n;source++){
            int source_count=0;
            for(int destination=0;destination<n;destination++){
                if(distance[source][destination]<=distanceThreshold){
                    source_count++;
                }
            }

            if(source_count<=minCount){
                minCount=source_count;
                ans=source;
            }
        }

        return ans;
    }
}