package com.codewithnitish.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDto {
	
   private int id;
   
   @NotEmpty
   @Size(min = 4 , message = "username must be min of 4 characters")
   private String name;
   
   @Email(message = "Email address is not valid")
   private String email;
   
   @NotEmpty
   @Size(min = 8 , max = 10 , message = "password must be min of 8 chars and max of 10 chars !")
   @Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")
   private String password;
   
   @NotEmpty
   private String about;
}
