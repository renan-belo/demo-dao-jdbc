package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}

//MÉTODO PARA ESCONDER A INSTANCIAÇÃO/IMPLEMENTAÇÃO DE UM OBJETO
//NESSE CASO, O SELLERDAO