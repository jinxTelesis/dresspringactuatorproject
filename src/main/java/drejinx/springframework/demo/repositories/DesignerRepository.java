package drejinx.springframework.demo.repositories;

import drejinx.springframework.demo.domain.Designer;
import org.springframework.data.repository.CrudRepository;

public interface DesignerRepository extends CrudRepository<Designer,Long> {

}
