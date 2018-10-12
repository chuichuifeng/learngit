package main;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/11
 */

// 基于数组实现的顺序栈
public class ArrayStack {
    private String[] item;//用于存储数据的数组
    private int n;//栈的大小
    private int count;//栈中数据的多少

    public ArrayStack(int n) {
        item = new String[n];
        this.n = n;
        this.count = 0;
    }

    public boolean push(String m) {
        if (count == n)
            return false;

        item[count] = m;
        ++count;
        return true;
    }

    public String pop() {
        if (count == 0) return null;
        String m = item[count - 1];
        --count;
        return m;
    }
}







