package pb2.unlam.edu.ar;

import java.util.Comparator;

public class Orden implements Comparator<Tag> {

	@Override
	public int compare(Tag o1, Tag o2) {
		return o2.getId().compareTo(o1.getId());
		
	}

}
