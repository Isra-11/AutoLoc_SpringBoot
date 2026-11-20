package tn.esprit.sprintboot.tp1spring.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    @Column(nullable = false, unique = true, length = 20)
    private String immatriculation;
    @Column(nullable = false, length = 50)
    private String marque;
    @Column(nullable = false, length = 50)
    private String modele;
    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal tarifJournalier;

    public String getMarque() {
        return marque;
    }

//    public Vehicule(Long idVehicule, List<Equipement> equipements, BigDecimal tarifJournalier, Agence agence, StatutVehicule statut, String modele, CategorieVehicule categorie, String marque, String immatriculation) {
//        this.idVehicule = idVehicule;
//        this.equipements = equipements;
//        this.tarifJournalier = tarifJournalier;
//        this.agence = agence;
//        this.statut = statut;
//        this.modele = modele;
//        this.categorie = categorie;
//        this.marque = marque;
//        this.immatriculation = immatriculation;
//    }

    public Vehicule(){

    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Long getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(Long idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public CategorieVehicule getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieVehicule categorie) {
        this.categorie = categorie;
    }

    public BigDecimal getTarifJournalier() {
        return tarifJournalier;
    }

    public void setTarifJournalier(BigDecimal tarifJournalier) {
        this.tarifJournalier = tarifJournalier;
    }

    public List<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(List<Equipement> equipements) {
        this.equipements = equipements;
    }

    public StatutVehicule getStatut() {
        return statut;
    }

    public void setStatut(StatutVehicule statut) {
        this.statut = statut;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;
    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;
    @ManyToMany
    private List<Equipement> equipements = new ArrayList<>();

}