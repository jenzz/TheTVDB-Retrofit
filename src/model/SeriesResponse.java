package model;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "Data", strict = false)
public class SeriesResponse {

	@ElementList(name = "Series", inline = true, required = false)
	private List<Series> mSeries;

	public List<Series> getSeries() {
		return mSeries;
	}

}
