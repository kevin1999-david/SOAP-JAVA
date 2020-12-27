package com.kevapp.webservice.songsapp.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kevapp.webservice.serverws.service.ISong;
import com.kevapp.webservice.serverws.service.Song;
import com.kevapp.webservice.serverws.service.SongImplService;


@Controller
@SessionAttributes("song")
public class SongController {

	private ISong service;

	public SongController() {
		SongImplService si = new SongImplService();
		service = si.getSongImplPort();
	}

	@RequestMapping(value = "songs")
	public String view(Map<String, Object> model) {
		List<Song> songs = service.getAllSongs();
		model.put("songs", songs);
		model.put("title", "Songs");
		return "list";
	}

	@RequestMapping(value = "/form")
	public String form(Map<String, Object> model) {
		model.put("title", "Customer Form");
		Song song = new Song();
		model.put("song", song);
		model.put("title", "New Song");
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String save(Song song, SessionStatus status, RedirectAttributes flash) {
		if (song.getId() == null) {
			boolean response = this.service.createSong(song);
			if (response) {
				flash.addFlashAttribute("success", "The song was successfully registered");
			} else {
				flash.addFlashAttribute("error", "An error occurred while creating");
			}

		} else {
			boolean response = this.service.updateSong(song);
			if (response) {
				flash.addFlashAttribute("info", "The song was successfully updated");
			} else {
				flash.addFlashAttribute("error", "An error occurred while updating");
			}

		}
		status.setComplete();
		return "redirect:/songs";
	}

	@RequestMapping(value = "/form/{id}")
	public String update(@PathVariable(value = "id") Integer id, Map<String, Object> model, RedirectAttributes flash) {
		Song song = this.service.getSong(id);
		if (song == null) {
			flash.addFlashAttribute("error", "The song isn't registered");
			return "redirect:/songs";
		}
		model.put("song", song);
		model.put("title", "Update song");
		return "form";
	}

	@RequestMapping(value = "/delete/{id}")
	public String delete(@PathVariable(value = "id") Integer id, RedirectAttributes flash) {

		if (!this.service.removeSong(id)) {
			flash.addFlashAttribute("error", "An error occurred while deleting");
		} else {
			flash.addFlashAttribute("warning", "Song removed successfully!");
		}

		return "redirect:/songs";
	}

}
