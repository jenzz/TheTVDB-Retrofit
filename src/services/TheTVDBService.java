package services;

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
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * API for TheTVDB.com - An open database for TV fans
 * <p>
 * Documentation: <a
 * href="http://thetvdb.com/wiki/index.php/Programmers_API">http
 * ://thetvdb.com/wiki/index.php/Programmers_API</a>
 * 
 */
public interface TheTVDBService {

	@GET("/GetSeries.php")
	SeriesResponse getSeries(@Query("seriesname") String seriesName);

	@GET("/GetSeries.php")
	void getSeries(@Query("seriesname") String seriesName, Callback<SeriesResponse> callback);

	@GET("/GetSeries.php")
	SeriesResponse getSeries(@Query("seriesname") String seriesName, @Query("language") Language language);

	@GET("/GetSeries.php")
	void getSeries(@Query("seriesname") String seriesName, @Query("language") Language language, Callback<SeriesResponse> callback);

	@GET("/GetSeries.php")
	SeriesResponse getSeries(@Query("seriesname") String seriesName, @Query("user") String userId);

	@GET("/GetSeries.php")
	void getSeries(@Query("seriesname") String seriesName, @Query("user") String userId, Callback<SeriesResponse> callback);

	@GET("/GetSeriesByRemoteID.php")
	SeriesResponse getSeriesByImdbId(@Query("imdbid") String imdbId);

	@GET("/GetSeriesByRemoteID.php")
	void getSeriesByImdbId(@Query("imdbid") String imdbId, Callback<SeriesResponse> callback);

	@GET("/GetSeriesByRemoteID.php")
	SeriesResponse getSeriesByImdbId(@Query("imdbid") String imdbId, @Query("language") Language language);

	@GET("/GetSeriesByRemoteID.php")
	void getSeriesByImdbId(@Query("imdbid") String imdbId, @Query("language") Language language, Callback<SeriesResponse> callback);

	@GET("/GetSeriesByRemoteID.php")
	SeriesResponse getSeriesByZap2itId(@Query("zap2it") String zap2itId);

	@GET("/GetSeriesByRemoteID.php")
	void getSeriesByZap2itId(@Query("zap2it") String zap2itId, Callback<SeriesResponse> callback);

	@GET("/GetSeriesByRemoteID.php")
	SeriesResponse getSeriesByZap2itId(@Query("zap2it") String zap2itId, @Query("language") Language language);

	@GET("/GetSeriesByRemoteID.php")
	void getSeriesByZap2itId(@Query("zap2it") String zap2itId, @Query("language") Language language, Callback<SeriesResponse> callback);

	@GET("/GetEpisodeByAirDate.php")
	EpisodeResponse getEpisode(@Query("apikey") String apiKey, @Query("seriesid") int seriesId, @Query("airdate") String airDate);

	@GET("/GetEpisodeByAirDate.php")
	void getEpisode(@Query("apikey") String apiKey, @Query("seriesid") int seriesId, @Query("airdate") String airDate, Callback<EpisodeResponse> callback);

	@GET("/GetEpisodeByAirDate.php")
	EpisodeResponse getEpisode(@Query("apikey") String apiKey, @Query("seriesid") int seriesId, @Query("airdate") String airDate, @Query("language") Language language);

	@GET("/GetEpisodeByAirDate.php")
	void getEpisode(@Query("apikey") String apiKey, @Query("seriesid") int seriesId, @Query("airdate") String airDate, @Query("language") Language language, Callback<EpisodeResponse> callback);

	@GET("/GetRatingsForUser.php")
	UserRatingsResponse getUserRatings(@Query("apikey") String apiKey, @Query("accountid") String userId);

	@GET("/GetRatingsForUser.php")
	void getUserRatings(@Query("apikey") String apiKey, @Query("accountid") String userId, Callback<UserRatingsResponse> callback);

	@GET("/GetRatingsForUser.php")
	UserEpisodeRatingsResponse getUserRatings(@Query("apikey") String apiKey, @Query("accountid") String userId, @Query("seriesid") int seriesId);

	@GET("/GetRatingsForUser.php")
	void getUserRatings(@Query("apikey") String apiKey, @Query("accountid") String userId, @Query("seriesid") int seriesId, Callback<UserEpisodeRatingsResponse> callback);

	@GET("/User_PreferredLanguage.php")
	UserLanguageResponse getUserLanguage(@Query("accountid") String userId);

	@GET("/User_PreferredLanguage.php")
	void getUserLanguage(@Query("accountid") String userId, Callback<UserLanguageResponse> callback);

	@GET("/User_Favorites.php")
	UserFavoritesResponse getUserFavorites(@Query("accountid") String userId);

	@GET("/User_Favorites.php")
	void getUserFavorites(@Query("accountid") String userId, Callback<UserFavoritesResponse> callback);

	@POST("/User_Favorites.php?type=add")
	UserFavoritesResponse addUserFavorite(@Query("accountid") String userId, @Query("seriesid") int seriesId);

	@POST("/User_Favorites.php?type=add")
	void addUserFavorite(@Query("accountid") String userId, @Query("seriesid") int seriesId, Callback<UserFavoritesResponse> callback);

	@POST("/User_Favorites.php?type=remove")
	UserFavoritesResponse removeUserFavorite(@Query("accountid") String userId, @Query("seriesid") int seriesId);

	@POST("/User_Favorites.php?type=remove")
	void removeUserFavorite(@Query("accountid") String userId, @Query("seriesid") int seriesId, Callback<UserFavoritesResponse> callback);

	@POST("/User_Rating.php?itemtype=series")
	SeriesRatingResponse rateSeries(@Query("accountid") String userId, @Query("itemid") int seriesId, @Query("rating") int rating);

	@POST("/User_Rating.php?itemtype=series")
	void rateSeries(@Query("accountid") String userId, @Query("itemid") int seriesId, @Query("rating") int rating, Callback<SeriesRatingResponse> callback);

	@POST("/User_Rating.php?itemtype=episode")
	EpisodeRatingResponse rateEpisode(@Query("accountid") String userId, @Query("itemid") int episodeId, @Query("rating") int rating);

	@POST("/User_Rating.php?itemtype=episode")
	void rateEpisode(@Query("accountid") String userId, @Query("itemid") int episodeId, @Query("rating") int rating, Callback<EpisodeRatingResponse> callback);

}
