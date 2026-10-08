package fiap.com.br.job_matching_inclusivo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "java_vaga")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(nullable = false, length = 50)
    private String empresa;

    public Vaga() {
    }

    public Vaga(String titulo, String empresa) {
        this.titulo = titulo;
        this.empresa = empresa;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}