package be.IntecBrussel;

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

        public String getContinent() {
            return continent;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        public String toString() {
            return country + " (" + continent + ")";
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof PostCard)) return false;
            PostCard other = (PostCard) obj;
            return country.equals(other.country) && continent.equals(other.continent);
        }

        public int hashCode() {
            return country.hashCode() + continent.hashCode();
        }
    }
