package kg.megacom.dtosqlex.service.impl;

import kg.megacom.dtosqlex.service.PCService;
import kg.megacom.dtosqlex.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private PCService pcService;

    @Override
    public Object execute(String taskNum) {

        switch (taskNum){
            case "1":
                return pcService.findByPriceLess(500);
        }

        return null;
    }
}
