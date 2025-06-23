package be.IntecBrussel;

import java.util.Objects;
import java.util.SplittableRandom;

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
    }
}
