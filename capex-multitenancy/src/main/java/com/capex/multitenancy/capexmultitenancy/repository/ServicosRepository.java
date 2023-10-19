package com.capex.multitenancy.capexmultitenancy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capex.multitenancy.capexmultitenancy.model.Servicos;

public interface ServicosRepository  extends JpaRepository<Servicos, Long>{

}
