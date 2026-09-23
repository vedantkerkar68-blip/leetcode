class Solution {
    public String sortSentence(String str) {
        String words[] = str.split(" ");
        String result[] = new String[words.length];
        for(String s : words){
           String num = s.substring(s.length() - 1);
           int n = Integer.parseInt(num) - 1;
           result[n] = s.substring(0, s.length() - 1);
        }
        return String.join(" ", result);
    }
}