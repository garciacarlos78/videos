package com.videos.project;

import java.util.List;

public class Video {

    private String URL;
    private String title;
    private List<String> tags;

    public Video(String URL, String title, List<String> tags) throws Exception {

        // Check for not empty fields
        //  but neither is a valid value)
        if (URL==null) throw new Exception("La URL no pot estar buida.");
        if (title==null) throw new Exception("El títol no pot estar buit.");
        if (tags==null || tags.size()==0) throw new Exception("La llista de tags no pot estar buida.");
            
        this.URL = URL;
        this.title = title;
        this.tags = tags;
    }

    public String getURL() {
        return URL;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Video{" +
                "URL='" + URL + '\'' +
                ", title='" + title + '\'' +
                ", tags=" + tags +
                '}';
    }
}
