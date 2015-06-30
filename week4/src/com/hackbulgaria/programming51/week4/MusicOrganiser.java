//Have the following attributes and methods:
//
//Vector of type Song named songs
//proper constructors
//method public boolean addSong(Song s) that adds a song to the music player. 
//If addition is successful return true. If there is not enough space, return false
//method public int getCount() that returns the number of songs added to the player
//method public Vector<String> getAlbums() that returns an vector of all the different album names in 
//the Music Organiser
//method public int getAlbumsCount() that returns the number of different album names in the Music Organiser
//method public Vector<Song> getAlbumSongs(String albumName) that returns the songs in an album
//method public Vector<String> getAlbumsAndSongs() that returns an vector of all the 
//different album names in the Music Organiser, and the number of songs in each album concatenated 
//in one string for each album name.

package com.hackbulgaria.programming51.week4;

public class MusicOrganiser {

	private Vector<Song> songs = new Vector<Song>();
	private int capacity;
	private int current;

	public MusicOrganiser() {
		capacity = 10;
		current = 0;
	}

	public MusicOrganiser(int capacity) {
		this.capacity = capacity;
		current = 0;
	}

	public boolean addSong(Song song) {
		if (current == capacity) {
			return false;
		}
		songs.add(song);
		current++;
		return true;
	}

	public int getCount() {
		return current;
	}

	private boolean check(Vector<String> a, String name) {
		for (int i = 0; i < a.getSize(); i++) {
			if (a.get(i).equals(name)) {
				return true;
			}
		}
		return false;
	}

	public Vector<String> getAlbums() {
		Vector<String> albums = new Vector<String>();
		// int index = 0;

		for (int i = 0; i < songs.getSize(); i++) {
			if (!check(albums, songs.get(i).getAlbum())) {
				albums.add(songs.get(i).getAlbum());
			}
		}
		return albums;
	}

	public int getAlbumsCount() {
		return getAlbums().getSize();
	}

	// method public Vector<Song> getAlbumSongs(String albumName) that returns
	// the songs in an album
	public Vector<Song> getAlbumSongs(String albumName) {
		Vector<Song> albumSongs = new Vector<Song>();

		for (int i = 0; i < songs.getSize(); i++) {
			if (songs.get(i).getAlbum().equals(albumName)) {
				albumSongs.add(songs.get(i));
			}
		}
		return albumSongs;
	}

	// method public Vector<String> getAlbumsAndSongs() that returns an vector
	// of all the
	// different album names in the Music Organiser, and the number of songs in
	// each album concatenated
	// in one string for each album name.

	public Vector<String> getAlbumsAndSongs() {
		Vector<String> result = new Vector<String>();
		
		String str = "";
		
		for (int i = 0; i < getAlbums().getSize(); i++) {
			str += getAlbums().get(i) + "(" + getAlbumSongs(getAlbums().get(i)).getSize() + ")";
			result.add(str);
			str = "";
		}
		return result;
	}

}
