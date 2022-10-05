package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}

//M�TODO PARA ESCONDER A INSTANCIA��O/IMPLEMENTA��O DE UM OBJETO
//NESSE CASO, O SELLERDAO