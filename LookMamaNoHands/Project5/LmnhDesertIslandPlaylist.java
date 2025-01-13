import java.util.Arrays;
import java.util.ArrayList;

public class LmnhDesertIslandPlaylist{
    public static void main(String[] args){
        System.out.println("init test");
        String[] favSongs = {"Public Domain - Operation Blade", "Rose - APT", "Beatles - HeyJude", "Darude - Sandstorm", "Eminem - Lose Yourself"};
        System.out.println(Arrays.toString(favSongs));
        ArrayList<String> newList = new ArrayList<>();
        newList.add("The Streets - Turn the Page");
        newList.add("Foo Fighters - Pretender");
        newList.add("America - Horse With No Name");
        System.out.println(newList);
        newList.addAll(Arrays.asList(favSongs));
        System.out.println(newList.size());
        System.out.println(newList);
        newList.remove(0);
        newList.remove(0);
        newList.remove(0);
        System.out.println(newList.size());
        System.out.println(newList);
        int songA = newList.indexOf("Public Domain - Operation Blade");
        int songB = newList.indexOf("Eminem - Lose Yourself");
        newList.set(songA, "Eminem -Lose Yourself");
        newList.set(songB, "Public Domain - Operation Blade");
        System.out.println(newList);
       
    }
}
