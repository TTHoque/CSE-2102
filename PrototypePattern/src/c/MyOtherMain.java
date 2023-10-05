package c;

public class MyOtherMain {

	public static void main(String[] args)  { // throws CloneNotSupportedException
		try {
			Bottom b1 = new Bottom();
			b1.topInt = 5;
			b1.middleInt = 5;
			b1.bottomInt = 5;
			
			Bottom b2 = (Bottom) b1.clone();
			
			b2.topInt = -77;
			b2.middleInt = -100;
			b2.bottomInt = -99;
			
			System.out.println(b2.topInt);
			System.out.println(b2.middleInt);
			System.out.println(b2.bottomInt);
			
			System.out.println(b1.topInt);
			System.out.println(b1.middleInt);
			System.out.println(b1.bottomInt);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}	
	}
}