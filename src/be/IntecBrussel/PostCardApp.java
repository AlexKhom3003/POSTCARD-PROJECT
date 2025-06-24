package be.IntecBrussel;

<<<<<<< HEAD
import be.IntecBrussel.PostCard;

import java.util.*;

public class PostCardApp {
    public static void main(String[] args) {
        List<PostCard> yourPostCardList = new ArrayList<>();
        yourPostCardList.add(new PostCard("Belgium", "Europe"));
        yourPostCardList.add(new PostCard("France", "Europe"));
        yourPostCardList.add(new PostCard("Japan", "Asia"));
        yourPostCardList.add(new PostCard("Belgium", "Europe"));
        yourPostCardList.add(new PostCard("USA", "North America"));
        yourPostCardList.add(new PostCard("France", "Europe"));

        List<PostCard> yourFriendsPostCardList = new ArrayList<>();
        yourFriendsPostCardList.add(new PostCard("Botswana", "Africa"));
        yourFriendsPostCardList.add(new PostCard("North Korea", "Asia"));

        List<Friend> friends = new ArrayList<>();
        friends.add(new Friend("Bobby", false, 3, 5));
        friends.add(new Friend("Melissa", false, 1, 6));
        friends.add(new Friend("Darla", true, 14, 2));
        friends.add(new Friend("Bert", false, 10, 4));
        friends.add(new Friend("Grandma", true, 12, 7));
        friends.add(new Friend("Fester", false, 1, 2));
        friends.add(new Friend("Anna", false, 8, 4));

        System.out.println("Your postcards BEFORE swap:");
        for (PostCard p : yourPostCardList) {
            System.out.println(p);
        }

        swapDuplicateCard(yourPostCardList, yourFriendsPostCardList);

        System.out.println("\nYour postcards AFTER swap:");
        for (PostCard p : yourPostCardList) {
            System.out.println(p);
        }

        System.out.println("\nSorted by country:");
        sortCardsByCountry(yourPostCardList);

        List<PostCard> duplicates = extractDuplicates(yourPostCardList);
        System.out.println("\nDuplicates that were removed:");
        for (PostCard d : duplicates) {
            System.out.println(d);
        }

        System.out.println("Number of duplicates removed: " + duplicates.size());

        System.out.println("\nYour final postcards (no duplicates):");
        for (PostCard p : yourPostCardList) {
            System.out.println(p);
        }

        giveCardsToFriends(friends);
    }

    public static void swapDuplicateCard(List<PostCard> yourList, List<PostCard> friendList) {
        for (PostCard yourCard : yourList) {
            if (Collections.frequency(yourList, yourCard) > 1) {
                for (PostCard friendCard : friendList) {
                    if (!yourList.contains(friendCard)) {
                        int index = yourList.indexOf(yourCard);
                        yourList.set(index, friendCard);
                        friendList.remove(friendCard);
                        return;
=======
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PostCardApp {
    public static void main(String[] args) {
        //My cards
        PostCard belgium = new PostCard("Belgium", "Europe");
        PostCard france = new PostCard("France", "Europe");
        PostCard japan = new PostCard("Japan", "Asia");
        PostCard rdc = new PostCard("Democratic Republic of Congo", "Africa");
        PostCard southKorea = new PostCard("South Korea", "Asia");
        PostCard belgium2 = new PostCard("Belgium", "Europe");
        PostCard southAfrica = new PostCard("South Africa", "Africa");
        PostCard france2 = new PostCard("France", "Europe");
        PostCard belgium3 = new PostCard("Belgium", "Europe");
        PostCard usa = new PostCard("United States of America", "North America");
        PostCard canada = new PostCard("Canada", "North America");
        PostCard peru = new PostCard("Peru", "South America");
        PostCard samoa = new PostCard("Samoa", "Oceania");
        PostCard belgium4 = new PostCard("Belgium", "Europe");
        PostCard france3 = new PostCard("France", "Europe");
        List<PostCard> yourPostCardList = new ArrayList<>();
        yourPostCardList.add(belgium);
        yourPostCardList.add(france);
        yourPostCardList.add(japan);
        yourPostCardList.add(rdc);
        yourPostCardList.add(southKorea);
        yourPostCardList.add(belgium2);
        yourPostCardList.add(southAfrica);
        yourPostCardList.add(france2);
        yourPostCardList.add(belgium3);
        yourPostCardList.add(usa);
        yourPostCardList.add(canada);
        yourPostCardList.add(peru);
        yourPostCardList.add(samoa);
        yourPostCardList.add(belgium4);
        yourPostCardList.add(france3);
//My friend’s cards
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");
        List<PostCard> yourFriendsPostCardList = new ArrayList();
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);
    }
    //My friends
    Friend bobby = new Friend("Bobby",false, 3, 5);
    Friend melissa = new Friend("Melissa",false, 1, 6);
    Friend darla = new Friend("Darla",true, 14, 2);
    Friend bert = new Friend("Bert",false, 10, 4);
    Friend grandma = new Friend("Nana",true, 12, 7);
    Friend fester = new Friend("Fester",false, 1, 2);
    Friend anna = new Friend("Anna",false, 8, 4);

    public static void swapDuplicateCard (List<PostCard> yourList, List<PostCard> friendList){
        for (PostCard yourCard : yourList){
            if (Collections.frequency(yourList, yourCard) > 1){
                for (PostCard friendCard : friendList){
                    if (!yourList.contains(friendCard)){
                        int indexToReplace  = yourList.indexOf(yourCard);
>>>>>>> 0fa6496005218f3be290b2be31ef309dd86165a5
                    }
                }
            }
        }
    }

<<<<<<< HEAD
    public static void sortCardsByCountry(List<PostCard> cards) {
        Collections.sort(cards, new Comparator<PostCard>() {
            public int compare(PostCard a, PostCard b) {
                return a.getCountry().compareTo(b.getCountry());
            }
        });

        for (PostCard p : cards) {
            System.out.println(p);
        }
    }

    public static List<PostCard> extractDuplicates(List<PostCard> list) {
        List<PostCard> duplicates = new ArrayList<>();
        Set<PostCard> seen = new HashSet<>();

        for (PostCard card : list) {
            if (Collections.frequency(list, card) > 1 && !seen.contains(card)) {
                seen.add(card);
                int count = Collections.frequency(list, card);
                for (int i = 1; i < count; i++) {
                    duplicates.add(card);
                }
            }
        }

        Iterator<PostCard> it = list.iterator();
        while (it.hasNext()) {
            PostCard c = it.next();
            if (Collections.frequency(list, c) > 1) {
                it.remove();
            }
        }

        list.addAll(seen);
        return duplicates;
    }

    public static void giveCardsToFriends(List<Friend> friends) {
        PriorityQueue<Friend> sortedFriends = new PriorityQueue<>(new Comparator<Friend>() {
            public int compare(Friend f1, Friend f2) {
                if (f1.isFamily() && !f2.isFamily()) return -1;
                if (!f1.isFamily() && f2.isFamily()) return 1;

                if (f1.getFriendShipLevel() != f2.getFriendShipLevel()) {
                    return Integer.compare(f2.getFriendShipLevel(), f1.getFriendShipLevel());
                }

                return Integer.compare(f2.getYearsKnown(), f1.getYearsKnown());
            }
        });

        for (Friend f : friends) {
            sortedFriends.offer(f);
        }

        System.out.println("\nGiving postcards to friends:");
        while (!sortedFriends.isEmpty()) {
            Friend next = sortedFriends.poll();
            System.out.println(next.getName() + " receives a postcard.");
        }
    }
=======



>>>>>>> 0fa6496005218f3be290b2be31ef309dd86165a5
}
