package chaptor01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);

		a = a + 1;
		System.out.println(a);

		a += 1;
		System.out.println(a);

		a++;
		System.out.println(a);

		++a;
		System.out.println(a);

		a--; // a = a - 1;
		System.out.println(a);

		--a; // a -= 1;
		System.out.println(a);

		// System.out.println( a++ );
		System.out.println(a);
		a++;

		// 현재 a의 값은? 10

		// System.out.println( ++a );
		a++;
		System.out.println(a);

		// 나누기

		// 2개의 int형의 사칙연산 결과는 int
		System.out.println(10 / 3);
		// 2개의 double형의 사칙연산 결과는 double
		System.out.println(10. / 3.);
		// int형과 double형의 사칙연산 결과는 double
		System.out.println(10. / 3);

		System.out.println((double)10 / 3);

		// 주의
		System.out.println((double)(10 / 3));

		// 나머지
		System.out.println(44 % 3);

		System.out.println(-7 % 3);

		System.out.println(7 % -3);

	}

}
