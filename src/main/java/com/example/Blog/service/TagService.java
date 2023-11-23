package com.example.Blog.service;

import com.example.Blog.model.Tag;

import java.util.List;

public interface TagService {
    public Tag createTag(Tag tag);

    public List<Tag> findAll();

    public Tag findByName(String name);

}