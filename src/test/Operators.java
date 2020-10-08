package test;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);

System.out.println(10>10);
System.out.println(10<7);
System.out.println(10==10);
System.out.println(20>19);
System.out.println(30<29);
System.out.println(10!=1);
System.out.println(20==20);
*/

System.out.println((10>3)&&(70>6));//t &&t----T
System.out.println((10>3)&&(70>600));//t&&f--f

System.out.println((10>3)||(70>6));//t||t----T
System.out.println((10>3)||(70>600));//t||f--T
System.out.println((10<3)||(70>600));//f||f---F

int a=3;
System.out.println(a);
System.out.println(++a); //4
System.out.println(a); //4
System.out.println(a++);//4
System.out.println(a);

int b=5;
System.out.println(b);
System.out.println(--b);//4
System.out.println(b);//4
System.out.println(b--);//4
System.out.println(b);//3
System.out.println(b--);//3
System.out.println(b);//2
System.out.println(--b);//1
System.out.println(b++);//1
System.out.println(b);//2
System.out.println(++b);//3
System.out.println(b++);//3
System.out.println(b);//4






	}

}
