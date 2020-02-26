package com.videos.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    private String name;
    private String surname;
    private String password;
    private Date registryDate;
    private List<Video> videos;

    // Constructor method
    public User(String name, String surname, String password, Date registryDate) throws Exception {

        // Check for empty fields
        if (name==null) throw new Exception("El nom no pot estar buit.");
        if (surname==null) throw new Exception("El cognom no pot estar buit.");
        if (password==null) throw new Exception("El password no pot estar buit.");
        if (registryDate==null) throw new Exception("La data de registre no pot estar buida.");

        this.name = name;
        this.surname = surname;
        this.password = password;
        this.registryDate = registryDate;
        this.videos = new ArrayList<>();
    }

    // Method to create new video
    // Returns true if the video has been properly created
    public boolean createVideo(String URL, String title, List<String> tags) {

        try {
            Video video = new Video(URL, title, tags);
            videos.add(video);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", registryDate=" + registryDate +
                '}';
    }

    // Method to show the list of own videos
    public void showVideos() {

        System.out.println("A continuació es mostrarà el llistat dels teus vídeos.");

        // Iterate the user's list of videos
        for (Video v: videos) {
            System.out.println("=============================");
            System.out.println("Títol: " + v.getTitle());
            System.out.println("Tags: " + v.getTags().toString());
            System.out.println("URL: " + v.getURL());
        }
    }
}
