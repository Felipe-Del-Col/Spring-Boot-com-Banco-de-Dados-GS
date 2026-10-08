package fiap.com.br.job_matching_inclusivo.service;

import fiap.com.br.job_matching_inclusivo.model.Vaga;
import fiap.com.br.job_matching_inclusivo.repository.VagaRepository;
import org.springframework.stereotype.Service;

@Service
public class VagaService {

    private final VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public Vaga cadastrar(Vaga vaga) {
        return vagaRepository.save(vaga);
    }
}
