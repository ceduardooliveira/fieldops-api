package br.com.fieldops.api.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ClienteRequestDTO {

    @NotBlank(message = "O nome do cliente é obrigatório")
    @Size(max = 150, message = "O nome deve ter no máximo 150 caracteres")
    private String nome;

    @NotBlank(message = "O CNPJ é obrigatório")
    @Size(min = 14, max = 20, message = "O CNPJ deve ter um formato válido")
    private String cnpj;
}