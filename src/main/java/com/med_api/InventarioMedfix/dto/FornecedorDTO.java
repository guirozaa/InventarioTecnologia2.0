package com.med_api.InventarioMedfix.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorDTO {
    private UUID id;
    private String nome;
}