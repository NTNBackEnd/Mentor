package SortArr;

import java.util.Arrays;
import java.util.Scanner;

public class SortArr {
	public static double[] SortArray(double[] arr, String s){
		if(s.equals("asc")) {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						double temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}else if(s.equals("desc")){
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if(arr[i] < arr[j]) {
						double temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử mảng: ");
		int n = sc.nextInt();
		String s;
		double[] arr = new double[n];
		System.out.println("Nhập dữ liệu mảng : ");
		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = sc.nextDouble();
		}
		System.out.println("Nhập chiều muốn sắp xếp mảng (asc: tăng , desc: giảm): ");
		s = sc.next();
		System.out.print("Result Sort Array: ");
		System.out.println(Arrays.toString(SortArray(arr, s)));
		
	}
}
