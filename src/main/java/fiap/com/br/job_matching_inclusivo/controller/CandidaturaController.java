package fiap.com.br.job_matching_inclusivo.controller;

import fiap.com.br.job_matching_inclusivo.model.Candidatura;
import fiap.com.br.job_matching_inclusivo.service.CandidaturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidatura")
public class CandidaturaController {

    private final CandidaturaService candidaturaService;

    public CandidaturaController(CandidaturaService candidaturaService) {
        this.candidaturaService = candidaturaService;
    }

    @PostMapping
    public ResponseEntity<Candidatura> cadastrar(@RequestBody Candidatura candidatura) {
        Candidatura novaCandidatura = candidaturaService.cadastrar(candidatura);

        return ResponseEntity.ok(novaCandidatura);
    }
}
