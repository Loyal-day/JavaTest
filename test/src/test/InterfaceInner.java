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
			System.out.println("�����ڲ����е�f()����");
		}
				
	}
	
	public OutInterface doit(){
		return new InnerClass("�����ڲ��๹�췽��");
	}
	
}

