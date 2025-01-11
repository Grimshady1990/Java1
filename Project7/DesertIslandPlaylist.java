import java.util.Arrays;
import java.util.ArrayList;// We need to import these utilities in order for or Arrays and ArrayLists to function

class Playlist{
	public static void main(String[] args){
		System.out.println("init test");
		String[] favoriteSongs = {"Scooter - Logical Song", "The Streets - Turn The Page", "Technomatic - Lakota", "Bicep - Glue", "Egzod - Royalty", "Skrillex - Rumble", "Twisted - Afterlife", "Tiesto - Lethal Industry", "Rob Dougan - Clubbed To Death", "Reflekt - Need To Feel Love"}; // This is an Array of my favorite songs
		System.out.println(favoriteSongs[0]); // This prints index 0 which is the first song in the Array.
		ArrayList<String> desertIslandPlaylist = new ArrayList<>(); // This is how to create a new ArrayList.
		desertIslandPlaylist.add("Rose - APT"); // This is how we add new songs to the ArrayList.
		desertIslandPlaylist.add("Oasis - Wonderwall");
		desertIslandPlaylist.add("Darude - Sandstorm");
		System.out.println(desertIslandPlaylist);
		desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs)); // This is how we add all of the songs from our favoriteSongs Array to our ArrayList.
		System.out.println(desertIslandPlaylist);
		System.out.println(desertIslandPlaylist.size()); // THis prints out the number of indexs in our ArrayList.
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0); // this is how we can remove any chosen index.
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		System.out.println(desertIslandPlaylist);
		System.out.println(desertIslandPlaylist.size());
		int songA = desertIslandPlaylist.indexOf("Skrillex - Rumble"); // this saves the index of a song to a variable.
		int songB = desertIslandPlaylist.indexOf("Reflekt - Need To Feel Love");
		System.out.println(desertIslandPlaylist);	
		desertIslandPlaylist.set(songA, "Reflekt - Need To Feel Love");
		System.out.println(desertIslandPlaylist);
		desertIslandPlaylist.set(songB, "Skrillex - Rumble"); // using .set we are able to swap the positions of songs thanks to saving the indexOf into a variable. calling songB as a parameter tells java to use that as the position to save the following String
		System.out.println(desertIslandPlaylist);
	}
}

