package kg.megacom.dtosqlex.dao;

import kg.megacom.dtosqlex.models.PC;
import kg.megacom.dtosqlex.models.tasks.Task1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PCRepo extends JpaRepository<PC, Long> {

    List<PC> findAllByPriceLessThan(double price);

    // 3
    @Query("select new kg.megacom.dtosqlex.models.tasks.Task1(u.product.model, u.speed, u.hd) from PC u where u.price>?1")
    List<Task1> findAllPriceGreater(double price);

}

