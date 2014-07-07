package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Series", strict = false)
public class Series extends BaseRecord {

	@Element(name = "seriesid", required = false)
	private int mSeriesId;

	@Element(name = "Actors", required = false)
	private String mActors;

	@Element(name = "Airs_DayOfWeek", required = false)
	private String mAiringDayOfWeek;

	@Element(name = "Airs_Time", required = false)
	private String mAiringTime;

	@Element(name = "ContentRating", required = false)
	private String mContentRating;

	@Element(name = "Genre", required = false)
	private String mGenres;

	@Element(name = "Network", required = false)
	private String mNetwork;

	@Element(name = "NetworkID", required = false)
	private int mNetworkId;

	@Element(name = "Runtime", required = false)
	private int mRuntime;

	@Element(name = "SeriesName", required = false)
	private String mSeriesName;

	@Element(name = "AliasNames", required = false)
	private String mAliasNames;

	@Element(name = "Status", required = false)
	private String mStatus;

	@Element(name = "added", required = false)
	private String mDateAdded;

	@Element(name = "addedBy", required = false)
	private int mAddedByUserId;

	@Element(name = "banner", required = false)
	private String mImageUrl;

	@Element(name = "fanart", required = false)
	private String mFanart;

	@Element(name = "posters", required = false)
	private String mPosters;

	@Element(name = "zap2it_id", required = false)
	private String mZap2itId;

	public int getSeriesId() {
		return mSeriesId;
	}

	public String getRawActors() {
		return mActors;
	}

	public String[] getActors() {
		return mActors != null ? mActors.split("\\|") : new String[0];
	}

	public String getAiringDayOfWeek() {
		return mAiringDayOfWeek;
	}

	public String getAiringTime() {
		return mAiringTime;
	}

	public String getContentRating() {
		return mContentRating;
	}

	public String getRawGenres() {
		return mGenres;
	}

	public String[] getGenres() {
		return mGenres != null ? mGenres.split("\\|") : new String[0];
	}

	public String getNetwork() {
		return mNetwork;
	}

	public int getNetworkId() {
		return mNetworkId;
	}

	public int getRuntime() {
		return mRuntime;
	}

	public String getSeriesName() {
		return mSeriesName;
	}

	public String getRawAliasNames() {
		return mAliasNames;
	}

	public String[] getAliasNames() {
		return mAliasNames != null ? mAliasNames.split("\\|") : new String[0];
	}

	public String getRawStatus() {
		return mStatus;
	}

	public Status getStatus() {
		return Status.parse(mStatus);
	}

	public String getDateAdded() {
		return mDateAdded;
	}

	public int getAddedByUserId() {
		return mAddedByUserId;
	}

	public String getImageUrl() {
		return mImageUrl;
	}

	public String getFanart() {
		return mFanart;
	}

	public String getPosters() {
		return mPosters;
	}

	public String getZap2itId() {
		return mZap2itId;
	}

}
