package com.felkinatden.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Service
public class UploadFileService {
    @Value("${file.upload-dir}")
    private String fileUpload;

    public void save(MultipartFile[] data){
        for (MultipartFile file : data){
            try {
                FileCopyUtils.copy(file.getBytes(), new File(fileUpload + "/" + this.fileName(file)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(String fileName, MultipartFile data){
        try {
            FileCopyUtils.copy(data.getBytes(), new File(fileUpload + "/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(String fileName){
        File file = new File(fileUpload +"/"+ fileName);
        file.delete();
    }

    public String fileName(MultipartFile file){
        return new Date().getTime() +"-"+ file.getOriginalFilename().replace(" ","_");
    }
}
