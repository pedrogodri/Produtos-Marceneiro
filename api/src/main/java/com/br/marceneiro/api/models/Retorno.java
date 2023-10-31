package com.br.marceneiro.api.models;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Retorno {
    private String mensagem;
}
