package be.IntecBrussel;

<<<<<<< HEAD
=======
import java.util.Objects;
import java.util.SplittableRandom;

>>>>>>> 0fa6496005218f3be290b2be31ef309dd86165a5
public class PostCard {
    private String country;
    private String continent;

    public PostCard(String country, String continent) {
        this.country = country;
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

<<<<<<< HEAD
    public String toString() {
        return "PostCard{" + "country='" + country + '\'' + ", continent='" + continent + '\'' + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PostCard)) return false;
        PostCard other = (PostCard) obj;
        return country.equals(other.country) && continent.equals(other.continent);
    }

    public int hashCode() {
        return country.hashCode() + continent.hashCode();
=======
    @Override
    public String toString() {
        return "PostCard{" +
                "country='" + country + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PostCard postCard = (PostCard) o;
        return Objects.equals(country, postCard.country) && Objects.equals(continent, postCard.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, continent);
>>>>>>> 0fa6496005218f3be290b2be31ef309dd86165a5
    }
}
