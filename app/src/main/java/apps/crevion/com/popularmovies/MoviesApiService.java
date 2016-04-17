package apps.crevion.com.popularmovies;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by ucup_aw on 16/04/16.
 */
public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);

    @GET("/movie/latest")
    void getLatestMovies(Callback<Movie.MovieResult> cb);
}
