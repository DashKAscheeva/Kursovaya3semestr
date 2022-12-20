package patterns;
import java.util.ArrayList;  
import java.util.List;  

public class Caretaker {
	    private List<IDocument> mementoList = new ArrayList<IDocument>();  
	  
	       public void add(IDocument state){  
	          mementoList.add(state);  
	       }  
	  
	       public IDocument get(int index){  
	          return mementoList.get(index);  
	       }

		public int size() {
			int l = mementoList.size();
			return l;
		}  

	}
