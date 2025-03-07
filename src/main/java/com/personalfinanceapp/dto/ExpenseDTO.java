package com.personalfinanceapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
public class ExpenseDTO {
    private Long id;
    private String category;
    private Double amount;// Format the date as dd/MM/yyyy
    private LocalDate date;
    private Long userId;
}