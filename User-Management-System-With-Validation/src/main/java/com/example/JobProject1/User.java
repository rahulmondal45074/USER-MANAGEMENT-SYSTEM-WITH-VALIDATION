package com.example.JobProject1;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    private Integer userId;
    @NotBlank
    private String userName;

    private LocalDateTime  userDOB;

    private String userEmail;

    @Size(min = 10, max=10)
    @Pattern(regexp = "^[0-9]+$", message = "contacts should be just numbers!!")

    private Integer userPhone;

    private LocalDate userDate;

    private LocalTime userTime;

    private Type userType;
}
