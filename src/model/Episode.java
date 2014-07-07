package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Episode", strict = false)
public class Episode extends BaseRecord {

	public static final int SPECIAL_SEASON_ID = 0;

	@Element(name = "Combined_episodenumber", required = false)
	private int mCombinedEpisodeNumber;

	@Element(name = "Combined_season", required = false)
	private int mCombinedSeasonNumber;

	@Element(name = "DVD_episodenumber", required = false)
	private float mDVDEpisodeNumber;

	@Element(name = "DVD_season", required = false)
	private int mDVDSeasonNumber;

	@Element(name = "Director", required = false)
	private String mDirectors;

	@Element(name = "EpImgFlag", required = false)
	private int mImageRatio;

	@Element(name = "EpisodeName", required = false)
	private String mEpisodeName;

	@Element(name = "EpisodeNumber", required = false)
	private int mEpisodeNumber;

	@Element(name = "GuestStars", required = false)
	private String mGuestStars;

	@Element(name = "ProductionCode", required = false)
	private String mProductionCode;

	@Element(name = "SeasonNumber", required = false)
	private int mSeasonNumber;

	@Element(name = "Writer", required = false)
	private String mWriters;

	@Element(name = "absolute_number", required = false)
	private int mAbsoluteNumber;

	@Element(name = "airsafter_season", required = false)
	private int mAirsAfterSeasonNumber;

	@Element(name = "airsbefore_episode", required = false)
	private int mAirsBeforeEpisodeNumber;

	@Element(name = "airsbefore_season", required = false)
	private int mAirsBeforeSeasonNumber;

	@Element(name = "filename", required = false)
	private String mImageUrl;

	@Element(name = "seasonid", required = false)
	private int mSeasonId;

	@Element(name = "seriesid", required = false)
	private int mSeriesId;

	@Element(name = "thumb_added", required = false)
	private String mDateImageAdded;

	@Element(name = "thumb_height", required = false)
	private int mImageHeight;

	@Element(name = "thumb_width", required = false)
	private int mImageWidth;

	public static int getSpecialSeasonId() {
		return SPECIAL_SEASON_ID;
	}

	public int getCombinedEpisodeNumber() {
		return mCombinedEpisodeNumber;
	}

	public int getCombinedSeasonNumber() {
		return mCombinedSeasonNumber;
	}

	public float getDVDEpisodeNumber() {
		return mDVDEpisodeNumber;
	}

	public int getDVDSeasonNumber() {
		return mDVDSeasonNumber;
	}

	public String getRawDirectors() {
		return mDirectors;
	}

	public String[] getDirectors() {
		return mDirectors != null ? mDirectors.split("\\|") : new String[0];
	}

	public int getRawImageRatio() {
		return mImageRatio;
	}

	public ImageRatio getImageRatio() {
		return ImageRatio.parse(mImageRatio);
	}

	public String getEpisodeName() {
		return mEpisodeName;
	}

	public int getEpisodeNumber() {
		return mEpisodeNumber;
	}

	public String getRawGuestStars() {
		return mGuestStars;
	}

	public String[] getGuestStars() {
		return mGuestStars != null ? mGuestStars.split("\\|") : new String[0];
	}

	public String getProductionCode() {
		return mProductionCode;
	}

	public int getSeasonNumber() {
		return mSeasonNumber;
	}

	public String getRawWriters() {
		return mWriters;
	}

	public String[] getWriters() {
		return mWriters != null ? mWriters.split("\\|") : new String[0];
	}

	public int getAbsoluteNumber() {
		return mAbsoluteNumber;
	}

	public int getAirsAfterSeasonNumber() {
		return mAirsAfterSeasonNumber;
	}

	public int getAirsBeforeEpisodeNumber() {
		return mAirsBeforeEpisodeNumber;
	}

	public int getAirsBeforeSeasonNumber() {
		return mAirsBeforeSeasonNumber;
	}

	public String getImageUrl() {
		return mImageUrl;
	}

	public int getSeasonId() {
		return mSeasonId;
	}

	public int getSeriesId() {
		return mSeriesId;
	}

	public String getDateImageAdded() {
		return mDateImageAdded;
	}

	public int getImageHeight() {
		return mImageHeight;
	}

	public int getImageWidth() {
		return mImageWidth;
	}

	public boolean isSpecial() {
		return mSeasonId == SPECIAL_SEASON_ID;
	}

}
