package fiap.com.br.job_matching_inclusivo.repository;

import fiap.com.br.job_matching_inclusivo.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}