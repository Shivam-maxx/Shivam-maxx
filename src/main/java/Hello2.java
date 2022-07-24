interface Hello{
	public void Expre();
}
public class Hello2{
	public static void main(String[] args) {
		int number=5;
		Hello n =()->{
			System.out.println("Hello " + number);
		};
	    n.Expre();
		
			
	}
}