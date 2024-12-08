package com.tech_it_easy.TechItEasy.services;

import com.tech_it_easy.TechItEasy.exception.exceptions.ProductNotFoundException;
import com.tech_it_easy.TechItEasy.models.Television;
import com.tech_it_easy.TechItEasy.repositories.TelevisionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelevisionService {
    private final TelevisionRepository televisionRepository;

    public TelevisionService(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    public List<Television> getAllTelevisions() {
        return televisionRepository.findAll();
    }

    public Television getTelevision(Long id) {
        return televisionRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public void saveTelevision(Television television) {
        televisionRepository.save(television);
    }

    public void updateTelevision(Long id, Television updatedTelevision) {
        Television television = getTelevision(id);

        television.setType(updatedTelevision.getType());
        television.setBrand(updatedTelevision.getBrand());
        television.setName(updatedTelevision.getName());
        television.setPrice(updatedTelevision.getPrice());
        television.setAvailableSize(updatedTelevision.getAvailableSize());
        television.setRefreshRate(updatedTelevision.getRefreshRate());
        television.setScreenType(updatedTelevision.getScreenType());
        television.setScreenQuality(updatedTelevision.getScreenQuality());
        television.setIsSmartTv(updatedTelevision.getIsSmartTv());
        television.setHasWifi(updatedTelevision.getHasWifi());
        television.setHasVoiceControl(updatedTelevision.getHasVoiceControl());
        television.setHasHdr(updatedTelevision.getHasHdr());
        television.setHasBluetooth(updatedTelevision.getHasBluetooth());
        television.setHasAmbiLight(updatedTelevision.getHasAmbiLight());
        television.setOriginalStock(updatedTelevision.getOriginalStock());
        television.setSold(updatedTelevision.getSold());

        saveTelevision(television);
    }

    public void deleteTelevision(Long id) {
        //throws error if no television with given id can be found
        Television television = getTelevision(id);
        televisionRepository.delete(television);
    }
}
