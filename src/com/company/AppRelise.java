package com.company;

import com.company.countword.CountWord;

public class AppRelise {

    public static void appStarted(){
        CountWord countWord = new CountWord();
        countWord.countWords();
        countWord.wordsWithoutBadWords();
        countWord.wordsThatAreNotRepeated();
    }


}
