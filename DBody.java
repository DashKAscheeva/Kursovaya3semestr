package patterns;

public class DBody implements IDocument{
	private String text;
		public DBody (String text) {
		super();
		this.text = text;
		}
		@Override
		public String getContent() {

			return ("Основной текст: " + text + " \n");
		}
		@Override
		public IDocument getState() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			return "Основной текст: " + text + " \n";
		}
		
}
