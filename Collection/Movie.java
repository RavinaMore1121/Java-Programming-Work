//Design a class for movie, with the following attributes
//title, duration, year
//-> design required constructors
//->achieve data hiding
//->make the class comparable type(compare title)
//->override required methods

package Collection;
public class Movie {
	private String title=" ";
	private double duration;
	private int year;
	Movie(String title,double duration,int year)
	{
		this.title=title;
		this.duration=duration;
		this.year=year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
