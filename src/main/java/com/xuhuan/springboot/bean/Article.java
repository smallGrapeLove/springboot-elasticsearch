package com.xuhuan.springboot.bean;

import io.searchbox.annotations.JestId;

/**
 * @author huan.xu
 * @Time 2019-05-08 21:44
 */
public class Article {

    @JestId
    private Integer id;
    private String title;
    private String author;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
