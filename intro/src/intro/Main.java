package intro;

public class Main {

	public static void main(String[] args) 
	{
		int number;
		for(number=2; number<=1000;number++) 
		{
			int check=0;
			for(int i= 2;i<number; i++) 
			{
				if(number%i==0)
				{
					check = 1;
					break;
				}				
			}
			if(check==0) {
				System.out.println(number+"\n");
			}
		}
	}

}
