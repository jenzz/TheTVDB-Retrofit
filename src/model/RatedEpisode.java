package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Episode", strict = false)
public class RatedEpisode extends Rating {

	@Element(name = "id", required = false)
	private int mId;

	public int getId() {
		return mId;
	}

}
