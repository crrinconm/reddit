package com.clone.microsvc.comments.services;

import com.clone.microsvc.comments.dto.CommentDTO;
import com.clone.microsvc.comments.models.Comment;

import java.util.List;

public interface CommentService {

    CommentDTO create (CommentDTO commentDTO);
    List<CommentDTO> findAll();
    CommentDTO findById (Long id);
    CommentDTO update (Long id, CommentDTO commentDTO);
    void delete (Long id);

}
