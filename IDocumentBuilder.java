package patterns;

public interface IDocumentBuilder {
	public void makeHeader();
	public void makeDescription();
	public void makeBody();
	public void makeLit();
	public IDocument build();
}
