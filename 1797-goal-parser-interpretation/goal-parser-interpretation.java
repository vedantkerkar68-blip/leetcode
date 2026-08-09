class Solution {
    public String interpret(String command) {
       StringBuilder goal = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                goal.append('G');
            }else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                goal.append('o');
                i += 1;
            }
            else {
                goal.append("al");
                i += 3;
            }
        }
        return goal.toString();
    }
}