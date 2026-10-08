package fiap.com.br.job_matching_inclusivo.service;

import fiap.com.br.job_matching_inclusivo.model.Candidatura;
import fiap.com.br.job_matching_inclusivo.repository.CandidaturaRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidaturaService {

    private final CandidaturaRepository candidaturaRepository;

    public CandidaturaService(CandidaturaRepository candidaturaRepository) {
        this.candidaturaRepository = candidaturaRepository;
    }

    public Candidatura cadastrar(Candidatura candidatura) {
        return candidaturaRepository.save(candidatura);
    }
}
