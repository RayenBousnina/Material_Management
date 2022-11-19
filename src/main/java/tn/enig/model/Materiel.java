package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Materiel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String titre;
private String type;
private int numSerie;
private int qte;
private String etat;
@ManyToOne
@JoinColumn(name="Dep_id")
private Departement dep;
public Materiel(int id, String titre, String type, int numSerie, int qte, String etat, Departement dep) {
	super();
	this.id = id;
	this.titre = titre;
	this.type = type;
	this.numSerie = numSerie;
	this.qte = qte;
	this.etat = etat;
	this.dep = dep;
}
public Materiel() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}


public String getEtat() {
	return etat;
}
public void setTitre(String titre) {
	this.titre = titre;
}




public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getNumSerie() {
	return numSerie;
}
public void setNumSerie(int numSerie) {
	this.numSerie = numSerie;
}
public int getQte() {
	return qte;
}
public void setQte(int qte) {
	this.qte = qte;
}
public String isEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}
public Departement getDep() {
	return dep;
}
public void setDep(Departement dep) {
	this.dep = dep;
}
@Override
public String toString() {
	return "Materiel [id=" + id + ", titre=" + titre + ", type=" + type + ", numSerie=" + numSerie + ", qte=" + qte
			+ ", etat=" + etat + ", dep=" + dep + "]";
}

}
