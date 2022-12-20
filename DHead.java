package patterns;

public class DHead implements IDocument{
	private String content;
	private double date;
		public DHead (String content, double date) {
		super();
		this.content = content;
		this.date = date;
		}
		@Override
		public String getContent() {
			// TODO Auto-generated method stub
			return ("Заголовок: " + content + " Дата: " + date + " \n") ;
		}
		@Override
		public IDocument getState() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			return "Заголовок: " + content + " Дата " + date + " \n";
		}
		
		
}
