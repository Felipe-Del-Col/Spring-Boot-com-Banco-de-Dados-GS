package fiap.com.br.job_matching_inclusivo.repository;

import fiap.com.br.job_matching_inclusivo.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vaga, Long> {
}
