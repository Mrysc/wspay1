package com.rltx.wspay.other.controller;



import com.rltx.wspay.account.dao.MerchRegisterDao;
import com.rltx.wspay.account.entity.MerchRegisterEntity;
import com.rltx.wspay.commom.*;
import com.rltx.wspay.constant.Constant;
import com.rltx.wspay.constant.PhotoType;
import com.rltx.wspay.other.entity.UploadPhotoEntity;
import com.rltx.wspay.other.service.IUploadService;
import com.rltx.wspay.utils.constant.ParamUtil;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.net.URLEncoder;
import java.security.PrivateKey;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

@RestController
@RequestMapping("upload")
public class UploadPhoto {

    @Autowired
    private IUploadService uploadService;

    @PostMapping("photo")
    public TreeMap<String,Object> accountOpen(String photoType,String path,String userCode,String type) throws Exception {
        UploadPhotoEntity uploadPhoto = new UploadPhotoEntity(photoType,UUID.randomUUID().toString(),path);
        return uploadService.call(uploadPhoto,userCode,type);
    }

}
