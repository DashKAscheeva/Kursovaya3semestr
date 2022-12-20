package patterns;

import java.util.Scanner;

public class Snapshot implements ISnapshot  {
	private IDocument[] parts = {null, null, null, null};
	private Scanner scanner = new Scanner(System.in);

	public void editHeader() {

		System.out.println("Изменение заголовка и даты: ");
		System.out.println("Введите новый заголовок: ");
	    String head = scanner.nextLine();
		System.out.println("Введите новую дату: ");
	    double date = scanner.nextDouble();
	    scanner.nextLine();
		parts[0] = new DHead(head, date);
	}

	public void editDescription() {    

		System.out.println("Изменение Краткого содержания и автора: ");	
		System.out.println("Введите новое содержание: ");
	    String description = scanner.nextLine();
	    System.out.println("Введите нового автора: ");
	    String author = scanner.nextLine();

		parts[1] = new DDescription(description, author);
	}

	public void editBody() {

		System.out.println("Изменение основного текста: ");	    
		String body =  scanner.nextLine();
		parts[2] = new DBody(body);
	}

	public void editLit() {

		System.out.println("Изменение Литературы: ");
	    String lit =  scanner.nextLine();
		parts[3] = new DLit(lit);
	}
	
	public IDocument build() {
		editHeader();
		editDescription();
		editBody();
		editLit();
		return new Document(parts);
	}
	public static ISnapshot getSnapshot() {
		
		return new Snapshot();
	}
}
