package isp.lab2.Exercise6WordGuess;

import java.util.Random;
import java.util.Scanner;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     //* @param c
    // * @param word
     //* @return
     */
    public static int[] getOccurrencePositions(char c, char[] word) {
        int count = 0;
        for (char letter : word) {
            if (letter == c) {
                count++;
            }
        }

        int[] positions = new int[count];
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == c) {
                positions[index++] = i ; // Adding 1 to match human-readable positions (starting from 1)
            }
        }

        return positions;
    }

    public static void main(String[] args) {
        char[] word ; // replace with a word from a dictionary
        boolean solved = false;
        Scanner scanner = new Scanner(System.in);

        String[] dictionary = {"apple", "banana", "orange", "grape", "pineapple", "kiwi", "strawberry", "blueberry", "watermelon"};
        Random random = new Random();
        word = dictionary[random.nextInt(dictionary.length)].toCharArray(); // Generate a random word

        int tries = 0;
        StringBuilder guessedLetters = new StringBuilder(); // To store guessed letters
        while (tries < 10 && !solved) {
            tries++;
            System.out.println("Enter a letter: ");
            String letter = scanner.nextLine();
            char guess = letter.charAt(0);
            guessedLetters.append(guess).append(" ");

            int[] occurrences = getOccurrencePositions(guess, word);
            // todo: continue the implementation
            if (occurrences.length == 0) {
                System.out.println("The letter " + guess + " is not in the word.");
            } else {
                System.out.print("The letter " + guess + " is in the word at position(s): ");
                for (int position : occurrences) {
                    System.out.print(position + " ");
                }
                System.out.println();
            }

            // Display currently guessed letters and their position
            System.out.println("Currently guessed letters: " + guessedLetters);

            // Check if the word is fully guessed
            solved = true;
            for (char letterChar : word) {
                String letterString = String.valueOf(letterChar);
                if (!guessedLetters.toString().contains(letterString)) {
                    solved = false;
                    break;
                }
            }
        }

        if (solved) {
            System.out.println("Congratulations! You guessed the word.");
        } else {
            System.out.println("Sorry, you've reached the maximum number of tries. The word was: " + String.valueOf(word));
        }
        System.out.println("Number of tries needed: " + tries);
        }
    }


