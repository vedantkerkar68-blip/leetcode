class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        PriorityQueue<int[]> busy=new PriorityQueue<>(
            (a,b)-> Integer.compare(a[0],b[0])
            );
        PriorityQueue<int[]> idle=new PriorityQueue<>(
            (a,b)-> {
                if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
                return Integer.compare(a[1],b[1]);
            }
            );
        for(int i=0;i<servers.length;i++){
            idle.offer(new int[]{servers[i],i});
        }
        int ts=0;
        int[] ans=new int[tasks.length];
        for(int i=0;i<tasks.length;i++){
            ts=Math.max(ts,i);
            while(!busy.isEmpty() && busy.peek()[0]<= ts){
                int[] s=busy.poll();
                idle.offer(new int[]{servers[s[1]],s[1]});
            }
            if(idle.isEmpty()){
                ts=busy.peek()[0];
                while(!busy.isEmpty() && busy.peek()[0]<= ts){
                int[] s=busy.poll();
                idle.offer(new int[]{servers[s[1]],s[1]});
            }
            }
            int[] server=idle.poll();
            int idx=server[1];
            ans[i]=idx;
            busy.offer(new int[]{ts+tasks[i],idx});

        }
        return ans;
    }
}