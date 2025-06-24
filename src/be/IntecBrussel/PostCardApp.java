package be.IntecBrussel;

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

        System.out.println("Your postcards before swap:");
        for (PostCard p : yourPostCardList) {
            System.out.println(p);
        }

        swapDuplicateCard(yourPostCardList, yourFriendsPostCardList);

        System.out.println("\nYour postcards after swap:");
        for (PostCard p : yourPostCardList) {
            System.out.println(p);
        }

        System.out.println("\nSorted by country:");
        sortCardsByCountry(yourPostCardList);

        List<PostCard> duplicates = extractDuplicates(yourPostCardList);
        System.out.println("\nRemoved duplicates:");
        for (PostCard p : duplicates) {
            System.out.println(p);
        }
        System.out.println("Number of duplicates: " + duplicates.size());

        System.out.println("\nYour final postcards:");
        for (PostCard p : yourPostCardList) {
            System.out.println(p);
        }

        System.out.println("\nGiving postcards to friends:");
        giveCardsToFriends(friends);
    }

    // opdracht 1: swap duplicates
    public static void swapDuplicateCard(List<PostCard> yourList, List<PostCard> friendList) {
        for (PostCard yourCard : yourList) {
            int count = Collections.frequency(yourList, yourCard);
            if (count > 1) {
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

    // opdracht 2:
    public static void sortCardsByCountry(List<PostCard> cards) {
        Collections.sort(cards, new Comparator<PostCard>() {
            public int compare(PostCard p1, PostCard p2) {
                return p1.getCountry().compareTo(p2.getCountry());
            }
        });

        for (PostCard p : cards) {
            System.out.println(p);
        }
    }

    // opdracht 3
    public static List<PostCard> extractDuplicates(List<PostCard> list) {
        List<PostCard> duplicates = new ArrayList<>();
        Set<PostCard> alreadySeen = new HashSet<>();
        List<PostCard> finalList = new ArrayList<>();

        for (PostCard card : list) {
            int count = Collections.frequency(list, card);
            if (count > 1 && !alreadySeen.contains(card)) {
                alreadySeen.add(card);
                for (int i = 1; i < count; i++) {
                    duplicates.add(card);
                }
                finalList.add(card); // keep only one
            } else if (count == 1) {
                finalList.add(card);
            }
        }

        list.clear();
        list.addAll(finalList);
        return duplicates;
    }


    // opdracht 4: priority queue by family, friendship, years known
    public static void giveCardsToFriends(List<Friend> friends) {
        PriorityQueue<Friend> queue = new PriorityQueue<>(new Comparator<Friend>() {
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
            queue.offer(f);
        }

        while (!queue.isEmpty()) {
            Friend f = queue.poll();
            System.out.println(f.getName() + " receives a postcard.");
        }
    }
}

