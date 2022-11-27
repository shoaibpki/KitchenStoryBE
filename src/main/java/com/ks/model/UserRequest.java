package com.ks.model;

//import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private long id;
    private String username;
    private String password;
    private String role;
    
//    private List<String> roles;

}
