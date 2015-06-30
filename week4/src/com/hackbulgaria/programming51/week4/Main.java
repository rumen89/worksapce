package com.hackbulgaria.programming51.week4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MusicOrganiser mo = new MusicOrganiser();

		mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
		mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
		mo.addSong(new Song("When I'm Gone", "Eminem", 256, "Curtain Call: The Hits"));
		mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));

//		Vector<String> songs = mo.getAlbumsAndSongs();
//
//		for(int i = 0; i < songs.getSize(); i++) {
//		    System.out.println(songs.get(i));
//		}
//		System.out.println(mo.getCount());
//		
//		Vector<String> albums = mo.getAlbums();
//
//		for(int i = 0; i < albums.getSize(); i++) {
//		    System.out.println(albums.get(i));
//		}
//		
//		System.out.println(mo.getAlbumsCount());
		
		Vector<Song> songs = mo.getAlbumSongs("The Marshall Mathers LP");

		for(int i = 0; i < songs.getSize(); i++) {
		    System.out.println(songs.get(i));
		}
		
//		Vector<String> songs2 = mo.getAlbumsAndSongs();
//
//		for(int i = 0; i < songs2.getSize(); i++) {
//		    System.out.println(songs.get(i));
//		}
	}
}
