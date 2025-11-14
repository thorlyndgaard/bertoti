package thoor.bertoti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import thoor.bertoti.classes.Musica;
import thoor.bertoti.service.MusicaService;

import java.util.List;

@RestController
@RequestMapping("/musicas")
@CrossOrigin("*")
public class MusicaController {

    @Autowired
    private MusicaService service;

    @GetMapping
    public List<Musica> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public Musica buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public Musica criar(@RequestBody Musica musica) {
        return service.salvar(musica);
    }

    @PutMapping("/{id}")
    public Musica atualizar(@PathVariable Long id, @RequestBody Musica musica) {
        return service.atualizar(id, musica);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
