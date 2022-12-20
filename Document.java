package patterns;

import java.util.Arrays;

public class Document implements IDocument {
	private IDocument[] parts;
	
	public Document(IDocument[] parts) {
		super();
		this.parts = parts;
	}
	
	public String getContent() {
		String content = " ";
		
		for (int i = 0; i < parts.length; i++) {
			content += parts[i].getContent();
		}
		return content;
	}
	
	public IDocument getState() {
	    return new Document(parts);
	}
	@Override
	public String toString() {
		return Arrays.toString(parts) ;
	};
	
	
}
