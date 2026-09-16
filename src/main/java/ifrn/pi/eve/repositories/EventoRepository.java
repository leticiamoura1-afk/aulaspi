package ifrn.pi.eve.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.eve.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
	
	

}
