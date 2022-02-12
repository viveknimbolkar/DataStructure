package dcscracker;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaShop {

    public static void main(String[] args) {
        PizzaShop pizza = new PizzaShop();
        Scanner sc = new Scanner(System.in);
        int clients = sc.nextInt(); // total no. of clients

        int ingredientsLikedLength = 0, ingredientsDislikedLength = 0;
        ArrayList<String> ingredientsLikedList = new ArrayList<>();
        ArrayList<String> ingredientsDislikedList = new ArrayList<>();

        for (int i = 0; i < clients; i++) {
            // get liked ingredients
            ingredientsLikedLength = sc.nextInt();
            for (int j = 0; j < ingredientsLikedLength; j++) {
                String ingredientLiked = sc.next();
                if (ingredientLiked.length() > 15) return;
                ingredientsLikedList.add(ingredientLiked);
            }

            // get disliked ingredients
            ingredientsDislikedLength = sc.nextInt();
            for (int j = 0; j < ingredientsDislikedLength; j++) {
                String ingredientDisliked = sc.next();
                if (ingredientDisliked.length() > 15) return;
                ingredientsDislikedList.add(ingredientDisliked);
            }

            for (int j = 0; j < ingredientsDislikedList.size(); j++) {
                if (ingredientsLikedList.contains(ingredientsDislikedList)){
                    ingredientsLikedList.remove(ingredientsDislikedList);
                }
            }

        }
        System.out.println(ingredientsLikedList.size()+" "+ingredientsLikedList);
    }
}
