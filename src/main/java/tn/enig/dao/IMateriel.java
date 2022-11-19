package tn.enig.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.enig.model.Materiel;

@Repository
public interface IMateriel extends JpaRepository<Materiel,Integer>{
	@Query(value="select * from materiel where dep_id = ?1 ",nativeQuery=true)
	List<Materiel> findById(int id_dep);
	@Query(value="delete from materiel where id =?1",nativeQuery=true)
	public void deleteById(int id);
	
	
	@Transactional
	   @Modifying
	   @Query(value = "insert into materiel values(null,?1, ?2,?3, ?4,?5, ?6)", nativeQuery = true)
	   public void insertIntoMaterialTable( String etat, int numSerie,int qte,String titre, String type,int Dep_id );
	
}
