package fiap.com.br.job_matching_inclusivo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "java_candidatura")
public class Candidatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candidato_id", nullable = false)
    private Candidato candidato;

    @ManyToOne
    @JoinColumn(name = "vaga_id", nullable = false)
    private Vaga vaga;

    public Candidatura() {
    }

    public Candidatura(Candidato candidato, Vaga vaga) {
        this.candidato = candidato;
        this.vaga = vaga;
    }

    public Long getId() {
        return id;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }
}