class Artist{
	String name;
	int age;
	Artist() {
		this.name ="xyz";
		this.age = 0;
	}
	Artist(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	void display()
	{
		System.out.println("Name:" + this.name);
		System.out.println("Age:" + this.age);
	}
	
}
class Painter extends Artist{
	String paintingStyle;
	String mediumUsed;
	int noOfPainting;
	Painter() {
		super();
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
		this.noOfPainting = noOfPainting;
	}
	Painter(String name,int age,String paintingStyle, String mediumUsed, int noOfPainting) {
		super(name,age);
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
		this.noOfPainting = noOfPainting;
	}
	String getPaintingStyle() {
		return paintingStyle;
	}
	void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}
	String getMediumUsed() {
		return mediumUsed;
	}
	void setMediumUsed(String mediumUsed) {
		this.mediumUsed = mediumUsed;
	}
	int getNoOfPainting() {
		return noOfPainting;
	}
	void setNoOfPainting(int noOfPainting) {
		this.noOfPainting = noOfPainting;
	}
	void display()
	{
		super.display();
		System.out.println("Paintin style" + this.paintingStyle);
		System.out.println("Medium Used:" + this.mediumUsed);
		System.out.println("No of Painting:" + this.noOfPainting);
	}
	
}
class Actor extends Artist{
	String filmIndustry;
	int noOfMovies;
	Actor() {
		super();
		this.filmIndustry = filmIndustry;
		this.noOfMovies = noOfMovies;
	}
	Actor(String name,int age,String filmIndustry, int noOfMovies) {
		super(name,age);
		this.filmIndustry = filmIndustry;
		this.noOfMovies = noOfMovies;
	}
	String getFilmIndustry() {
		return filmIndustry;
	}
	void setFilmIndustry(String filmIndustry) {
		this.filmIndustry = filmIndustry;
	}
	int getNoOfMovies() {
		return noOfMovies;
	}
	void setNoOfMovies(int noOfMovies) {
		this.noOfMovies = noOfMovies;
	}
	void display()
	{
		super.display();
		System.out.println("Film Industry:"+this.filmIndustry);
		System.out.println("Number of movie:"+this.noOfMovies);
	}
	
	
}
class TestArtist {
   public static void main(String[] args)
   {
	   Artist a1=new Artist("Bhumika",20);
	   a1.display();
	   Painter p1=new Painter("Bhumika",20,"Frrehand","Pencil",4);
	   p1.display();
   }
}
