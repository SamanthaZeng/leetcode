class Solution {
    public boolean isValid(String s) {
        Map<Character, Character>map = new HashMap();
        Stack<Character> stack = new Stack<Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        int len = s.length();
        for(int i = 0; i < len; i++){
            Character c = s.charAt(i);
            if(map.containsKey(c))//it is left parenthese
                stack.push(c);
            else{
                if(stack.empty())
                    return false;
                Character left = stack.peek();
                if(c.equals(map.get(left)))
                    stack.pop();
                else
                    return false;
                }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}
