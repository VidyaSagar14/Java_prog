
public class SelectionDemo {
	public static void main(String[] args)
	{
		int n=7;
			/*if(true)
				System.out.println("Hello");
			if(true)
				System.out.println("Bye");*/
		//ternary operators->condition?expr1:expr2
		int i=8;
		int j=0;
			if(i>6)
				j=1;
			else
				j=2;
			System.out.println(j);
			System.out.println("Using Ternary operation:");
			j=i>6?1:2;
			System.out.println(j);
		
	}

}
