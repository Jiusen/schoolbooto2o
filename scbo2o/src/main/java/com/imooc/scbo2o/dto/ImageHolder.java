package com.imooc.scbo2o.dto;

import java.io.InputStream;

/**
 * @Author Jiusen Guo
 * @Date 2020/12/7 17:51
 * @Description
 */
public class ImageHolder {

    private String imageName;
    private InputStream image;

    public ImageHolder(String imageName, InputStream image) {
        this.imageName = imageName;
        this.image = image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }
}
