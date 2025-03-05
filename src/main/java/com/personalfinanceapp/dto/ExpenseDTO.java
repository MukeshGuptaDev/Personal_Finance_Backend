package com.personalfinanceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class ExpenseDTO {
    private Long id;
    private String category;
    private Double amount;
    private Date date;
    private Long userId;
}