package com.balldance.baller.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class VideoController {
    @RequestMapping("/video")
    public ResponseEntity<String> playVideo(@RequestParam String videoPath) {

        FileSystemResource resource= new FileSystemResource("D:\\proj\\AlphaPose\\30s_yc.mp4");
        if (resource == null) {
            System.out.println("resource is null when play video.");
            return null;
        }
        ResponseEntity res = ResponseEntity.status(HttpStatus.PARTIAL_CONTENT).contentType(MediaType.valueOf("video/mp4"))
            .body(resource);
        return res;
    }
}
