import java.util.*;
public class Matsuoka{
	public static void main(String[] args){
		int i;
		for(i=1;i<21;i++){
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}else if(i%3==0){
				System.out.println("Buzz");
			}else if(i%5==0){
				System.out.println("Fizz");
			}else{
				System.out.println(i);
			}
		}
	}
}
