package fiap.com.br.job_matching_inclusivo.service;

import fiap.com.br.job_matching_inclusivo.model.Candidato;
import fiap.com.br.job_matching_inclusivo.model.Candidatura;
import fiap.com.br.job_matching_inclusivo.repository.CandidatoRepository;
import fiap.com.br.job_matching_inclusivo.repository.CandidaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService {

    private final CandidatoRepository candidatoRepository;
    private final CandidaturaRepository candidaturaRepository;

    public CandidatoService(CandidatoRepository candidatoRepository,
                            CandidaturaRepository candidaturaRepository) {
        this.candidatoRepository = candidatoRepository;
        this.candidaturaRepository = candidaturaRepository;
    }

    public Candidato cadastrar(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    public List<String> buscarTitulos(Long candidatoId) {
        return candidaturaRepository.findByCandidatoId(candidatoId)
                .stream()
                .map(c -> c.getVaga().getTitulo())
                .toList();
    }
}
