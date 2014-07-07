package test;

import model.EpisodeRatingResponse;
import model.EpisodeResponse;
import model.Language;
import model.SeriesRatingResponse;
import model.SeriesResponse;
import model.UserEpisodeRatingsResponse;
import model.UserFavoritesResponse;
import model.UserLanguageResponse;
import model.UserRatingsResponse;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;
import retrofit.RetrofitError;
import retrofit.client.Response;
import services.TheTVDBService;
import converter.SimpleXMLConverter;

public class ApiTest {

	private static final String USER_ID = "203B07F3BFC8E663"; // language = GERMAN
	private static final String API_KEY = "B71C15CEF6BE10A1";
	private static final String ENDPOINT = "http://thetvdb.com/api";

	public void run() {
		RestAdapter restAdapter = new RestAdapter.Builder()//
				.setLogLevel(LogLevel.FULL)//
				.setEndpoint(ENDPOINT)//
				.setConverter(new SimpleXMLConverter())//
				.build();

		TheTVDBService service = restAdapter.create(TheTVDBService.class);

		// Synchronous calls
		service.getSeries(TestSeries.getName());
		service.getSeries(TestSeries.getName(), Language.GERMAN);
		service.getSeries(TestSeries.getName(), USER_ID);
		service.getSeriesByImdbId(TestSeries.getImdbId());
		service.getSeriesByImdbId(TestSeries.getImdbId(), Language.GERMAN);
		service.getSeriesByZap2itId(TestSeries.getZap2itId());
		service.getSeriesByZap2itId(TestSeries.getZap2itId(), Language.GERMAN);
		service.getEpisode(API_KEY, TestSeries.getId(), TestSeries.getAiringDate());
		service.getEpisode(API_KEY, TestSeries.getId(), TestSeries.getAiringDate(), Language.GERMAN);
		service.getUserRatings(API_KEY, USER_ID);
		service.getUserRatings(API_KEY, USER_ID, TestSeries.getId());
		service.getUserLanguage(USER_ID);
		service.getUserFavorites(USER_ID);
		service.removeUserFavorite(USER_ID, TestSeries.getId());
		service.addUserFavorite(USER_ID, TestSeries.getId());
		service.rateSeries(USER_ID, TestSeries.getId(), 9);
		service.rateEpisode(USER_ID, 349236, 5);
		service.getUserRatings(API_KEY, USER_ID, TestSeries.getId());

		// Asynchronous calls
		service.getSeries(TestSeries.getName(), new SeriesResponseCallback());
		service.getSeries(TestSeries.getName(), Language.GERMAN, new SeriesResponseCallback());
		service.getSeries(TestSeries.getName(), USER_ID, new SeriesResponseCallback());
		service.getSeriesByImdbId(TestSeries.getImdbId(), new SeriesResponseCallback());
		service.getSeriesByImdbId(TestSeries.getImdbId(), Language.GERMAN, new SeriesResponseCallback());
		service.getSeriesByZap2itId(TestSeries.getZap2itId(), new SeriesResponseCallback());
		service.getSeriesByZap2itId(TestSeries.getZap2itId(), Language.GERMAN, new SeriesResponseCallback());
		service.getEpisode(API_KEY, TestSeries.getId(), TestSeries.getAiringDate(), new EpisodeResponseCallback());
		service.getEpisode(API_KEY, TestSeries.getId(), TestSeries.getAiringDate(), Language.GERMAN, new EpisodeResponseCallback());
		service.getUserRatings(API_KEY, USER_ID, new UserRatingsCallback());
		service.getUserRatings(API_KEY, USER_ID, TestSeries.getId(), new UserEpisodeRatingsCallback());
		service.getUserLanguage(USER_ID, new UserLanguageCallback());
		service.getUserFavorites(USER_ID, new UserFavoritesCallback());
		service.removeUserFavorite(USER_ID, TestSeries.getId(), new UserFavoritesCallback());
		service.addUserFavorite(USER_ID, TestSeries.getId(), new UserFavoritesCallback());
		service.rateSeries(USER_ID, TestSeries.getId(), 9, new SeriesRatingCallback());
		service.rateEpisode(USER_ID, 349236, 5, new EpisodeRatingCallback());
	}

	//@formatter:off
	private static class SeriesResponseCallback implements Callback<SeriesResponse> {
		@Override public void failure(RetrofitError arg0) {}
		@Override public void success(SeriesResponse arg0, Response arg1) {}
	}

	private static class EpisodeResponseCallback implements Callback<EpisodeResponse> {
		@Override public void failure(RetrofitError arg0) {}
		@Override public void success(EpisodeResponse arg0, Response arg1) {}
	}

	private static class UserRatingsCallback implements Callback<UserRatingsResponse> {
		@Override public void failure(RetrofitError arg0) {}
		@Override public void success(UserRatingsResponse arg0, Response arg1) {}
	}

	private static class UserEpisodeRatingsCallback implements Callback<UserEpisodeRatingsResponse> {
		@Override public void failure(RetrofitError arg0) {}
		@Override public void success(UserEpisodeRatingsResponse arg0, Response arg1) {}
	}

	private static class UserLanguageCallback implements Callback<UserLanguageResponse> {
		@Override public void failure(RetrofitError arg0) {}
		@Override public void success(UserLanguageResponse arg0, Response arg1) {}
	}

	private static class UserFavoritesCallback implements Callback<UserFavoritesResponse> {
		@Override public void failure(RetrofitError arg0) {}
		@Override public void success(UserFavoritesResponse arg0, Response arg1) {}
	}

	private static class SeriesRatingCallback implements Callback<SeriesRatingResponse> {
		@Override public void failure(RetrofitError arg0) {}
		@Override public void success(SeriesRatingResponse arg0, Response arg1) {}
	}

	private static class EpisodeRatingCallback implements Callback<EpisodeRatingResponse> {
		@Override public void failure(RetrofitError arg0) {}
		@Override public void success(EpisodeRatingResponse arg0, Response arg1) {}
	}
	//@formatter:on

}