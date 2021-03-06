package tejha.movieflix.Service;


import java.util.List;

import tejha.movieflix.entity.MovieEntity;

public interface MovieService {

	
	public List<MovieEntity> showAllMovies();

public List<MovieEntity> showByYear(String year);
	
	public List<MovieEntity> showByTitle(String title);
	
	public List<MovieEntity> showByGenre(String genre);
	
	public List<MovieEntity> showByType(String type);
	
	public List<MovieEntity> showByTopType(String type);
	
	public List<MovieEntity> showByImdbRating();
	
	public List<MovieEntity> showByImdbVotes();
	
	public MovieEntity showOneMovie(String mid);
	
	public MovieEntity createMovie(MovieEntity movieEntity);
	
	public MovieEntity updateMovie(String id, MovieEntity movieEntity);
	
	public void deleteMovie(String mid);
	
}
