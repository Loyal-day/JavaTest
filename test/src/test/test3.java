package test;

public class test3 {

	public static void main(String[] args){
 
		MainBord mb = new MainBord();
		mb.run();
		mb.useIPC(new NetWork());
		
	}
	
}

class MainBord
{
	public void run()
	{
		System.out.println("MainBord  run");
	}

	public void useIPC(IPC ipc)
	{
		ipc.open();
		ipc.close();
	}
}

interface IPC
{
	public abstract void open();
	public abstract void close();
}

class NetWork implements IPC
{
	public void open()
	{
		System.out.println("NetWork open");
	}

	public void close()
	{
		System.out.println("NetWork close");
	}
} 
