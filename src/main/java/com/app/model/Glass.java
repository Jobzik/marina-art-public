package com.app.model;

public class Glass {
    private long id;
    private String glassType;
    private Size glassSizeId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    public Size getGlassSizeId() {
        return glassSizeId;
    }

    public void setGlassSizeId(Size glassSizeId) {
        this.glassSizeId = glassSizeId;
    }
}
