package model;

public enum Language {

	ALL(0, "all"),
	ENGLISH(7, "en"),
	SWEDISH(8, "sv"),
	NORWEGIAN(9, "no"),
	DANISH(10, "da"),
	FINNISH(11, "fi"),
	DUTCH(13, "nl"),
	GERMAN(14, "de"),
	ITALIAN(15, "it"),
	SPANISH(16, "es"),
	FRENCH(17, "fr"),
	POLISH(18, "pl"),
	HUNGARIAN(19, "hu"),
	GREEK(20, "el"),
	TURKISH(21, "tr"),
	RUSSIAN(22, "ru"),
	HEBREW(24, "he"),
	JAPANESE(25, "ja"),
	PORTUGUESE(26, "pt"),
	CHINESE(27, "zh"),
	CZECH(28, "cs"),
	SLOVENIAN(30, "sl"),
	CROATIAN(31, "hr"),
	KOREAN(32, "ko");

	private int mId;
	private String mCode;

	private Language(int id, String code) {
		mId = id;
		mCode = code;
	}

	public static Language parse(String code) {
		for (Language language : values()) {
			if (language.getCode().equalsIgnoreCase(code)) {
				return language;
			}
		}
		return null;
	}

	public int getId() {
		return mId;
	}

	public String getCode() {
		return mCode;
	}

	@Override
	public String toString() {
		return mCode;
	}

}
