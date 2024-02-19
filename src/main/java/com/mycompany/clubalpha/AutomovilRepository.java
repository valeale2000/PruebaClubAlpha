package com.mycompany.clubalpha;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface AutomovilRepository extends CrudRepository<Automovil, Long> {
    List<Automovil> findByActivoTrue();

}
