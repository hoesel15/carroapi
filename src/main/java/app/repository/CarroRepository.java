package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{
	
}
