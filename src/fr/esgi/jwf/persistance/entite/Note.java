package fr.esgi.jwf.persistance.entite;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "NOTE")
public class Note {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "TITRE")
	private String titre;

	@Column(name = "NOTE")
	private String note;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_UTILISATEUR")
	private Utilisateur utilisateur;

	public Note() {

	}
}
