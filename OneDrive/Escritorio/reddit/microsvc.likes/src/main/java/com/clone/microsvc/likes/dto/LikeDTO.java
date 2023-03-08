package com.clone.microsvc.likes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LikeDTO {
    private Long id;
    private Integer like;
}
