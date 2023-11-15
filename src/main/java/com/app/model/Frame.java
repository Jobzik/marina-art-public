package com.app.model;

public class Frame {
    private long id;
    private String frameColour;
    private String frameType;
    private Size frameSizeId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrameColour() {
        return frameColour;
    }

    public void setFrameColour(String frameColour) {
        this.frameColour = frameColour;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public Size getFrameSizeId() {
        return frameSizeId;
    }

    public void setFrameSizeId(Size frameSizeId) {
        this.frameSizeId = frameSizeId;
    }
}
