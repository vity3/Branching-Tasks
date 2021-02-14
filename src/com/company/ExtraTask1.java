package com.company;

public class ExtraTask1 {
    public static void main (String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Luka", position);
    }

    public static int calculateHighScorePosition(int score) {
        int position;
        if (score > 1000) {
            position = 1;
        } else if (score > 500 && score < 1000) {
            position = 2;
        } else if (score > 100 && score < 500) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }

        public static void displayHighScorePosition(String player, int position) {
            System.out.println(player + " managed to get into position " + position + " on the high score table.");
        }
}