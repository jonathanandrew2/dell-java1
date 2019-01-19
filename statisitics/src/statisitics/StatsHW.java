package statisitics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StatsHW {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		System.out.println("Pick as many numbers as you want seperated by commas");
		Scanner sc = new Scanner(System.in);
		String numberList = sc.nextLine();
		sc.close();
		String[] numbersArray = numberList.split(",");
		Integer[] intArray = new Integer[numbersArray.length];
		for(int i = 0; i < numbersArray.length; i++) {

			Integer num = Integer.parseInt(numbersArray[i]);
			intArray[i]=num;
			list.add(intArray[i]);
			//System.out.println(intArray[i]);
		}

		System.out.println(list);
		int max = Collections.max(list);
		int min = Collections.min(list);
		System.out.println("The max = "+max);
		System.out.println("The min = "+ min); 
		
		int total = 0;
		int avg=  0;
		for (int i = 0; i < list.size(); i++) {
			total = total + list.get(i);
			//System.out.println(list.size());
			}
		System.out.println("The sum = "+ total);
		avg = total / list.size();
		System.out.println("the average is= "+ avg);

	} 

}
