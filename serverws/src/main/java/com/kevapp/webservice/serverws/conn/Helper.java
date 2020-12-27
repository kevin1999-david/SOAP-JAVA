package com.kevapp.webservice.serverws.conn;

public class Helper {
	public static final String URL = "jdbc:postgresql://localhost:5432/db_songs";
	public static final String USER = "postgres";
	public static final String PASS = "kevin";

	public static final String ALL_SONGS = "SELECT * FROM songs ORDER BY id ASC";
	public static final String ALL_SONGS_DESC = "SELECT * FROM songs ORDER BY id DESC";
	public static final String CREATE_SONG = "INSERT INTO songs (artist_name, album, title, year, image, duration, video) VALUES(?, ?, ?, ?, ?, ?, ?)";
	public static final String UPDATE_SONG = "UPDATE songs SET artist_name=?, album=?, title=?, year=?, image=?, duration=?, video=? WHERE id=?";
	public static final String REMOVE_SONG = "DELETE FROM songs WHERE id=?";
}
