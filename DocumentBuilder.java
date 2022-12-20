package patterns;

public class DocumentBuilder implements IDocumentBuilder {
	private IDocument[] parts = {null, null, null, null};
	
	@Override
	public void makeHeader() {
		// TODO Auto-generated method stub
		parts[0] = new DHead("Курсовая работа ", 21.12);
	}

	@Override
	public void makeDescription() {
		// TODO Auto-generated method stub
		parts[1] = new DDescription("Отчет по курсовой работе студента 3 курса Института радиотехники ", " Аркадий Попов");
	}

	@Override
	public void makeBody() {
		// TODO Auto-generated method stub
		parts[2] = new DBody("Полупроводниковые приборы, используемые в каскадах тракта");
	}
	
	@Override
	public void makeLit() {
		// TODO Auto-generated method stub
		parts[3] = new DLit("Искусство схемотехники Авторы: Пауль Хоровиц и Уинфилд Хилл ");
	}

	@Override
	public IDocument build() {
		// TODO Auto-generated method stub
		makeHeader();
		makeBody();
		makeDescription();
		makeLit();
		return new Document(parts);
	}
	
	
	public static IDocumentBuilder getDocumentBuilder() {
		
		return new DocumentBuilder();
	}
}
