
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cine cinema = new Cine();
		
		Movie movie = new Movie();
		
		movie.setScript("This is played by the movie");
		
		Documentary documentary = new Documentary();
		
		documentary.setScript("This is played by the documentary");
		
		Drama drama = new Drama();
		
		drama.setScript("This is played by the documentary");
		
		cinema.playMovie(movie);
		
		cinema.playMovie(documentary);
		
		cinema.playMovie(drama);

	}

}
