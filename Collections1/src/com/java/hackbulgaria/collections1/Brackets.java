package com.java.hackbulgaria.collections1;

import java.util.Stack;

public class Brackets {
    boolean isCorrectExpression(String expression) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '(') 
                stack.push(c);
            else
                if(c == ')'){
                    if(stack.isEmpty())
                        return false;
                    stack.pop();
                }
                else
                    return false;
            }
        return stack.isEmpty();
    }
}