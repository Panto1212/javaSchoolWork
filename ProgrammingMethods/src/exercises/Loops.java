package exercises;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//display all the integers from 140 to 161.
		
		for (int i=140; i<=161; i++) {
			System.out.println(i);
		}
		
		//display all even numbers between 39 and 65.
		int i=39;
		while(i<=65) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		//displays all odd numbers between 14 and 45.
		
		int j=14;
		do {
			if(j%2==1) {
				System.out.println(j);
			}
			j++;
			
		}while(j<=45);
		
		//displays sum of all odd number from 45 to 80
		int sum=0;
		for(int odd=45; odd<=80; odd++) {
			if (odd%2==1) {
			sum+=odd;	
			}
		}
		System.out.println(sum);
		
//		/Write a program to compute the sum of all integers from 52 to 69.
		
		for(int numb=52; numb<=69; numb++) {
			sum+=numb;
		}
		System.out.println(sum);
	}

}
