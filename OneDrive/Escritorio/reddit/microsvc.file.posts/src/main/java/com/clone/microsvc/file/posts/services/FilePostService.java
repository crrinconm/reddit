package com.clone.microsvc.file.posts.services;

import com.clone.microsvc.file.posts.dto.FilePostDTO;

import java.io.File;
import java.util.List;

public interface FilePostService {

    FilePostDTO create (FilePostDTO filePostDTO);
    List<FilePostDTO> findAll();
    FilePostDTO findById (Long id);
    FilePostDTO update (Long id, FilePostDTO filePostDTO);
    void delete (Long id);
}
