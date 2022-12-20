package patterns;

public class DLit implements IDocument{
	private String text;
	public DLit (String text) {
	super();
	this.text = text;
	}
	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return ("Список литературы: "+ text + " \n");
	}
	@Override
	public IDocument getState() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Список литературы: "+ text + " \n";
	}
	
	
}
