package fiap.com.br.job_matching_inclusivo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "JAVA_VAGA")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String titulo;

    @Column(nullable = false, length = 50)
    private String habilidade;

    public Vaga() {
    }

    public Vaga(String titulo, String habilidade) {
        this.titulo = titulo;
        this.habilidade = habilidade;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}