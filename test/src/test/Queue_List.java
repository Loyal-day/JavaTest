package test;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_List<T> {
    private Queue<T> storage = new LinkedList<T>();

    // ��ָ����Ԫ�ز����β 
    public void offer(T v) {
        storage.offer(v);
    }

    // ���������ǲ��Ƴ����е�ͷ������˶���Ϊ�գ��򷵻� null 
    public T peek() {
        return storage.peek();
    }

    // ���������ǲ��Ƴ��˶��е�ͷ 
    // �˷����� peek ������Ωһ��ͬ�ǣ�����˶���Ϊ�գ������׳�һ���쳣 
    public T element() {
        return storage.element();
    }

    // �������Ƴ��˶��е�ͷ���������Ϊ�գ��򷵻� null 
    public T poll() {
        return storage.poll();
    }

    // �������Ƴ��˶��е�ͷ
    // �˷����� poll �����Ĳ�ͬ���ڣ�����˶���Ϊ�գ������׳�һ���쳣
    public T remove() {
        return storage.remove();
    }

    // �����Ƿ�Ϊ��
    public boolean empty() {
        return storage.isEmpty();
    }

    // ��ӡ����Ԫ�� 
    public String toString() {
        return storage.toString();
    }
    
    //ջԪ������
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