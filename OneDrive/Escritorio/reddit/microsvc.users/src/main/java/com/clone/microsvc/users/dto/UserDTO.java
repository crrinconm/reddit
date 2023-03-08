package com.clone.microsvc.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

    private Long id;
    private String email;
    private String user_name;
    private String password;
    private String photo;
}
