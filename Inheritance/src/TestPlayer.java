class Player{
	String name;
	int age;
	String country;
	int matchesPlayed;
	int jerseyNumber;
	Player() {
		this.name = "not given";
		this.age = 0;
		this.country = "country";
		this.matchesPlayed =0;
		this.jerseyNumber =0;
	}
	Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
		this.jerseyNumber = jerseyNumber;
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
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}
	int getMatchesPlayed() {
		return matchesPlayed;
	}
	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	int getJerseyNumber() {
		return jerseyNumber;
	}
	void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	} 
	void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Country:"+this.country);
		System.out.println("Matches Played:"+this.matchesPlayed);
		System.out.println("Jersey Number:"+this.jerseyNumber);
	}	
}
class CricketPlayer extends Player{
	int totalRuns;
	int totalWickets;
	String battlingstyle;
	String bowlingStyle;
	CricketPlayer() {
        super();
		this.totalRuns = 0;
		this.totalWickets = 0;
		this.battlingstyle = "battlingstyle";
		this.bowlingStyle = "bowlingStyle";
	}
	CricketPlayer(String name,int age,String country,int matchesPlayed,int jerseyNumber,int totalRuns, int totalWickets, String battlingstyle, String bowlingStyle) {
        super(name,age,country,matchesPlayed,jerseyNumber);
		this.totalRuns = totalRuns;
		this.totalWickets = totalWickets;
		this.battlingstyle = battlingstyle;
		this.bowlingStyle = bowlingStyle;
	}
	int getTotalRuns() {
		return totalRuns;
	}
	void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	int getTotalWickets() {
		return totalWickets;
	}
	void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}
	String getBattlingstyle() {
		return battlingstyle;
	}
	void setBattlingstyle(String battlingstyle) {
		this.battlingstyle = battlingstyle;
	}
	String getBowlingStyle() {
		return bowlingStyle;
	}
	void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	void display()
	{
		super.display();
		System.out.println("Total Runs:"+this.totalRuns);
		System.out.println("Total Wickets:"+this.totalWickets);
		System.out.println("Battling style:"+this.battlingstyle);
		System.out.println("Bowling Style:" + this.bowlingStyle);
	}	
}
class FootBallPlayer extends Player{
	int totalGoals;
	String palyingPosition;
	FootBallPlayer() {
		super();
		this.totalGoals = totalGoals;
		this.palyingPosition = palyingPosition;
	}
	
	FootBallPlayer(String name,int age,String country,int matchesPlayed,int jerseyNumber,int totalGoals, String palyingPosition) {
		super(name,age,country,matchesPlayed,jerseyNumber);
		this.totalGoals = totalGoals;
		this.palyingPosition = palyingPosition;
	}

	int getTotalGoals() {
		return totalGoals;
	}

	void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}

	String getPalyingPosition() {
		return palyingPosition;
	}

	void setPalyingPosition(String palyingPosition) {
		this.palyingPosition = palyingPosition;
	}
	void display()
	{
		super.display();
		System.out.println("Total goals:"+ this.totalGoals);
		System.out.println("Playing Position:"+ this.palyingPosition);
	}
}
class TestPlayer {
	public static void main(String[] args)
	{
	    Player p1=new Player("Bhumi",21,"india",3,6);
	    p1.display();
	    CricketPlayer cp=new CricketPlayer("gauri",21,"india",3,6,15,7,"Defence","Fast");
	    cp.display();
	}
}
