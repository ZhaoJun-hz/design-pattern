package com.zjstudy.designpattern.objectoriented.abstraction;

public interface IPictureStorage {
    void savePicture(Picture picture);
    Picture getPicture(String pictureId);
    void deletePicture(String pictureId);
    void modifyMetaInfo(String pictureId, PictureMetaInfo pictureMetaInfo);
}
