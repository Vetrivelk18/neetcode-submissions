class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char cha = s.charAt(i);

            if (cha == '(' || cha == '{' || cha == '[') {
                stack.push(cha);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                else if (cha == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

                else if (cha == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

                else if (cha == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}