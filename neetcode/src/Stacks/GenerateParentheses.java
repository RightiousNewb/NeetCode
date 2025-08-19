package Stacks;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private void backtrack(int openP, int closedP, int n, List<String> res, StringBuilder stack){
            if(openP == closedP && openP == n){
                res.add(stack.toString());
                return;
            }
            if(openP < n){
                stack.append("(");
                backtrack(openP+1, closedP, n, res, stack);
                stack.deleteCharAt(stack.length()-1);
            }
            if(closedP < openP){
                stack.append(")");
                backtrack(openP, closedP+1, n, res, stack);
                stack.deleteCharAt(stack.length()-1);
            }

        }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0, 0, n, res, stack);
    
        return res;
    }
}
