package patterns;

public interface ISnapshot {
	public void editHeader();
	public void editDescription();
	public void editBody();
	public void editLit();
	public IDocument build();
}
