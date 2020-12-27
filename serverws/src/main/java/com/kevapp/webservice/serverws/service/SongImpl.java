package com.kevapp.webservice.serverws.service;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import com.kevapp.webservice.serverws.conn.Database;
import com.kevapp.webservice.serverws.model.Song;

@WebService(endpointInterface = "com.kevapp.webservice.serverws.service.ISong")
public class SongImpl implements ISong {

	private Database db;

	public SongImpl() {
		this.db = new Database();
	}

	@Override
	public List<Song> getAllSongs() {

		try {
			return this.db.getSongs();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Song getSong(Integer id) {

		return this.db.getSong(id);
	}

	@Override
	public boolean createSong(Song song) {

		try {
			return this.db.createSong(song);
		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateSong(Song song) {

		try {
			return this.db.updateSong(song);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean removeSong(Integer id) {
		try {
			return this.db.removeSong(id);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
