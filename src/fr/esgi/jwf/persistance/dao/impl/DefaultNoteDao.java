package fr.esgi.jwf.persistance.dao.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import fr.esgi.jwf.persistance.dao.NoteDao;
import fr.esgi.jwf.persistance.dao.core.impl.DefaultDao;
import fr.esgi.jwf.persistance.entite.Note;
import fr.esgi.jwf.persistance.entite.Utilisateur;

public class DefaultNoteDao extends DefaultDao implements NoteDao<Note, Long> {

	public DefaultNoteDao() {
	}

	@Override
	@SuppressWarnings("unchecked")
	public List recupererNotes(Utilisateur utilisateur) {
		return getCurrentSession().createCriteria(Note.class)
				.add(Restrictions.eq("utilisateur", utilisateur)).list();
	}

	/*
	 * GESTION DE LA SESSION
	 */

}
