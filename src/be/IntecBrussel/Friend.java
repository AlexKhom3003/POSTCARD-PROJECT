package be.IntecBrussel;

public class Friend {
    private String name;
    private boolean family;
    private int yearsKnown;
    private int friendShipLevel;

    public Friend(String name, boolean family, int yearsKnown, int friendShipLevel) {
        this.name = name;
        this.family = family;
        this.yearsKnown = yearsKnown;
        this.friendShipLevel = friendShipLevel;
    }

    public String getName() {
        return name;
    }

    public boolean isFamily() {
        return family;
    }

    public int getYearsKnown() {
        return yearsKnown;
    }

    public int getFriendShipLevel() {
        return friendShipLevel;
    }

    public String toString() {
        return "Friend{" + "name='" + name + '\'' + ", family=" + family +
                ", yearsKnown=" + yearsKnown + ", friendShipLevel=" + friendShipLevel + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Friend)) return false;
        Friend other = (Friend) obj;
        return family == other.family &&
                yearsKnown == other.yearsKnown &&
                friendShipLevel == other.friendShipLevel &&
                name.equals(other.name);
    }

    public int hashCode() {
        return name.hashCode() + yearsKnown + friendShipLevel + (family ? 1 : 0);
    }
}
