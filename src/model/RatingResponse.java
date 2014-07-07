package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class RatingResponse {

	@Element(name = "Rating", required = false)
	private float mCommunityRating;

	public float getCommunityRating() {
		return mCommunityRating;
	}

}
