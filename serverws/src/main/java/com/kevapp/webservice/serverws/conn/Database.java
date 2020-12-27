package com.kevapp.webservice.serverws.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kevapp.webservice.serverws.model.Song;

public class Database {
	private Connection conn;
	private List<Song> songs;

	public Database() {
		try {
			this.openConnection();
			this.songs = new ArrayList<Song>();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Song> getSongs() throws SQLException {
		this.cleanArrayList();
		Statement statement = this.conn.createStatement();
		ResultSet response = statement.executeQuery(Helper.ALL_SONGS_DESC);
		while (response.next()) {
			String title = response.getString("title");
			String artistName = response.getString("artist_name");
			String album = response.getString("album");
			String image = response.getString("image");
			String duration = response.getString("duration");
			Integer year = response.getInt("year");
			Integer id = response.getInt("id");
			String video = response.getString("video");
			Song s = new Song();
			s.setId(id);
			s.setArtistName(artistName);
			s.setAlbum(album);
			s.setDuration(duration);
			s.setTitle(title);
			s.setImage(image);
			s.setYear(year);
			s.setVideo(video);
			this.songs.add(s);
		}

		return songs;
	}

	public Song getSong(Integer id) {
		for (Song song : this.songs) {
			if (song.getId().equals(id)) {
				return song;
			}
		}
		return null;
	}

	public boolean createSong(Song song) throws SQLException {
		PreparedStatement statement = this.conn.prepareStatement(Helper.CREATE_SONG);
		statement.setString(1, song.getArtistName());
		statement.setString(2, song.getAlbum());
		statement.setString(3, song.getTitle());
		statement.setInt(4, song.getYear());
		statement.setString(5, song.getImage());
		statement.setString(6, song.getDuration());
		statement.setString(7, song.getVideo());

		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			return true;
		}
		return false;
	}

	public boolean updateSong(Song song) throws SQLException {
		PreparedStatement statement = this.conn.prepareStatement(Helper.UPDATE_SONG);
		statement.setString(1, song.getArtistName());
		statement.setString(2, song.getAlbum());
		statement.setString(3, song.getTitle());
		statement.setInt(4, song.getYear());
		statement.setString(5, song.getImage());
		statement.setString(6, song.getDuration());
		statement.setString(7, song.getVideo());
		statement.setInt(8, song.getId());
		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) {
			return true;
		}
		return false;
	}

	public boolean removeSong(Integer id) throws SQLException {
		PreparedStatement statement = this.conn.prepareStatement(Helper.REMOVE_SONG);
		statement.setInt(1, id);
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
			return true;
		}
		return false;
	}

	public void cleanArrayList() {
		this.songs.clear();
	}

	private void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		this.conn = DriverManager.getConnection(Helper.URL, Helper.USER, Helper.PASS);
	}

}
