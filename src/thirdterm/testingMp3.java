/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdterm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Gillian
 */
public class testingMp3 {

    public int countStopWords() {
        int stopWordsCount = 0;

        String path = "C:\\Users\\Gillian\\Documents\\NetBeansProjects\\AnalyticsTest\\src\\analyticstest\\sample.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String[] stopWordsBank = {"i", "me", "myself", "my", "we", "our", "ours", "ourselves", "you", "your",
                "yours", "yourself", "yourselves", "he", "him", "his", "himself", "she", "her", "hers", "herself", "it",
                "its", "itself", "they", "are", "that", "them", "their", "theirs", "a", "an", "themselves", "what",
                "which", "who", "whom", "this", "these", "those", "am", "is", "are", "was", "were", "be", "been", "being",
                "have", "has", "had", "having", "do", "does", "did", "doing", "the", "and", "but", "if", "or", "because",
                "as", "until", "while", "of", "at", "by", "for", "with", "about", "against", "between", "into", "through", "during",
                "during", "before", "after", "above", "below", "to", "from", "up", "down", "in", "out", "on", "off",
                "over", "under", "again", "further", "then", "once", "here", "there", "when", "where", "why", "how", "all",
                "any", "both", "each", "few", "more", "most", "other", "some", "such", "no", "nor", "not", "only", "own", "same",
                "so", "than", "too", "very", "can", "will", "just", "should", "now"};

            String line = "";

            while ((line = br.readLine()) != null) {

                String[] words = line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < stopWordsBank.length; j++) {
                        String wordsLower = words[i].toLowerCase();
                        if (wordsLower.equals(stopWordsBank[j])) {

                            stopWordsCount++;
                        }
                    }

                }
                System.out.println(Arrays.toString(words));

            }
            System.out.println("countStopWords: " + stopWordsCount);

        } catch (IOException ex) {
            System.out.println("error");
        }

        return stopWordsCount;

    }

    /**
     * this method counts the frequency of each term present in the whole
     * document. The frequency of each term can be calculated using the
     * following formula:
     *
     * TF(t) = (Number of times term t appears in a document) / (Total number of
     * terms in the document). Does not return any value but takes in the total
     * number of terms in the document as input parameter.
     *
     * This method also writes the frequencies in a separate file called
     * TermFrequencies.txt
     *
     * @param TotalTerms
     */
    public void countTermFrequencyWrite(int TotalTerms) {
        String path = "C:\\Users\\Gillian\\Documents\\NetBeansProjects\\AnalyticsTest\\src\\analyticstest\\sample.txt";
        
        HashMap<String, Integer> repetition = new HashMap<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = "";

            while ((line = br.readLine()) != null) {

                String[] words = line.split(" ");
                
                for(String word: words){
                    String toLower = word.toLowerCase();
                    Integer count = repetition.get(toLower);
                    if(count == null){
                        count = 1;
                    }
                    repetition.put(word, count + 1);
                    System.out.println("term: " + toLower + ", count: " + count);
                }               
            }

        } catch (IOException ex) {
            System.out.println("error");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testingMp3 temp = new testingMp3();
        temp.countStopWords();
        temp.countTermFrequencyWrite(5);
    }

}
