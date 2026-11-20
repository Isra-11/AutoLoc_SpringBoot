package tn.esprit.sprintboot.tp1spring.domain;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity

public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;

    @Column(nullable = false)
    private LocalDate dateDebut;

    private LocalDate dateFin;

    public Maintenance(Long idMaintenance, Vehicule vehicule, LocalDate dateFin, LocalDate dateDebut, String description) {
        this.idMaintenance = idMaintenance;
        this.vehicule = vehicule;
        this.dateFin = dateFin;
        this.dateDebut = dateDebut;
        this.description = description;
    }

    public Maintenance(){

    }
    public Long getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(Long idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    @Column(length = 255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;
}