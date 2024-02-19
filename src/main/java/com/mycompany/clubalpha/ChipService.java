package com.mycompany.clubalpha;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChipService {
    private final AutomovilRepository automobileRepository;

    public ChipService(AutomovilRepository automobileRepository) {
        this.automobileRepository = automobileRepository;
    }

    public List<Automovil> getAllActiveChips() {
        return automobileRepository.findByActivoTrue();
    }
}
