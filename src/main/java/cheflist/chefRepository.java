package cheflist;

import org.springframework.data.repository.CrudRepository;
import cheflist.Chef;

public interface chefRepository extends CrudRepository <Chef, Long> {

}
