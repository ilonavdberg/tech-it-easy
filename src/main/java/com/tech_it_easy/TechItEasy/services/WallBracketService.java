package com.tech_it_easy.TechItEasy.services;

import com.tech_it_easy.TechItEasy.exception.exceptions.ProductNotFoundException;
import com.tech_it_easy.TechItEasy.models.WallBracket;
import com.tech_it_easy.TechItEasy.repositories.WallBracketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WallBracketService {
    private final WallBracketRepository wallBracketRepository;

    public WallBracketService(WallBracketRepository wallBracketRepository) {
        this.wallBracketRepository = wallBracketRepository;
    }

    public List<WallBracket> getAllWallBrackets() {
        return wallBracketRepository.findAll();
    }

    public WallBracket getWallBracket(Long id) {
        return wallBracketRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public void createWallBracket(WallBracket wallBracket) {
        wallBracketRepository.save(wallBracket);
    }

    public void updateWallBracket(Long id, WallBracket request) {
        WallBracket wallBracket = getWallBracket(id);

        wallBracket.setSize(request.getSize());
        wallBracket.setAdjustable(request.getAdjustable());
        wallBracket.setAdjustable(request.getAdjustable());
        wallBracket.setName(request.getName());
        wallBracket.setPrice(request.getPrice());
        wallBracket.setOriginalStock(request.getOriginalStock());

        wallBracketRepository.save(wallBracket);
    }

    public void deleteWallBracket(Long id) {
        WallBracket wallBracket = wallBracketRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
       wallBracketRepository.delete(wallBracket);
    }
}
