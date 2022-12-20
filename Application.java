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
        	System.out.println("\nЧто вы хотите сделать?\n "
        			+ "1. Вывести текущее положение\n "
        			+ "2. Изменить текущее положение\n "
        			+ "3. Вывести все варианты\n "
        			+ "4. Вернуться к старой версии\n "
        			+ "5. Завершить работу\n ");
        c = chase.nextInt();
        chase.nextLine();
        switch(c) {
        case 1: {
        System.out.println("Текущее положение: \n" + careTaker.get(cikl)); 
        break;}
        case 2:{
        System.out.println("Введите новые строчки \n" +
        "1. Заголовок, Дата\n"
        + "2. Описание, Автор\n"
        + "3. Основной текст\n"
        + "4. Список литературы\n");
        ISnapshot edit = Snapshot.getSnapshot();  
        IDocument docedit = edit.build(); 
        careTaker.add(docedit.getState());
        cikl++;
        System.out.println("Текущее положение: \n" + careTaker.get(cikl));
        break;}
        case 3: {
  	  	for(int i = 0; i < careTaker.size(); i++) { 
		  IDocument value = careTaker.get(i);
		  System.out.print("Вариант " + (i+1) + " :\n " + value + " \n");
		} break;}
        case 4:{
        System.out.println("Введите версию, к которой хотите вернуться: ");
  	  	int i = chase.nextInt();
        System.out.println("Вы вернулись к версии " +  i + " \n" + careTaker.get(i-1));
        cikl = i-1;
        break;}
        case 5:{
        System.out.println("Прекращение работы ");
        break;}
        }
	}  
        chase.close();
}
}
