package cz.digana.entropytest.service;

import cz.digana.entropytest.model.Cat;
import cz.digana.entropytest.repository.CatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CatService {

    private CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getCats() {
        return StreamSupport.stream(catRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
