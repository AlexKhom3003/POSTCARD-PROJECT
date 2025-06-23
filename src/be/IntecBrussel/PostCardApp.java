package be.IntecBrussel;

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
                        yourList.set(indexToReplace, friendCard);
                        friendList.remove(friendCard);
                        return;
                    }
                }
            }
        }

    }





}
