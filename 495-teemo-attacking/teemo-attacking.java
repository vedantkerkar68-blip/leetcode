class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
     
     int s=duration;
     for(int i=1;i<timeSeries.length;i++){
        if(timeSeries[i]<(timeSeries[i-1]+duration)){
            s+=(duration-(duration-(timeSeries[i]-timeSeries[i-1])));
        }
        else{
            s+=duration;
        }
     } 
     return s;
    }
}