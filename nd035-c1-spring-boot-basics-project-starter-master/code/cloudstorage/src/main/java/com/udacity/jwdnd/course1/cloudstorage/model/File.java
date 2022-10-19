package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.Data;

@Data
public class File {
    private int fileId;
    private String filename;
    private String contenttype;
    private String filesize;
    private int userid;
    private byte[] filedata;
}
