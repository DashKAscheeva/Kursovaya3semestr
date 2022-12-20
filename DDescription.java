package patterns;

public class DDescription implements IDocument{
	private String description;
	private String author;
		public DDescription (String description, String author) {
		super();
		this.description = description;
		this.author = author;
		}
		@Override
		public String getContent() {
			// TODO Auto-generated method stub
			return ("Описание: " + description + " Автор: " + author + " \n");
		}
		@Override
		public IDocument getState() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			return "Описание: " + description + " Автор: " + author + " \n";
		}
		
		
}
