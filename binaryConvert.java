package thing;

import java.util.Scanner;
import java.util.ArrayList;

public class binaryConvert {
	
	public static void convert(int convert){
		ArrayList<Integer> bin= new ArrayList<>();
		int count = 0;
		while(Math.pow(2,count)<convert){
			count++;
		}
		while(convert > 0 && count >= 0){
			if(convert - Math.pow(2, count) >= 0){
				bin.add(1);
				convert -= Math.pow(2, count);
			}
			else{
				bin.add(0);
			}
			count--;
		}
		while(count >= 0){
			bin.add(0, 0);
			count--;
		}
		System.out.println("In binary:");
		for(int i = 0; i < bin.size(); i++){
			System.out.print(bin.get(i));
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer:");
		int con = in.nextInt();
		convert(con);
		
	}

}
