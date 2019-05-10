package jpu2016.javapetri.dao;

import jpu2016.javapetri.model.JavaPetri;

//abstract because can't private at top level
abstract class QueryJavaPetri {
	
	public String getQueryInsert(JavaPetri javaPetri) {
		return null;
	}
	
	public String getQuerySelectById(int id) {
		return null;
	}
	
	public String getQuerySelectAll() {
		return null;
	}

}
