package com.pecas.PecasRepository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pecas.models.Produto;

@Repository
public interface PecasRepository extends CrudRepository<Produto, String>{

	

}
