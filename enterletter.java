package creatNames;

import java.util.Scanner;

public class enterletter extends FilterNames{

	public static void main(String[] args) {

		enterletter ent=new enterletter();
		Scanner scan=new Scanner(System.in);

		System.out.println("enter your name string <= 5 letter");
		String namestr=scan.next();

		System.out.println("Possible names of characters entered is :");//������� �������� �� ������ �������
		System.out.println("Possible names array :");
		String arrayfilter[]=ent.entered(namestr);//������ ������� ��������

		System.out.println("\n \n invalid names");
		String arrayf[]=ent.filter(arrayfilter);//������ ������� ��� �������
	}

}




