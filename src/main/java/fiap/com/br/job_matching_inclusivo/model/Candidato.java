package fiap.com.br.job_matching_inclusivo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "java_candidato")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 50)
    private String habilidade;

    public Candidato() {
    }

    public Candidato(String nome, String habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}