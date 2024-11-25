package com.example.PetrolPump.Backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CustomerDto {
    private Long rfid;
    private String firstName;
    private String lastName;
    private String email;
    private int balance;
}
