package com.felkinatden.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class UploadFile {
    @Value("${file.upload-dir}")
    private String fileUpload;

    public void save(MultipartFile[] data){
        int i = 0;
        for (MultipartFile file : data){
//            String fileName = file.getOriginalFilename();
            long fileName = System.currentTimeMillis();
            try {
                FileCopyUtils.copy(file.getBytes(), new File(fileUpload + "/" + fileName + i++));
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
}
