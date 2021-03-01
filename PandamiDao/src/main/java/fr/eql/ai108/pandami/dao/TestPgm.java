package fr.eql.ai108.pandami.dao;

import fr.eql.ai108.pandami.idao.UserIDao;

public class TestPgm {

	public static void main(String[] args) {
		UserIDao dao = new UserDao();
		UserDao dao2 = new UserDao();
		System.out.println(dao2.exist("toto"));
	}

}
