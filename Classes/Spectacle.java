package Classes;

import java.util.*;

//Classe Spectacle
public class Spectacle {
	 private String nom;
	 private int duree;
	 private int nombreActes;
	 private int nombreSpectateurs;
	 private String genre;
	 
	 private ArrayList<Artiste> artistes;
	 private ArrayList<Representation> representations;
	 private ArrayList<Genre> genres;
	 
	 public Spectacle(String nom, int duree, int nombreActes, int nombreSpectateurs, String genre, ArrayList<Artiste> artistes, ArrayList<Representation> representations, ArrayList<Genre> genres) {
		 this.nom = nom;
		 this.duree = duree;
		 this.nombreActes = nombreActes;
		 this.nombreSpectateurs = nombreSpectateurs;
		 this.genre = genre;
		 
		 this.artistes = artistes;
		 this.representations = representations;
		 this.genres = genres;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getNombreActes() {
		return nombreActes;
	}

	public void setNombreActes(int nombreActes) {
		this.nombreActes = nombreActes;
	}

	public int getNombreSpectateurs() {
		return nombreSpectateurs;
	}

	public void setNombreSpectateurs(int nombreSpectateurs) {
		this.nombreSpectateurs = nombreSpectateurs;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public ArrayList<Artiste> getArtistes() {
		return artistes;
	}

	public void setArtistes(ArrayList<Artiste> artistes) {
		this.artistes = artistes;
	}

	public ArrayList<Representation> getRepresentations() {
		return representations;
	}

	public void setRepresentations(ArrayList<Representation> representations) {
		this.representations = representations;
	}

	public ArrayList<Genre> getGenres() {
		return genres;
	}

	public void setGenres(ArrayList<Genre> genres) {
		this.genres = genres;
	}
}
