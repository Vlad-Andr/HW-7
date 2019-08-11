package com.company;
import com.company.countword.CountingWords;

public class AppRelise {
    public static void start(){
        CountingWords countWord = new CountingWords();
        countWord.countWords();
        countWord.goodWords();
        countWord.noRepeatWords();
    }


}