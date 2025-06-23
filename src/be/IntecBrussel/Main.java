package be.IntecBrussel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1️⃣ Твои открытки (с дубликатами)
        List<PostCard> yourPostCardList = new ArrayList<>();
        yourPostCardList.add(new PostCard("Belgium", "Europe"));
        yourPostCardList.add(new PostCard("France", "Europe"));
        yourPostCardList.add(new PostCard("Japan", "Asia"));
        yourPostCardList.add(new PostCard("Belgium", "Europe")); // дубликат!
        yourPostCardList.add(new PostCard("USA", "North America"));

        // 2️⃣ Открытки друга (уникальные для тебя)
        List<PostCard> yourFriendsPostCardList = new ArrayList<>();
        yourFriendsPostCardList.add(new PostCard("Botswana", "Africa"));  // у тебя нет такой
        yourFriendsPostCardList.add(new PostCard("North Korea", "Asia"));

        // 3️⃣ Печатаем ДО обмена
        System.out.println("📮 Твои открытки до обмена:");
        yourPostCardList.forEach(System.out::println);

        System.out.println("\n📮 Открытки друга до обмена:");
        yourFriendsPostCardList.forEach(System.out::println);

        // 4️⃣ Вызываем метод обмена
        swapDuplicateCard(yourPostCardList, yourFriendsPostCardList);

        // 5️⃣ Печатаем ПОСЛЕ обмена
        System.out.println("\n✅ Твои открытки после обмена:");
        yourPostCardList.forEach(System.out::println);

        System.out.println("\n✅ Открытки друга после обмена:");
        yourFriendsPostCardList.forEach(System.out::println);
    }

    // ⬇️ Вставь сюда метод swapDuplicateCard(...) целиком

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
