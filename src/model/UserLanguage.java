package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Language", strict = false)
public class UserLanguage {

	@Element(name = "id", required = false)
	private int mId;

	@Element(name = "abbreviation", required = false)
	private String mLanguage;

	@Element(name = "name", required = false)
	private String mName;

	public int getId() {
		return mId;
	}

	public String getRawLanguage() {
		return mLanguage;
	}

	public Language getLanguage() {
		return Language.parse(mLanguage);
	}

	public String getName() {
		return mName;
	}

}
