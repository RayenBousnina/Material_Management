package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import tn.enig.dao.IDepartement;
import tn.enig.dao.IMateriel;
import tn.enig.model.Departement;
import tn.enig.model.Materiel;
import tn.enig.model.mat;

@Controller
public class Application {
	@Autowired
	public IDepartement daoDep;
	
	public void setDaoDep(IDepartement daodep) {
		this.daoDep=daodep;
	}
	@Autowired
	public IMateriel daoMat;
	public void setDaoMat(IMateriel daomat) {
		this.daoMat=daomat;
	}
	@GetMapping("/deps")
	public String fnGetDeps(Model m) {
		List<Departement> ldep = daoDep.findAll();
		m.addAttribute("deps",ldep);
		return "departements";
	}
	
	  @GetMapping("/matrls/{id_dep}") 
	  public String fnGetMatrls(Model m,@PathVariable int id_dep) { 
		  List<Materiel> lmatrls =daoMat.findById(id_dep);
		  System.out.println("the size is: "+lmatrls.size());
		  m.addAttribute("matrls", lmatrls);
		  String dep = daoDep.findDepartById(id_dep);
		  m.addAttribute("depart", dep);
		  m.addAttribute("id_dep", id_dep);

		  return "materiels";	  
	  }
	  
	  @GetMapping("/deleteMat/{id_mat}")
	  
	  public String delete(@PathVariable Integer id_mat) {
		   daoMat.delete(id_mat);
		  return  "redirect:/deps";
	  } 
	  	  
	  @GetMapping("/addMateriel/{id}") //represents a specific department
	  public String f4(Model m, @PathVariable Integer id) {	
		  Materiel mat = new Materiel();
		  Departement dept = daoDep.findOne(id);
		  mat.setDep(dept);
		 // System.out.println(mat.getDep().getId());
	      m.addAttribute("mat", mat)	;
	  	  return "addMateriel"; 
	  }
	  @PostMapping("/addMateriel/{id}")
	  public String saveAff(@PathVariable Integer id,@ModelAttribute("mat") Materiel mat){    
		  daoMat.insertIntoMaterialTable(mat.getEtat(),mat.getNumSerie(),mat.getQte(),mat.getTitre(),mat.getType(),id);
	  return "redirect:/deps";
	  }
	  }
	 
	 

