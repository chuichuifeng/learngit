package main;

import java.util.Stack;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/11
 */
//用栈检查特殊符号匹配 {[( faksdhfak )]}
public class SymbolMatch {
    private char symbol1 = '{';
    private char symbol2 = '[';
    private char symbol3 = '(';

    public boolean isMatch(String str) {
        Stack stack = new Stack();
        boolean flag = true;
        int i = 0;
        while (str.charAt(i) == symbol1 || str.charAt(i) == symbol1 || str.charAt(i) == symbol1 ) {

        }
        return flag;
    }
}
