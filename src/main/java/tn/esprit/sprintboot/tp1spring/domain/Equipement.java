package tn.esprit.sprintboot.tp1spring.domain;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    public Long getIdEquipement() {
        return idEquipement;
    }

    public Equipement(Long idEquipement, String libelle, List<Vehicule> vehicules) {
        this.idEquipement = idEquipement;
        this.libelle = libelle;
        this.vehicules = vehicules;
    }

    public Equipement(){

    }
    public void setIdEquipement(Long idEquipement) {
        this.idEquipement = idEquipement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    @Column(nullable = false, length = 100)
    private String libelle;

    @ManyToMany(mappedBy = "equipements")
    private List<Vehicule> vehicules = new ArrayList<>();
}