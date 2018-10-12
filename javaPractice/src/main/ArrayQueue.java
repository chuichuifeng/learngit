package main;

/**
 * @version :v1.0
 * @authour :zhangencheng
 * @date :2018/10/12
 */
public class ArrayQueue {
    private int[] array;
    private int capacity;
    private int indextail;
    private int indexhead;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        array = new int[10];
        indextail = 0;
        indexhead = 0;
    }

    //如果
    public boolean enqueue(int num) {
        if (indextail == capacity) {//如果tail到了最后，但是数组中还有空间 就进行数据搬移
            if (indexhead == 0) return false;

            for (int i = 0; i < indextail - indexhead; i++) {
                array[i] = array[i + indexhead];
            }
            indexhead = 0;
            indextail -= indexhead;
        }
        array[indextail] = num;
        indextail++;
        return true;
    }

    public Integer dequeue() {
        if (indextail == indexhead) {
            return null;
        }
        int tmp = array[indexhead];
        indexhead++;
        return tmp;
    }

}
