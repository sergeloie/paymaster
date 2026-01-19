package ru.anseranser.paymaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.anseranser.paymaster.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
