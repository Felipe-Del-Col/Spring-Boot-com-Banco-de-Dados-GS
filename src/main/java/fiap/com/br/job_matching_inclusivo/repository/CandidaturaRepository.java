package fiap.com.br.job_matching_inclusivo.repository;

import fiap.com.br.job_matching_inclusivo.model.Candidatura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidaturaRepository extends JpaRepository<Candidatura, Long> {

    List<Candidatura> findByCandidatoId(Long candidatoId);

    List<Candidatura> findByVagaId(Long vagaId);
}
