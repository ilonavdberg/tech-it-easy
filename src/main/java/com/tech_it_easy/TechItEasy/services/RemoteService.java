package com.tech_it_easy.TechItEasy.services;

import com.tech_it_easy.TechItEasy.exception.exceptions.ProductNotFoundException;
import com.tech_it_easy.TechItEasy.models.Remote;
import com.tech_it_easy.TechItEasy.repositories.RemoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemoteService {
    private final RemoteRepository remoteRepository;

    public RemoteService(RemoteRepository remoteRepository) {
        this.remoteRepository = remoteRepository;
    }

    public List<Remote> getAllRemoteControllers() {
        return remoteRepository.findAll();
    }

    public Remote getRemote(Long id) {
        return remoteRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public void saveRemoteController(Remote remote) {
        remoteRepository.save(remote);
    }

    public void updateRemoteController(Long id, Remote updatedRemote) {
        Remote remote = remoteRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));

        remote.setCompatibleWith(updatedRemote.getCompatibleWith());
        remote.setBatteryType(updatedRemote.getBatteryType());
        remote.setName(updatedRemote.getName());
        remote.setBrand(updatedRemote.getBrand());
        remote.setPrice(updatedRemote.getPrice());
        remote.setOriginalStock(updatedRemote.getOriginalStock());

        remoteRepository.save(remote);
    }

    public void deleteRemoteController(Long id) {
        Remote remote = remoteRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        remoteRepository.delete(remote);
    }
}
