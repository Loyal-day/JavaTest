package test;

public class test4 {

	public static void main(String[] args){
		
		TOnWater w = new TOnWater();
		w.run();
	}
	
}

interface runfunction{
	public void run();
}

abstract class transportation{	
	public void doanything(){
	}
}

class TOnGround extends transportation implements runfunction{

	public void run(){
		System.out.println("run on ground");
	}
	
}

class TOnWater extends transportation implements runfunction{
	
	public void run(){
		System.out.println("run on water");
	}
	
}
