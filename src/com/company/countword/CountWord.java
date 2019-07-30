package com.company.countword;

import java.util.*;

    public class CountWord {

        private int wordCounter;

        private List<String> shortWords = new ArrayList<>();
        private List<String> longWords = new ArrayList<>();

        ReadSongText readText = new ReadSongText();
        private SortedSet<Map.Entry<String, Integer>> sortedSet(Map<String, Integer> map)
        {
            SortedSet<Map.Entry<String, Integer>> treeSet = new TreeSet<>(
                    (o1, o2) -> {
                        int result = o2.getValue().compareTo(o1.getValue());

                        return result != 0 ? result : 1;
                    }
            );
            treeSet.addAll(map.entrySet());
            return treeSet;

        }
        public void countWords() {



            for (String words : readText.readSongText()) {
                List<String> wordlist = Arrays.asList(words.split("['\\s]"));
                for (String word : wordlist) {
                    wordCounter++;
                    if (word.length() < 3) {
                        shortWords.add(word);
                    } else longWords.add(word);
                }
            }
            System.out.println("Words in song : " + wordCounter);
            System.out.println("Short words in song is " + shortWords.size());
        }

        public void wordsWithoutBadWords()
        {
            for (int i = 0; i < BadWord.badWords.size(); i++)
            {
                for (int j = 0; j < longWords.size(); j++)
                {
                    if (BadWord.badWords.get(i).equalsIgnoreCase(longWords.get(j)))
                    {
                        longWords.remove(BadWord.badWords.get(i));
                    }
                }
            }
            System.out.println("Long words wihout bad words in song is : " + longWords.size());
        }



        public void wordsThatAreNotRepeated()
        {
            Map<String, Integer> uniquewords = new TreeMap<>();

            for (String uwords : longWords)
            {
                if (uniquewords.containsKey(uwords))
                {
                    uniquewords.put(uwords, uniquewords.get(uwords) + 1);
                } else
                    uniquewords.put(uwords, 1);
            }

            ArrayList list = new ArrayList(sortedSet(uniquewords));

            System.out.println(list);
        }
    }