package be.IntecBrussel;

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
                    }
                }
            }
        }
    }

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
}
