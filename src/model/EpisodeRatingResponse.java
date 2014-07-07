package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Data", strict = false)
public class EpisodeRatingResponse {

	@Element(name = "Episode", required = false)
	private RatingResponse mRating;

	public RatingResponse getRating() {
		return mRating;
	}

}
