package model;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "Data", strict = false)
public class UserEpisodeRatingsResponse extends UserRatingsResponse {

	@ElementList(name = "Episode", inline = true, required = false)
	private List<RatedEpisode> mRatedEpisodes;

	public List<RatedEpisode> getRatedEpisodes() {
		return mRatedEpisodes;
	}

}
