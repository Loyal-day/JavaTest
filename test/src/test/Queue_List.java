package test;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_List<T> {
    private Queue<T> storage = new LinkedList<T>();

    // 将指定的元素插入队尾 
    public void offer(T v) {
        storage.offer(v);
    }

    // 检索，但是不移除队列的头，如果此队列为空，则返回 null 
    public T peek() {
        return storage.peek();
    }

    // 检索，但是不移除此队列的头 
    // 此方法与 peek 方法的惟一不同是，如果此队列为空，它会抛出一个异常 
    public T element() {
        return storage.element();
    }

    // 检索并移除此队列的头，如果队列为空，则返回 null 
    public T poll() {
        return storage.poll();
    }

    // 检索并移除此队列的头
    // 此方法与 poll 方法的不同在于，如果此队列为空，它会抛出一个异常
    public T remove() {
        return storage.remove();
    }

    // 队列是否为空
    public boolean empty() {
        return storage.isEmpty();
    }

    // 打印队列元素 
    public String toString() {
        return storage.toString();
    }
    
    //栈元素数量
    public int size() {
    	return storage.size();
    }
    
    public static void main(String[] args) {
    	Queue_List<String> stack=new Queue_List<String>();
        stack.offer("a");
        stack.offer("b");
        stack.offer("c");
        //[a, b, c]
        System.out.println(stack.toString());
        
        Object obj=stack.peek();
        // a--[a, b, c]
        System.out.println(obj+"--"+stack.toString());
        obj=stack.element();
        // a--[a, b, c]
        System.out.println(obj+"--"+stack.toString());
        obj=stack.poll();
        //a--[b, c]
        System.out.println(obj+"--"+stack.toString());
        obj=stack.remove();
        //b--[c]
        System.out.println(obj+"--"+stack.toString());
        //false
        System.out.println(stack.empty());
    }
}