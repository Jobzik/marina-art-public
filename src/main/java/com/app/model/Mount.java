package com.app.model;

public class Mount {
    private long id;
    private String mountColour;
    private Size mountSizeId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMountColour() {
        return mountColour;
    }

    public void setMountColour(String mountColour) {
        this.mountColour = mountColour;
    }

    public Size getMountSizeId() {
        return mountSizeId;
    }

    public void setMountSizeId(Size mountSizeId) {
        this.mountSizeId = mountSizeId;
    }
}
