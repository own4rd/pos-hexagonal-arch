package br.com.lowlevel.pos_hexagonal_arch.adapters.out.repository.entity;

import lombok.Data;

@Data
public class AddressEntity {

    private String street;
    private String city;
    private String state;
}
