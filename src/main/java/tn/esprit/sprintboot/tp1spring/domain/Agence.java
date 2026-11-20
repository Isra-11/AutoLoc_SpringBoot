package tn.esprit.sprintboot.tp1spring.domain;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false, length = 50)
    private String ville;

    @Column(nullable = false, length = 150)
    private String adresse;

    public Long getIdAgence() {
        return idAgence;
    }

    public void setIdAgence(Long idAgence) {
        this.idAgence = idAgence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public Agence(Long idAgence, String nom, String ville, String adresse, String telephone, List<Employe> employes, List<Vehicule> vehicules) {
        this.idAgence = idAgence;
        this.nom = nom;
        this.ville = ville;
        this.adresse = adresse;
        this.telephone = telephone;
        this.employes = employes;
        this.vehicules = vehicules;
    }

    public Agence() {
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    @Column(length = 20)
    private String telephone;

    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    private List<Employe> employes = new ArrayList<>();

    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    private List<Vehicule> vehicules = new ArrayList<>();


}