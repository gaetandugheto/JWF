package fr.esgi.jwf.persistance.entite;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "NOM")
	private String nom;

	@OneToMany(mappedBy = "utilisateur")
	private List<Note> notes;

	public Utilisateur() {

	}

}
