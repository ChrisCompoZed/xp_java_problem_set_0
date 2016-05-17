import java.util.ArrayList;
import java.util.Collections;
public class Playlist {

    Playlist(String name) {
        this.name = name;
        this.songsList = new ArrayList<Song>();
    }

    public String name;

    public ArrayList<Song> songsList;

    public boolean isEmpty() {
        return songsList.isEmpty();
    }

    public void addSong(Song newSong) {
        songsList.add(newSong);
    }

    public String[] songNames() {
        String[] songNames = new String[songsList.size()];

        for (int i = 0; i < songsList.size(); i++) {
            songNames[i] = songsList.get(i).title;
        }

        return songNames;
    }

    public int totalDuration() {

        int duration = 0;

        for (int i = 0; i < songsList.size(); i++) {
            duration += songsList.get(i).durationInSeconds;
        }
        return duration;
    }

    public void swap(Song song1, Song song2) {
        Collections.swap(songsList, songsList.indexOf(song1), songsList.indexOf(song2));
    }

    public void removeSong(Song removeSong) {
        songsList.remove(removeSong);
    }

}
