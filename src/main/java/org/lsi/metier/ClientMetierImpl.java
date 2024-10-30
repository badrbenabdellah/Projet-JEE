package org.lsi.metier;

import org.lsi.dao.ClientRepository;
import org.lsi.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientMetierImpl implements ClientMetier {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public List<Client> listClients() {
        return clientRepository.findAll();
    }
}
