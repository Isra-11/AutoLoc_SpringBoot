package tn.esprit.sprintboot.tp1spring.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprintboot.tp1spring.domain.Client;
import tn.esprit.sprintboot.tp1spring.services.IClient;
import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final IClient clientService;

    @PostMapping("/add")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @GetMapping("/find/{id}")
    public Client findClient(@PathVariable Long id) {
        return clientService.findClientById(id);
    }

    @PutMapping("/update")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @GetMapping("/all")
    public List<Client> findAllClients() {
        return clientService.findAll();
    }
}
