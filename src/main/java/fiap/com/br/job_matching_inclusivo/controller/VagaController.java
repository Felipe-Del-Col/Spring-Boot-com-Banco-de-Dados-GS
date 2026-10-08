package fiap.com.br.job_matching_inclusivo.controller;

import fiap.com.br.job_matching_inclusivo.model.Vaga;
import fiap.com.br.job_matching_inclusivo.service.VagaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
