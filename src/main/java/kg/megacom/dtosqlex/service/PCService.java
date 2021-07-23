package kg.megacom.dtosqlex.service;

import kg.megacom.dtosqlex.models.dto.PCDto;
import kg.megacom.dtosqlex.models.tasks.Task1;

import java.util.List;

public interface PCService {

    List<Task1> findByPriceLess(double price);

    List<PCDto> findAll();
}
