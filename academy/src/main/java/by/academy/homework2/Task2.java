package by.academy.homework2;

import java.util.Scanner;

public class Task2 {
	
	private static int getUniqueCharQuantity(String s) {
		int []charCounter = new int[256];
		char[]allChars = s.toCharArray();
	
		for (Character c:allChars) {
		charCounter[c]++;
	}
		int uniqueCounter = 0;
		for (int i = 0;i<charCounter.length;i++) {
			int counter =charCounter[i];
			if (counter>0) {
				uniqueCounter++;
			}
		}
		return uniqueCounter;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ведите кол-во строк");
		int n = sc.nextInt();
		String [] arr= new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("введите слово");
			arr[i]=sc.next();
			
		}
		
		int minChars = -1;
		String minWord = null;
		
		for (int i=1;i<n;i++) {
			String s = arr[i];
			arr[i] = sc.next();
			int unique = getUniqueCharQuantity(s);
			if(minWord==null&&minChars>unique) {
				minChars = unique;
				minWord = s;
			}
			
		}
		System.out.println(minWord);
		sc.close();
	}

}
