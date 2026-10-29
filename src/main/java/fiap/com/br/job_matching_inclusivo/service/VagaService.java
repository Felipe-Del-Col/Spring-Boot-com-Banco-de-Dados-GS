package fiap.com.br.job_matching_inclusivo.service;

import fiap.com.br.job_matching_inclusivo.model.Vaga;
import fiap.com.br.job_matching_inclusivo.repository.CandidaturaRepository;
import fiap.com.br.job_matching_inclusivo.repository.VagaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaService {

    private final VagaRepository vagaRepository;
    private final CandidaturaRepository candidaturaRepository;

    public VagaService(VagaRepository vagaRepository,
                       CandidaturaRepository candidaturaRepository) {
        this.vagaRepository = vagaRepository;
        this.candidaturaRepository = candidaturaRepository;
    }

    public Vaga cadastrar(Vaga vaga) {
        return vagaRepository.save(vaga);
    }

    public List<String> buscarCandidatos(Long vagaId) {
        return candidaturaRepository.findByVagaId(vagaId)
                .stream()
                .map(c -> c.getCandidato().getNome())
                .toList();
    }
}
