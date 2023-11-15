package com.app.model;

import java.math.BigDecimal;

public class Drawing {
    private long id;
    private String summary;
    private String name;
    private Size sizeId;
    private Frame frameId;
    private Mount mountId;
    private Media mediaId;
    private Glass glassId;
    private Paper paperId;
    private BigDecimal price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSizeId() {
        return sizeId;
    }

    public void setSizeId(Size sizeId) {
        this.sizeId = sizeId;
    }

    public Frame getFrameId() {
        return frameId;
    }

    public void setFrameId(Frame frameId) {
        this.frameId = frameId;
    }

    public Mount getMountId() {
        return mountId;
    }

    public void setMountId(Mount mountId) {
        this.mountId = mountId;
    }

    public Media getMediaId() {
        return mediaId;
    }

    public void setMediaId(Media mediaId) {
        this.mediaId = mediaId;
    }

    public Glass getGlassId() {
        return glassId;
    }

    public void setGlassId(Glass glassId) {
        this.glassId = glassId;
    }

    public Paper getPaperId() {
        return paperId;
    }

    public void setPaperId(Paper paperId) {
        this.paperId = paperId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
