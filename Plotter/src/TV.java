import java.text.NumberFormat;

public class TV extends EntertainmentValues {

	 private double seasonRating;
	 private int episodes;

	public double getSeasonRating() {
		double rating = getYourRating();
		String output ="";
		rating += rating/getEpisodes();
		NumberFormat number = NumberFormat.getInstance();
		number.setMaximumFractionDigits(3);
		output = number.format(rating);
		System.out.println("Your current season rating is " + output);
		return seasonRating;
	}

	public void setSeasonRating(double seasonRating) {
		this.seasonRating = seasonRating;
	}

	public int getEpisodes() {
		return episodes;
	}

	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}

}
