package model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "Data", strict = false)
public class EpisodeResponse {

	@ElementList(name = "Episode", inline = true, required = false)
	private Episode mEpisode;

	public Episode getEpisode() {
		return mEpisode;
	}

}
