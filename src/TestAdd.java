//11.16

import java.util.ArrayList;
import java.util.Scanner;

public class TestAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        Scanner input = new Scanner(System.in);
        System.out.print("What is "+num1+" + "+num2+"? ");
        int answer = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while(num1+num2 != answer) {
        	while(list.contains(answer)) {
        		System.out.println("You already entered "+answer);
        		break;
        	}
        	System.out.print("Wrong answer. Try again. What is "+num1+" + "+num2+"? ");
        	list.add(answer);
        	answer = input.nextInt();
        }
        System.out.println("You got it!");
	}

}
