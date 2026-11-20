package tn.esprit.sprintboot.tp1spring.domain;


import jakarta.persistence.*;

@Entity

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    @Column(nullable = false, length = 50)
    private String nom;

    public Employe(Long idEmploye, String nom, String prenom, RoleEmploye role, Agence agence) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
        this.agence = agence;
    }

    public Employe(){

    }
    public Long getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Long idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public RoleEmploye getRole() {
        return role;
    }

    public void setRole(RoleEmploye role) {
        this.role = role;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    @Column(nullable = false, length = 50)
    private String prenom;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleEmploye role;

    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;
}