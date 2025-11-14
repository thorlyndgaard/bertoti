package thoor.bertoti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thoor.bertoti.classes.Musica;
import thoor.bertoti.repository.MusicaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository repository;

    public List<Musica> listarTodas() {
        return repository.findAll();
    }

    public Optional<Musica> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Musica salvar(Musica musica) {
        return repository.save(musica);
    }

    public Musica atualizar(Long id, Musica musicaAtualizada) {
        return repository.findById(id).map(m -> {
            m.setTitulo(musicaAtualizada.getTitulo());
            m.setArtista(musicaAtualizada.getArtista());
            m.setGenero(musicaAtualizada.getGenero());
            return repository.save(m);
        }).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
