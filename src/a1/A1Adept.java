package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
// product price
		int number_products = scan.nextInt();
		String[] product_name = new String[number_products];
		double[] price = new double[number_products];
		
		
		for (int i = 0; i < number_products; i++) {
			product_name[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
// people 	
		int number_people = scan.nextInt();
		String[] firstname = new String[number_people];
		String[] lastname = new String[number_people];
		double[] total_cost = new double[number_people];
		
		for (int current_person = 0; current_person < number_people; current_person++) {
			firstname[current_person] = scan.next();
			lastname[current_person] = scan.next();
			int items = scan.nextInt();
			
			for (int k = 0; k < items; k++) {
				int quantity = scan.nextInt();
				String item = scan.next();
				
				for (int i = 0; i < number_products; i++) {

					if (item.equals(product_name[i])) {
						total_cost[current_person] += quantity * price[i];
					}
				}
			}
		}
		
		// min, max and average 
		int index_max = 0;
		double max_cost = total_cost[0];
		
		for (int i = 1; i < number_people; i++) {
			if (total_cost[i] > max_cost) {
				index_max = i;
				max_cost = total_cost[i];
			}
		}
		
		int index_min = 0;
		double min_cost = total_cost[0];
		for (int i = 1; i < number_people; i++) {
			if (total_cost[i] < min_cost) {
				index_min = i;
				min_cost = total_cost[i];
			}
		}
		
		double sum_cost = 0;
		for (int i = 0; i < number_people; i++) {
			sum_cost += total_cost[i];
		}
		double average_cost = sum_cost / number_people;
		
		
		System.out.println("Biggest: " + firstname[index_max] + " " + lastname[index_max] + " ("
				+ String.format("%.2f", max_cost) + ")");
		System.out.println("Smallest: " + firstname[index_min] + " " + lastname[index_min] +  " ("
				+ String.format("%.2f", min_cost) + ")");
		System.out.println("Average" + ": " + String.format("%.2f", average_cost));
	}
}
