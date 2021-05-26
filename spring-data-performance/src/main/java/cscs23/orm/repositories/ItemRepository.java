package cscs23.orm.repositories;

import cscs23.orm.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
