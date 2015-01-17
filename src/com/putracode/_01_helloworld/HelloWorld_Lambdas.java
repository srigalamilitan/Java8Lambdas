package com.putracode._01_helloworld;

public class HelloWorld_Lambdas {

	public static void main(String[] args) {
		
//		Old ways, Implementatios The Interface IHelloWorld		
		IHelloWorld oldWays=new IHelloWorld() {
			@Override
			public void process() {
				System.out.println("HelloWorld Old Way");
			}
		};
//		New Ways.. Lambdas Expression		
		IHelloWorld newWays=()->{System.out.println("Hello World New Way, Lambda");};

//		call the method
		oldWays.process();
		newWays.process();
	}

}

@FunctionalInterface
interface IHelloWorld{
	void process();
}