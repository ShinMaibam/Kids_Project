package Ryan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiveMeChange {

	public static void main(String[] args) {

		/*
		 * Coins: 1, 2, 5, 10, 20, 50, 100, 200, 500 
		 * Notes: 1000, 2000, 5000, 10000
		 * 
		 */

		int blc = 0;
		int price = 502;
		
		System.out.println("======ATTENTION: Your Total amount is=======" + price);

		System.out.println("=======ATTENTION: Please pay the amount and hit ENTER============");
		String ip = new Scanner(System.in).nextLine();
		String deposit = ip.toLowerCase().trim();

		blc = Integer.parseInt(deposit) - price;
		System.out.println("======== ATTENTION: Balance amount to Return is=====" + blc);

		List<Integer> noteList = new ArrayList<Integer>();
		List<Integer> coinList = new ArrayList<Integer>();

		int a = 1;
		int b = 2;
		int c = 5;
		int d = 10;
		int e = 20;
		int f = 50;
		int g = 100;
		int h = 200;
		int i = 500;

		int m = 1000;
		int n = 2000;
		int o = 5000;
		int p = 10000;

		for (int j = 0; j < 20; j++) {
			if (blc == 0) {
				System.out.println("======= Balance is ZERO======");
				break;
			} else {
				if (blc < 10000 && blc >= 5000) {
					blc = blc - o;
					noteList.add(o);
				} else if (blc < 5000 && blc >= 2000) {
					blc = blc - n;
					noteList.add(n);
				} else if (blc < 2000 && blc >= 1000) {
					blc = blc - m;
					noteList.add(m);
				} else if (blc < 1000 && blc >= 500) {
					blc = blc - i;
					coinList.add(i);
				} else if (blc < 500 && blc >= 200) {
					blc = blc - h;
					coinList.add(h);
				} else if (blc < 200 && blc >= 100) {
					blc = blc - g;
					coinList.add(g);
				} else if (blc < 100 && blc >= 50) {
					blc = blc - f;
					coinList.add(f);
				} else if (blc < 50 && blc >= 20) {
					blc = blc - e;
					coinList.add(e);
				} else if (blc < 20 && blc >= 10) {
					blc = blc - d;
					coinList.add(d);
				} else if (blc < 10 && blc >= 5) {
					blc = blc - c;
					coinList.add(c);
				} else if (blc < 5 && blc >= 2) {
					blc = blc - b;
					coinList.add(b);
				} else if (blc < 2 && blc >= 1) {
					blc = blc - a;
					coinList.add(a);
				} else {
					System.out.println("===========Nothing to Return=============");
				}
			}
		}

		System.out.println("========Please return these NOTES ===========" + noteList.toString());
		System.out.println("========Please return these COINS ===========" + coinList.toString());

	}

}
