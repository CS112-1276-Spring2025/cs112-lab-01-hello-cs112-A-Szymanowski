public class Films {
    //instance variables
    private String title;
    private String directorFirstName;
    private String directorLastName;
    private String genre;
    private int releasedYear;

    //constructor
    public Films(String title, String directorFirstName, String directorLastName, String genre, int releasedYear) {
        this.setTitle(title);
        this.setDirectorFirstName(directorFirstName);
        this.setDirectorLastName(directorLastName);
        this.setGenre(genre);
        this.setReleasedYear(releasedYear);
    }

    Films Best = new Films("The Shawshank Redemption", "Frank", "Darabont", "Crime/Thriller", 1994);

    //accessor
    public String getTitle() {
        return title;
    }

    public String getDirectorFirstName() {
        return directorFirstName;
    }

    public String getDirectorLastName() {
        return directorLastName;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    //mutators
    public void setTitle(String title){
        this.title = title;}

    public void setDirectorFirstName(String directorFirstName){
        this.directorFirstName = directorFirstName;
    }
        
    public void setDirectorLastName(String directorLastName){
        this.directorLastName = directorLastName;
    }
        
    public void setGenre(String genre){
        this.genre = genre;
    }
        
    public void setReleasedYear(int releasedYear){
        this.releasedYear = releasedYear;
    }
        
    //toString
    @Override
    public String toString() {
        return "Films{title='" + title + "'}" + "Films{directorFirstName='" + directorFirstName + "'}" + "Films{directorLastName='" + directorLastName + "'}" + "Films{genre='" + genre + "'}" + "Films{releasedYear='" + releasedYear + "'}";
    }

    public boolean equals(Films otherFilms) {
        if (otherFilms == null) {
            return false;
        }
        return this.title.equals(otherFilms.title) && this.directorFirstName.equals(otherFilms.directorFirstName) && this.directorLastName.equals(otherFilms.directorLastName) && this.genre.equals(otherFilms.genre) && this.releasedYear == (otherFilms.releasedYear);
    }
}
