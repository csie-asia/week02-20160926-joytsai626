package hw;
import java.util.*;
public class hw03_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner src=new Scanner(System.in);
      System.out.println("西元年");
		int a = src.nextInt();
		
		if(a%400==0)
		{
			System.out.println("閏年");
		}
		else if(a%100==0)
		{
			System.out.println("平年");
		}
		else if(a%4==0)
		{
			System.out.println("閏年");
		}
		else
		{
			System.out.println("平年");
		}
	}

}
