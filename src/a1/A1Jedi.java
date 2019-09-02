package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// product, price
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
		int[] total_num_bought_each_product = new int[number_products];
		int[] num_people_product = new int[number_products];

		for (int current_person = 0; current_person < number_people; current_person++) {
			firstname[current_person] = scan.next();
			lastname[current_person] = scan.next();
			int items = scan.nextInt();

			for (int k = 0; k < items; k++) {
				int quantity = scan.nextInt();
				String item = scan.next();

				for (int i = 0; i < number_products; i++) {

					if (item.equals(product_name[i])) {
						total_num_bought_each_product[i] += quantity;
						num_people_product[i] += 1;

					}
				}
			}
		}
		for (int i = 0; i < number_products; i++) {

			if (num_people_product[i] == 0) {
				System.out.println("No customers bought " + product_name[i]);
			} else {
				System.out.println(num_people_product[i] + " customers bought " + total_num_bought_each_product[i] + " "
						+ product_name[i]);
			}
		}

	}
}
