package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Data", strict = false)
public class SeriesRatingResponse {

	@Element(name = "Series", required = false)
	private RatingResponse mRating;

	public RatingResponse getRating() {
		return mRating;
	}

}
