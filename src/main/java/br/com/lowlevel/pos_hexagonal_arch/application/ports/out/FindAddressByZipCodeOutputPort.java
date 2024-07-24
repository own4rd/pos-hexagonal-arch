package br.com.lowlevel.pos_hexagonal_arch.application.ports.out;

import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
