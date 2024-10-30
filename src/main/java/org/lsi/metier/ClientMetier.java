package org.lsi.metier;

import org.lsi.entities.Client;
import java.util.List;

public interface ClientMetier {
    public Client saveClient(Client c);
    public List<Client> listClients();
}
