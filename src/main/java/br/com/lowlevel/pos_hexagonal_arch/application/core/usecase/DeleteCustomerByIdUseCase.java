package br.com.lowlevel.pos_hexagonal_arch.application.core.usecase;

import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.DeleteCustomerByIdInputPort;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.FindCustomerByIdInputPort;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
}
