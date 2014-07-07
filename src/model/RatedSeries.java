package model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Series", strict = false)
public class RatedSeries extends Rating {

	@Element(name = "seriesid", required = false)
	private int mSeriesId;

	public int getSeriesId() {
		return mSeriesId;
	}

}
