package com.jvs.app;

public class Main01 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(" Detecting state of the running thread: "+t.isAlive());
		// [name of the thread, priority, name of thread group]
		/* thread group: it is a data structure that controls the state of a
		collection of threads as a whole */
		System.out.println(" Current thread before renaming: "+t);
		System.out.println(" Priority of the current thread: "+t.getPriority());
		t.setName("My Thread");
		System.out.println(" Current thread after renaming: "+t.getName());
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("\t"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
	}

}
