package com.videos.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // User creation

    	// Empty fields tests
        try {
//        User user = new User(null, "García", "password", new Date());
//        User user = new User("Carlos", null, "password", new Date());
//        User user = new User("Carlos", "García", null, new Date());
//        User user = new User("Carlos", "García", "password", null);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }


        // Non empty field test
        User user = null;
        try {
            user = new User("Carlos", "García", "password", new Date());
            System.out.println(user.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }

        // Video creation

        // Array of tags
        List<String> tags = new ArrayList<>();
        tags.add("tag1");
        tags.add("tag2");
        tags.add("tag3");

        // Empty field tests
        Video video;
        try {
//            video=new Video(null, "Títol video 1", tags);
//            video=new Video("http://url.del.video", null, tags);
//            video=new Video("http://url.del.video", "Títol video 1", null);
        } catch (Exception e) {
        	System.out.println("Error: " + e.getMessage());
        	System.exit(1);
        }

        // Correct video test
        try {
            video = new Video("http://url.del.video", "Títol video 1", tags);
            System.out.println(video.toString());
        } catch (Exception e) {
        	System.out.println("Error: " + e.getMessage());
        	System.exit(1);
        }

        // We add 3 videos to the user
        if (user != null) {
            user.createVideo("http://url.video1.com", "Títol vídeo 1", tags);
            user.createVideo("http://url.video2.com", "Títol vídeo 2", tags);
            user.createVideo("http://url.video3.com", "Títol vídeo 3", tags);

            // Show lists of videos of the user
            user.showVideos();
        }
    }
}
