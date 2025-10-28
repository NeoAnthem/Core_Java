package day04;

// WAP to print below series
// 100 90 80 70 60 50 40 30 20 10

// Start = 100, stop = 10, gap = -10
public class Wh1 {

	public static void main(String[] args) {
		int i = 100;

		while (i >= 10) {
			System.out.print(i+"\t");
			//	i = i - 10;
			i -= 10;
		}
	}

}