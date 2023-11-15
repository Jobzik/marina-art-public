package com.app.model;

public class Paper {
    private long id;
    private Size paperSizeId;
    private String paperColor;
    private String paperType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Size getPaperSizeId() {
        return paperSizeId;
    }

    public void setPaperSizeId(Size paperSizeId) {
        this.paperSizeId = paperSizeId;
    }

    public String getPaperColor() {
        return paperColor;
    }

    public void setPaperColor(String paperColor) {
        this.paperColor = paperColor;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }
}
