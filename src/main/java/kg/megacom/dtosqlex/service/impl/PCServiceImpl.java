package kg.megacom.dtosqlex.service.impl;

import kg.megacom.dtosqlex.dao.PCRepo;
import kg.megacom.dtosqlex.mappers.PCMapper;
import kg.megacom.dtosqlex.models.PC;
import kg.megacom.dtosqlex.models.dto.PCDto;
import kg.megacom.dtosqlex.models.tasks.Task1;
import kg.megacom.dtosqlex.service.PCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PCServiceImpl implements PCService {

    @Autowired
    private PCRepo pcRepo;

    @Override
    public List<Task1> findByPriceLess(double price) {

        List<PC> pcs = pcRepo.findAllByPriceLessThan(price);

        // 1
        List<Task1> list = pcs.stream()
                .map(x->{
                    Task1 task1 = new Task1();
                    task1.setModel(x.getProduct().getModel());
                    task1.setHd(x.getHd());
                    task1.setSpeed(x.getSpeed());
                    return task1;
                })
                .collect(Collectors.toList());

        //2
//        List<Map<String, Object>> list = new ArrayList<>();
//        pcs.stream()
//                .forEach(x->{
//                    Map<String, Object> map = new HashMap<>();
//                    map.put("model", x.getProduct().getModel());
//                    map.put("speed", x.getSpeed());
//                    map.put("hd", x.getHd());
//                    list.add(map);
//                });



        return pcRepo.findAllPriceGreater(price);
    }

    @Override
    public List<PCDto> findAll() {

        List<PC> pcs = pcRepo.findAll();
        return PCMapper.INSTANCE.toPCDtos(pcs);

    }
}
