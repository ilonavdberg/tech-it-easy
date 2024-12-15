package com.tech_it_easy.TechItEasy.controllers;

import com.tech_it_easy.TechItEasy.dtos.RemoteRequestDto;
import com.tech_it_easy.TechItEasy.dtos.RemoteResponseDto;
import com.tech_it_easy.TechItEasy.mappers.RemoteMapper;
import com.tech_it_easy.TechItEasy.models.Remote;
import com.tech_it_easy.TechItEasy.services.RemoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/remote_controllers")
public class RemoteController {
    private final RemoteService remoteService;

    public RemoteController(RemoteService remoteService) {
        this.remoteService = remoteService;
    }

    @GetMapping("")
    public ResponseEntity<List<RemoteResponseDto>> getAllRemoteControllers() {
        List<Remote> remoteControllers = remoteService.getAllRemoteControllers();
        List<RemoteResponseDto> response = RemoteMapper.toRemoteDtoList(remoteControllers);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RemoteResponseDto> getRemoteController(@PathVariable Long id) {
        Remote remote = remoteService.getRemote(id);
        RemoteResponseDto response = RemoteMapper.toRemoteDto(remote);
        return ResponseEntity.ok(response);
    }

    @PostMapping("")
    public ResponseEntity<RemoteResponseDto> createRemoteController(@RequestBody RemoteRequestDto request) {
        Remote remote = RemoteMapper.toRemote(request);
        remoteService.saveRemoteController(remote);
        RemoteResponseDto response = RemoteMapper.toRemoteDto(remote);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RemoteResponseDto> updateRemoteController(@PathVariable Long id, @RequestBody RemoteRequestDto request) {
        Remote remote = RemoteMapper.toRemote(request);
        remoteService.updateRemoteController(id, remote);
        RemoteResponseDto response = RemoteMapper.toRemoteDto(remote);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRemoteController(@PathVariable Long id) {
        remoteService.deleteRemoteController(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
