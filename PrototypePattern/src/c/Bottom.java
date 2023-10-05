package c;

public class Bottom extends Middle implements Cloneable {
	
	protected int bottomInt;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
	    return super.clone();
	  }
}