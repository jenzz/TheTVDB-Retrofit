package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Languages", strict = false)
public class UserLanguageResponse {

	@Element(name = "Language", required = false)
	private UserLanguage mUserLanguage;

	public UserLanguage getUserLanguage() {
		return mUserLanguage;
	}

}
