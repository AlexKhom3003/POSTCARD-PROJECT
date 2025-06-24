package be.IntecBrussel;

<<<<<<< HEAD
=======
import java.util.Objects;

>>>>>>> 0fa6496005218f3be290b2be31ef309dd86165a5
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

<<<<<<< HEAD
=======
    public void setName(String name) {
        this.name = name;
    }

>>>>>>> 0fa6496005218f3be290b2be31ef309dd86165a5
    public boolean isFamily() {
        return family;
    }

<<<<<<< HEAD
=======
    public void setFamily(boolean family) {
        this.family = family;
    }

>>>>>>> 0fa6496005218f3be290b2be31ef309dd86165a5
    public int getYearsKnown() {
        return yearsKnown;
    }

<<<<<<< HEAD
=======
    public void setYearsKnown(int yearsKnown) {
        this.yearsKnown = yearsKnown;
    }

>>>>>>> 0fa6496005218f3be290b2be31ef309dd86165a5
    public int getFriendShipLevel() {
        return friendShipLevel;
    }

<<<<<<< HEAD
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
=======
    public void setFriendShipLevel(int friendShipLevel) {
        this.friendShipLevel = friendShipLevel;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", family=" + family +
                ", yearsKnown=" + yearsKnown +
                ", friendShipLevel=" + friendShipLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return family == friend.family && yearsKnown == friend.yearsKnown && friendShipLevel == friend.friendShipLevel && Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family, yearsKnown, friendShipLevel);
>>>>>>> 0fa6496005218f3be290b2be31ef309dd86165a5
    }
}
