package com.bling.service.impl;

import com.bling.service.IFileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Service("iFileService")
public class FileServiceImpl implements IFileService {
    @Override
    public String saveImg(String dirname, MultipartFile file) throws Exception {
        try {
            File dir=new File(dirname);
            if(!dir.exists()){
                dir.mkdirs();
            }
            if(file.getSize()==0){
                file=(MultipartFile)new File(dirname+"/dafault.jpg");
            }
            String filename = file.getOriginalFilename();
            String fileExtensionName = filename.substring(filename.lastIndexOf(".") + 1);
            String uploadFileName = UUID.randomUUID().toString() + "." + fileExtensionName;
            File targetfile = new File(dirname, uploadFileName);
            file.transferTo(targetfile);
            return uploadFileName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
