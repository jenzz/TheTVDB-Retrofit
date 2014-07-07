package model;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "Data", strict = false)
public class UserRatingsResponse {

	@ElementList(name = "Series", inline = true, required = false)
	private List<RatedSeries> mSeries;

	public List<RatedSeries> getSeries() {
		return mSeries;
	}

}
