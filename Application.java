import java.util.Scanner;

import patterns.*;

public class Application {
public static void main(String[] args) {
        IDocumentBuilder originator = DocumentBuilder.getDocumentBuilder();  
        IDocument doc = originator.build();  
        Caretaker careTaker = new Caretaker();
        careTaker.add(doc.getState());
        int c = 0;
        int cikl = 0;
        Scanner chase = new Scanner(System.in);
        while(c!=5) {
        	System.out.println("\n��� �� ������ �������?\n "
        			+ "1. ������� ������� ���������\n "
        			+ "2. �������� ������� ���������\n "
        			+ "3. ������� ��� ��������\n "
        			+ "4. ��������� � ������ ������\n "
        			+ "5. ��������� ������\n ");
        c = chase.nextInt();
        chase.nextLine();
        switch(c) {
        case 1: {
        System.out.println("������� ���������: \n" + careTaker.get(cikl)); 
        break;}
        case 2:{
        System.out.println("������� ����� ������� \n" +
        "1. ���������, ����\n"
        + "2. ��������, �����\n"
        + "3. �������� �����\n"
        + "4. ������ ����������\n");
        ISnapshot edit = Snapshot.getSnapshot();  
        IDocument docedit = edit.build(); 
        careTaker.add(docedit.getState());
        cikl++;
        System.out.println("������� ���������: \n" + careTaker.get(cikl));
        break;}
        case 3: {
  	  	for(int i = 0; i < careTaker.size(); i++) { 
		  IDocument value = careTaker.get(i);
		  System.out.print("������� " + (i+1) + " :\n " + value + " \n");
		} break;}
        case 4:{
        System.out.println("������� ������, � ������� ������ ���������: ");
  	  	int i = chase.nextInt();
        System.out.println("�� ��������� � ������ " +  i + " \n" + careTaker.get(i-1));
//        cikl = i-1;
        break;}
        case 5:{
        System.out.println("����������� ������ ");
        break;}
        }
	}  
        chase.close();
}
}