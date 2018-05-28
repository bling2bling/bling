package com.bling.service;

import com.bling.pojo.Item;
import org.springframework.web.multipart.MultipartFile;

public interface IFileService {
    String saveImg(String dirname, MultipartFile file) throws Exception;
}
