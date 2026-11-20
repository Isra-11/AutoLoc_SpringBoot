package tn.esprit.sprintboot.tp1spring.domain;


import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;

    public Paiement(Long idPaiement, LocalDate datePaiement, BigDecimal montant, ModePaiement modePaiement, Contrat contrat) {
        this.idPaiement = idPaiement;
        this.datePaiement = datePaiement;
        this.montant = montant;
        this.modePaiement = modePaiement;
        this.contrat = contrat;
    }

    public Paiement(){

    }
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal montant;

    public Long getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(Long idPaiement) {
        this.idPaiement = idPaiement;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public ModePaiement getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(ModePaiement modePaiement) {
        this.modePaiement = modePaiement;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    @Column(nullable = false)
    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ModePaiement modePaiement;

    @ManyToOne
    @JoinColumn(name = "contrat_id")
    private Contrat contrat;
}