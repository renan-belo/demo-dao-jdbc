package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}

//M�TODO PARA ESCONDER A INSTANCIA��O/IMPLEMENTA��O DE UM OBJETO
//NESSE CASO, O SELLERDAO