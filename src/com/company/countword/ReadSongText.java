package com.company.countword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReadSongText {

    private List<String> song = new ArrayList<>();
    private String href = Objects.requireNonNull(this.getClass().getClassLoader().getResource("data.txt")).getFile();

    public List<String> readSongText()
    {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(href)))
        {
            String str;
            while ((str = bufferedReader.readLine()) != null)
            {
                song.add(str);
            }
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return song;}
}
