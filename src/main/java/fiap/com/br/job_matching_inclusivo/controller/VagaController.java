package fiap.com.br.job_matching_inclusivo.controller;

import fiap.com.br.job_matching_inclusivo.model.Vaga;
import fiap.com.br.job_matching_inclusivo.service.VagaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaga")
public class VagaController {

    private final VagaService vagaService;

    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @PostMapping
    public ResponseEntity<Vaga> cadastrar(@RequestBody Vaga vaga) {
        Vaga novaVaga = vagaService.cadastrar(vaga);

        return ResponseEntity.ok(novaVaga);
    }

    @GetMapping("/{vagaId}/candidato")
    public ResponseEntity<List<String>> buscarCandidatos(@PathVariable Long vagaId) {
        return ResponseEntity.ok(vagaService.buscarCandidatos(vagaId));
    }
}
