package com.tech_it_easy.TechItEasy.services;

import com.tech_it_easy.TechItEasy.exception.exceptions.ProductNotFoundException;
import com.tech_it_easy.TechItEasy.models.CIModule;
import com.tech_it_easy.TechItEasy.models.Television;
import com.tech_it_easy.TechItEasy.repositories.CIModuleRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CIModuleService {
    private final CIModuleRepository ciModuleRepository;
    private final TelevisionService televisionService;

    public CIModuleService(CIModuleRepository ciModuleRepository, TelevisionService televisionService) {
        this.ciModuleRepository = ciModuleRepository;
        this.televisionService = televisionService;
    }

    public List<CIModule> getAllCIModules() {
        return ciModuleRepository.findAll();
    }

    public CIModule getCIModule(Long id) {
        return ciModuleRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public void saveCIModule(CIModule ciModule) {
        ciModuleRepository.save(ciModule);
    }

    public void updateCIModule(Long id, CIModule updatedCIModule) {
        CIModule ciModule = getCIModule(id);

        ciModule.setName(updatedCIModule.getName());
        ciModule.setBrand(updatedCIModule.getBrand());
        ciModule.setPrice(updatedCIModule.getPrice());
        ciModule.setOriginalStock(updatedCIModule.getOriginalStock());

        saveCIModule(ciModule);
    }

    @Transactional
    public void addTelevisionToCIModule(Long ciModuleId, Long televisionId) {
        CIModule ciModule = getCIModule(ciModuleId);
        Television television = televisionService.getTelevision(televisionId);

        ciModule.addTelevision(television);
        television.setCIModule(ciModule);

        ciModuleRepository.save(ciModule);
    }

    public void deleteCIModule(Long id) {
        CIModule ciModule = ciModuleRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        ciModuleRepository.delete(ciModule);
    }
}
