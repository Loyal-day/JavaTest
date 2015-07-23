package test;

interface OutInterface{
	public void f();
}

public class InterfaceInner {
	
	public static void main(String args[]){
		
		OuterClass out = new OuterClass();
		OutInterface outinter = out.doit();
		outinter.f();
		
	}
	
}

class OuterClass{
	
	private class InnerClass implements OutInterface{
		
		InnerClass(String s){
			System.out.println(s);
		}
		
		public void f(){
			System.out.println("访问内部类中的f()方法");
		}
				
	}
	
	public OutInterface doit(){
		return new InnerClass("访问内部类构造方法");
	}
	
}

