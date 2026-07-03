class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> l=new ArrayList<>();
        pp(s,new ArrayList<>(),l);
        return l;
    }
    public static void pp(String s,List<String> ans,List<List<String>>l){
        if(s.length()==0){
            l.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<s.length();i++){
            if(isPal(s.substring(0,i+1))){
                ans.add(s.substring(0,i+1));
                pp(s.substring(i+1),ans,l);
                ans.remove(ans.size()-1);
            }
        }

    }
    public static boolean isPal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}