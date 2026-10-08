package fiap.com.br.job_matching_inclusivo.controller;

import fiap.com.br.job_matching_inclusivo.model.Candidato;
import fiap.com.br.job_matching_inclusivo.service.CandidatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {

    private final CandidatoService candidatoService;

    public CandidatoController(CandidatoService candidatoService) {
        this.candidatoService = candidatoService;
    }

    @PostMapping
    public ResponseEntity<Candidato> cadastrar(@RequestBody Candidato candidato) {
        Candidato novoCandidato = candidatoService.cadastrar(candidato);

        return ResponseEntity.ok(novoCandidato);
    }
}
