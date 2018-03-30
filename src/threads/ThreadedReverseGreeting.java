package threads;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	public static void main(String[] args) {
			makeThreads(50);
		
			
			//int threadNum = i;
			//Thread r = new Thread(()->{System.out.println("Hello from Thread " + threadNum + "!");});
			
	}
	
	static void makeThreads (int i) {
		if(i>0) {
			Thread r = new Thread(()->{makeThreads(i-1);});
			r.start();
		}
		System.out.println("Hello from Thread " + i + "!");
	}
	

}
	


