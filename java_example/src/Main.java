import java.util.Scanner;

class Sample {
	public int nonStaticNum;

	public void changeStaticNum(int n) {
		staticNum = n;
	}

	public void printStaticNum() {
		System.out.println("staticNum = " + staticNum);
	}

	public static int staticNum = 0;
}

public class Main {
	public static void main(String[] args) {
		Sample sample1 = new Sample();
		Sample sample2 = new Sample();

		sample1.nonStaticNum = 10;
		sample2.nonStaticNum = 20;

		System.out.println("sample1.nonStaticNum = " + sample1.nonStaticNum);
		System.out.println("sample2.nonStaticNum = " + sample2.nonStaticNum);

		sample1.changeStaticNum(10);

		sample1.printStaticNum();
		sample2.printStaticNum();
	}

}