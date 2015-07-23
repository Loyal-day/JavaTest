package test;

import java.util.LinkedList;

public class Stack_List<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    // ��ջ 
    public void push(T v) {
        storage.addFirst(v);
    }

    // ��ջ������ɾ�� 
    public T peek() {
        return storage.getFirst();
    }

    // ��ջ��ɾ�� 
    public T pop() {
        return storage.removeFirst();
    }

    // ջ�Ƿ�Ϊ�� 
    public boolean empty() {
        return storage.isEmpty();
    }

    // ��ӡջԪ�� 
    public String toString() {
        return storage.toString();
    }
    
    // ջԪ������
    public int size() {
    	return storage.size();
    }
    
    public static void main(String[] args) {
    	
        Stack_List<String> stack=new Stack_List<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        //[c, b, a]
        System.out.println(stack.toString());
        //c--[c, b, a]
        Object obj=stack.peek();
        System.out.println(obj+"--"+stack.toString());
        obj=stack.pop();
        //c--[b, a]
        System.out.println(obj+"--"+stack.toString());
        //false
        System.out.println(stack.empty());
    }
    
}
