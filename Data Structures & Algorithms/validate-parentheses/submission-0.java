class Solution {
    public boolean isValid(String s) {
        //Если видим открывающую скобку ((, [, {), кладем её в стек.
        //Если видим закрывающую скобку, проверяем: совпадает ли она с той открывающей, которая лежит на вершине стека? Если да — убираем её из стека. Если нет или стек пуст — строка невалидна.
        Stack<Character> stack = new Stack<>(); 
        for(char c : s.toCharArray()){

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else{
                if (stack.isEmpty()) {return false ;}
                
                char top = stack.pop(); 
                if (c - top != 1 && c - top != 2) {
                    return false;
                }

            }
        }
 // Если стек в конце пустой, значит все скобки нашли свою пару
        return stack.isEmpty();
    }
}
