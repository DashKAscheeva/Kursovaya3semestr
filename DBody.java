package patterns;

public class DBody implements IDocument{
	private String text;
		public DBody (String text) {
		super();
		this.text = text;
		}
		@Override
		public String getContent() {

			return ("�������� �����: " + text + " \n");
		}
		@Override
		public IDocument getState() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			return "�������� �����: " + text + " \n";
		}
		
}
