
public abstract class EntertainmentValues {

	private String title;
	private String yourSummary;
	private String detail;
	private String dateWatched;
	private int yourRating;
	private boolean finished;
	private boolean rewatch;
	
	public EntertainmentValues(String title, String yourSummary, String detail, String dateWatched, int yourRating,
			boolean finished, boolean rewatch) {
		this.title = title;
		this.yourSummary = yourSummary;
		this.detail = detail;
		this.dateWatched = dateWatched;
		this.yourRating = yourRating;
		this.finished = finished;
		this.rewatch = rewatch;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		title = title.trim();
		
		this.title = title;
	}

	public String getYourSummary() {
		return yourSummary;
	}

	public void setYourSummary(String yourSummary) {
		this.yourSummary = yourSummary;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDateWatched() {
		return dateWatched;
	}

	public void setDateWatched(String dateWatched) {
		this.dateWatched = dateWatched;
	}

	public int getYourRating() {
		return yourRating;
	}

	public void setYourRating(int yourRating) {
		this.yourRating = yourRating;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public boolean isRewatch() {
		
		return rewatch;
	}

	public void setRewatch(boolean rewatch) {
		this.rewatch = rewatch;
	}
	
}
