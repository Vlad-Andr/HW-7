package com.company.countword;
import java.util.ArrayList;
import java.util.List;

public class BadWord {
    static List<String> badWords = new ArrayList();
    static
    {
        badWords.add("shit");
        badWords.add("whore");
        badWords.add("fuck");
    }
}