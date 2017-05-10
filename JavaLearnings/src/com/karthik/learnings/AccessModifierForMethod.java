package com.karthik.learnings;

public class AccessModifierForMethod{


	
}

class BaseModifier{
	void defaultMethod(){
		
	}
	public void publicMethod(){
		
	}
	protected void protectedMethod(){
		
	}
	private void privateMethod(){
		
	}
}

class MakePublicModifier  extends BaseModifier{
	public void defaultMethod(){
		
	}
	public void publicMethod(){
		
	}
	public void protectedMethod(){
		
	}
	public void privateMethod(){
		
	}
}

class MakeDefaultModifier  extends BaseModifier{
	void defaultMethod(){
		
	}
//	void publicMethod(){
//		
//	}
//	void protectedMethod(){
//		
//	}
	void privateMethod(){
		
	}
}



class MakeProtectedModifier  extends BaseModifier{
	protected void defaultMethod(){
		
	}
//	protected void publicMethod(){
//		
//	}
	protected void protectedMethod(){
		
	}
	protected void privateMethod(){
		
	}
}
