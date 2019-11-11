
class Solution {
    public Stack buildStack(String str){
        Stack<Character>stack = new Stack<Character>();
        int len = str.length();
        for(int i = 0; i < len; i++){
            char c = str.charAt(i);
            if(c=='#'){
                if(stack.empty()!=true)
                     stack.pop();
            }
            else
                stack.push(c);
            
        }
        return stack;
    }
    public boolean backspaceCompare(String S, String T) {
        Stack<Character>stack1 = new Stack<Character>();
        Stack<Character>stack2 = new Stack<Character>();
        stack1 = buildStack(S);
        stack2 = buildStack(T);
        while(!stack1.empty()&&!stack2.empty()){
            Character c1 = stack1.pop();
            Character c2 = stack2.pop();
            if(c1.compareTo(c2)!=0)
                return false;
        }
        if((stack1.empty()==true)&&(stack2.empty()==true))
            return true;
        else 
            return false;
    }
}
