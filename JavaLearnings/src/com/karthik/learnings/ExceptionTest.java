package com.karthik.learnings;

public class ExceptionTest extends ExceptionBase{
	
	public static void main(String args[]){
		ExceptionBase base = new ExceptionBase();
		try {
			base.baseMethod();
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException here");
		} catch(ArithmeticException e){
			System.out.println("Caught ArithmeticException here");
		} catch (ClassNotFoundException e) {
			System.out.println("Caught ClassNotFound here");
		} catch (Exception e) {
			System.out.println("Caught General Exception");
		} finally{
			System.out.println("Finally");
		}
	}

}
class ExceptionBase {
	
	public void baseMethod() throws Exception{
		
		try{
			System.out.println("Throwing NullPointerException");
			throw new NullPointerException(); 
		}
		catch(NullPointerException e){
			System.out.println("Caught NullPointer and throwing Arithmetic");
			throw new ArithmeticException();
		}
		finally{
			System.out.println("Throwing ClassNotFoundException from Finally");
			throw new ClassNotFoundException();
		}
	}

}
