package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class BaseRecord {

	@Element(name = "id", required = false)
	private int mId;

	@Element(name = "IMDB_ID", required = false)
	private String mImdbId;

	@Element(name = "language", required = false)
	private String mLanguage;

	@Element(name = "Overview", required = false)
	private String mDescription;

	@Element(name = "Rating", required = false)
	private float mRating;

	@Element(name = "RatingCount", required = false)
	private int mRatingCount;

	@Element(name = "lastupdated", required = false)
	private long mLastUpdated;

	@Element(name = "FirstAired", required = false)
	private String mFirstAiringDate;

	public int getId() {
		return mId;
	}

	public String getImdbId() {
		return mImdbId;
	}

	public String getRawLanguage() {
		return mLanguage;
	}

	public Language getLanguage() {
		return Language.parse(mLanguage);
	}

	public String getDescription() {
		return mDescription;
	}

	public float getRating() {
		return mRating;
	}

	public int getRatingCount() {
		return mRatingCount;
	}

	public long getLastUpdated() {
		return mLastUpdated;
	}

	public String getFirstAiringDate() {
		return mFirstAiringDate;
	}

}
