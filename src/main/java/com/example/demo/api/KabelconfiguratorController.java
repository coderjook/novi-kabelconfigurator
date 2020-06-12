package com.example.demo.api;

import com.example.demo.model.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/kabelconfigurator")
@RestController
//@CrossOrigin("*")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class KabelconfiguratorController {

    private final KabelService kabelService;
    private final ConnectorService connectorService;
    private final AssemblieService assemblieService;
    private final HaspelService haspelService;
    private final TulegroepService tulegroepService;

    @Autowired
      public KabelconfiguratorController(KabelService kabelService, ConnectorService connectorService,
                                         AssemblieService assemblieService, HaspelService haspelService,
                                         TulegroepService tulegroepService) {
        this.kabelService = kabelService;
        this.connectorService = connectorService;
        this.assemblieService = assemblieService;
        this.haspelService = haspelService;
        this.tulegroepService = tulegroepService;
    }

    @PostMapping("/kabel")
    public void addKabel(@RequestBody Kabel kabel) { kabelService.AddKabel(kabel); }

    @PostMapping("/assemblie")
    public void addAssemblie(@RequestBody Assemblie assemblie) { assemblieService.AddAssemblie(assemblie); }

    @PostMapping("/connector")
    public void addConnector(@RequestBody Connector connector) { connectorService.AddConnector(connector); }

    @PostMapping("/haspel")
    public void addHaspel(@RequestBody Haspel haspel) { haspelService.AddHaspel(haspel); }

    @PostMapping("/tulegroep")
    public void addTulegroep(@RequestBody Tulegroep tulegroep) { tulegroepService.addTulegroep(tulegroep);}

    @GetMapping("/assemblie")
    public List<Assemblie> getAssemblies(){ return assemblieService.getAssemblies(); }

    @GetMapping("/kabel")
    public List<Kabel> getKabels(){ return kabelService.getKabels(); }

    @GetMapping("/connector")
    public List<Connector> getConnectors(){ return connectorService.getConnectors(); }

    @GetMapping("/haspel")
    public List<Haspel> getHaspels(){ return haspelService.getHaspels(); }

    @GetMapping("/tulegroep")
    public List<Tulegroep> getTulegroep(){ return tulegroepService.getTulegroep(); }

    @DeleteMapping(path = "kabel/{artikelnummer}")
    public void deleteKabel(@PathVariable("artikelnummer") int artikelnummer) {
        kabelService.deleteKabel(artikelnummer);
    }

    @DeleteMapping(path = "assemblie/{id_assemblie}")
    public void deleteAssemblie(@PathVariable("id_assemblie") UUID id_assemblie) {
        assemblieService.deleteAssemblie(id_assemblie);
    }

    @PutMapping("/kabel")
    public void updateProduct(@RequestBody Kabel kabel) {
        kabelService.updateInkoopprijsKabel(kabel);
    }

    @PutMapping("/assemblie/kabel")
    public void updateKabelAssemblie(@RequestBody Assemblie assemblie) {
        assemblieService.updateKabelAssemblie(assemblie);
    }

    @PutMapping("/assemblie/haspel")
    public void updateHaspelAssemblie(@RequestBody Assemblie assemblie) {
        assemblieService.updateHaspelAssemblie(assemblie);
    }

    @PutMapping("/assemblie/connectora")
    public void updateConnectorAAssemblie(@RequestBody Assemblie assemblie) {
        assemblieService.updateConnectorAAssemblie(assemblie);
    }

    @PutMapping("/assemblie/connectorb")
    public void updateConnectorBAssemblie(@RequestBody Assemblie assemblie) {
        assemblieService.updateConnectorBAssemblie(assemblie);
    }

    @PutMapping("/assemblie/afwerking")
    public void updateAfwerkingAssemblie(@RequestBody Assemblie assemblie) {
        assemblieService.updateAfwerkingAssemblie(assemblie);
    }

}
