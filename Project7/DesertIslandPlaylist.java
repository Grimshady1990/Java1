import java.util.Arrays;
import java.util.ArrayList;

class Playlist{
	public static void main(String[] args){
		System.out.println("init test");
		String[] favoriteSongs = {"Scooter - Logical Song", "The Streets - Turn The Page", "Technomatic - Lakota", "Bicep - Glue", "Egzod - Royalty", "Skrillex - Rumble", "Twisted - Afterlife", "Tiesto - Lethal Industry", "Rob Dougan - Clubbed To Death", "Reflekt - Need To Feel Love"};
		System.out.println(favoriteSongs[0]);
		ArrayList<String> desertIslandPlaylist = new ArrayList<>();
		desertIslandPlaylist.add("Rose - APT");
		desertIslandPlaylist.add("Oasis - Wonderwall");
		desertIslandPlaylist.add("Darude - Sandstorm");
		System.out.println(desertIslandPlaylist);
		desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
		System.out.println(desertIslandPlaylist);
		System.out.println(desertIslandPlaylist.size());
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		desertIslandPlaylist.remove(0);
		System.out.println(desertIslandPlaylist);
		System.out.println(desertIslandPlaylist.size());
		int songA = desertIslandPlaylist.indexOf("Skrillex - Rumble");
		int songB = desertIslandPlaylist.indexOf("Reflekt - Need To Feel Love");
		System.out.println(desertIslandPlaylist);
		String tempA = "Skrillex - Rumble";
		desertIslandPlaylist.set(songA, "Reflekt - Need To Feel Love");
		System.out.println(desertIslandPlaylist);
		desertIslandPlaylist.set(songB, "Skrillex - Rumble");
		System.out.println(desertIslandPlaylist);
	}
}

