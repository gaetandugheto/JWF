package fr.esgi.jwf.persistance.dao;

import java.io.Serializable;
import java.util.List;

import fr.esgi.jwf.persistance.dao.core.Dao;
import fr.esgi.jwf.persistance.entite.Note;
import fr.esgi.jwf.persistance.entite.Utilisateur;

public interface NoteDao<T, Id extends Serializable> extends Dao {

	/**
	 * 
	 * @param utilisateur
	 * @return
	 */
	List<Note> recupererNotes(Utilisateur utilisateur);

}
