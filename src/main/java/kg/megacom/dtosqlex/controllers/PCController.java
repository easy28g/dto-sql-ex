package kg.megacom.dtosqlex.controllers;


import kg.megacom.dtosqlex.models.dto.PCDto;
import kg.megacom.dtosqlex.service.PCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/pc")
public class PCController {

    @Autowired
    private PCService pcService;

    @GetMapping("all")
    public List<PCDto> all(){
        return pcService.findAll();
    }
}
