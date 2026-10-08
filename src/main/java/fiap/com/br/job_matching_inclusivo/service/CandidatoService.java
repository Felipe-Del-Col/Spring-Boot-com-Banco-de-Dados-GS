package fiap.com.br.job_matching_inclusivo.service;

import fiap.com.br.job_matching_inclusivo.model.Candidato;
import fiap.com.br.job_matching_inclusivo.repository.CandidatoRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {

    private final CandidatoRepository candidatoRepository;

    public CandidatoService(CandidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }

    public Candidato cadastrar(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }
}
