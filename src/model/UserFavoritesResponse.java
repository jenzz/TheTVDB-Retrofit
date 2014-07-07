package model;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "Favorites", strict = false)
public class UserFavoritesResponse {

	@ElementList(name = "Series", inline = true, required = false)
	private List<Integer> mSeriesNumbers;

	public List<Integer> getSeriesNumbers() {
		return mSeriesNumbers;
	}

}
