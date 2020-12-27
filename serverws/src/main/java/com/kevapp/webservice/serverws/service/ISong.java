package com.kevapp.webservice.serverws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.kevapp.webservice.serverws.model.Song;

@WebService
public interface ISong {

	@WebMethod
	public List<Song> getAllSongs();

	@WebMethod
	public Song getSong(Integer id);

	@WebMethod
	public boolean createSong(Song song);

	@WebMethod
	public boolean updateSong(Song song);

	@WebMethod
	public boolean removeSong(Integer id);

}
