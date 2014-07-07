package model;

public enum ImageRatio {

	FOUR_TO_THREE(1),
	SIXTEEN_TO_NINE(2),
	INVALID(3),
	TOO_SMALL(4),
	BLACK_BARS(5),
	IMPROPER_ACTION_SHOT(6);

	private int mId;

	private ImageRatio(int id) {
		mId = id;
	}

	public int getId() {
		return mId;
	}

	public static ImageRatio parse(int id) {
		for (ImageRatio imageRatio : values()) {
			if (imageRatio.getId() == id) {
				return imageRatio;
			}
		}
		return null;
	}

}
