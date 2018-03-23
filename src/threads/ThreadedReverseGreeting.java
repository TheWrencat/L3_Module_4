
public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	for(int i = 0; i<50; i++) {
		Thread i = new Thread(()->{System.out.println("Hello from Thread " + i+ "!");});
		
	}
}
