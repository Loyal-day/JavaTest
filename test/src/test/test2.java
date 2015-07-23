package test;

public class test2 {

	abstract class Door{	
		
		public void open(){
			System.out.println("AllOpen");
		}
		
		abstract public void close();
		
	}


	class IronDoor extends Door{
		
		public void close() {
			System.out.println("tiemen open");	
		}
		
		public void catEye(){
			System.out.println("maoyan");
		}

	}


	class WoodDoor extends Door{

		public void close() {
			System.out.println("mumen open");	
		}
		
	}

	interface DoorBell{
		public abstract void ring();
	}

	interface Lock{
		public abstract void LockDoor();
	}


	//Ì×²Í¾ÙÀý£º
	class IronDwithDoorB extends IronDoor implements DoorBell{
		
		public void ring() {
			// TODO Auto-generated method stub
			
		}
	}


}

