package jpu2016.javapetri.dao;

import jpu2016.javapetri.model.JavaCell;

//abstract because can't private at top level
abstract class QueryJavaCell {
	
	public String getQueryInsert(JavaCell javaCell, int idJavaPetri) {
		return null;
	}

}
