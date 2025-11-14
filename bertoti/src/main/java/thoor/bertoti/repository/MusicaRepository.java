package thoor.bertoti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thoor.bertoti.classes.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}
