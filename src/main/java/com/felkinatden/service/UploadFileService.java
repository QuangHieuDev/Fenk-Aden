package com.felkinatden.service;

import com.felkinatden.repository.IMultimedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UploadFileService {
    @Value("${file.upload-dir}")
    private String fileUpload;

    public List save(MultipartFile[] data) {
        List listName = new ArrayList();
        for (MultipartFile i : data) {
            try {
                File file = new File(fileUpload + "/" + this.fileName(i));
                FileCopyUtils.copy(i.getBytes(), file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            listName.add(this.fileName(i));
        }
        return listName;
    }

    public void update(String name, MultipartFile data) {
        try {
            File file = new File(fileUpload + "/" + name);
            FileCopyUtils.copy(data.getBytes(), file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete(String fileName) {
        File file = new File(fileUpload + "/" + fileName);
        file.delete();
    }

    public String fileName(MultipartFile file) {
        return new Date().getTime() + "-" + file.getOriginalFilename().replace(" ", "_");
    }
}
