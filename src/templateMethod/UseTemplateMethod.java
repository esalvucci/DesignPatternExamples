package templateMethod;

public class UseTemplateMethod {

	public static void main(String[] args) {
		TMInterface tm = new ConcreteTM();
		
		tm.templateMethod();
		
		TMInterface tm2 = new AbstractTM() {
			
			@Override
			public void operation3() {
				System.out.println("3");
			}
			
			@Override
			public void operation2() {
				System.out.println("2");				
			}
			
			@Override
			public void operation1() {				
			}
		};
		tm2.templateMethod();
	}

}
