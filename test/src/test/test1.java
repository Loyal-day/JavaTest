package test;

public class test1 {
	
	public static void main(String args[]){
		
		people p = new people("wnm",20);
		p.sleep();
		p.eat();
		student s = new student();
		s.setname("zqd");
		s.setage(21);
		s.sleep();
		s.eat();
		s.study();
		student.usestudent ss = s.new usestudent();
		ss.getall();
	}

}

class people{
	static{
		System.out.println("静态代码块1");
	}
	{
		System.out.println("构造代码块1");
	}
	
	private String name;
	private int age;
	
	public people(){
		System.out.println("构造函数11");
	}
	
	public people(String name, int age){
		System.out.println("构造函数12");
		this.name=name;
		this.age=age;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public void setage(int age){
		this.age = age;
	}
		
	public String getname(){
		return this.name;
	}
	
	public int getage(){
		return this.age;
	}
	
	public void eat(){
		System.out.println(this.name+" eat");
	}
	
	public void sleep(){
		System.out.println(this.name+" sleep");
	}
}

class student extends people{
	static{
		System.out.println("静态代码块2");
	}
	{
		System.out.println("构造代码块2");
	}
	
	public student(){
		System.out.println("构造函数21");
	}
	
	public student(String name, int age){
		System.out.println("构造函数22");
		setname(name);
		setage(age);
	}
	
	public void study(){
		System.out.println(getname()+" study");
	}
	
	public class usestudent{
		public void getall(){
			System.out.println(getname()+" "+getage());
		}
	}
}

