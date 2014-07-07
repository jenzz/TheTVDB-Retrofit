package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class Rating {

	@Element(name = "UserRating", required = false)
	private int mUserRating;

	@Element(name = "CommunityRating", required = false)
	private float mCommunityRating;

	public int getUserRating() {
		return mUserRating;
	}

	public float getCommunityRating() {
		return mCommunityRating;
	}

}
