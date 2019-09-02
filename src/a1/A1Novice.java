package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number_people = scan.nextInt();
		String[] first_name = new String[number_people];
		String[] last_name = new String[number_people];
		double[] total_price = new double[number_people];
		double[] product_number = new double[number_people];

		for (int i = 0; i < number_people; i++) {
			first_name[i] = scan.next();
			last_name[i] = scan.next();
			product_number[i] = scan.nextInt();
			total_price[i] = 0;

			for (int j = 0; j < product_number[i]; j++) {
				int quantity = scan.nextInt();
				String product_name = scan.next();
				double price = scan.nextDouble();
				total_price[i] += quantity * price;
			}
		}

		for (int i = 0; i < number_people; i++) {
			System.out.println(
					first_name[i].charAt(0) + ". " + last_name[i] + ": " + String.format("%.2f", total_price[i]));
		}
	}
}
