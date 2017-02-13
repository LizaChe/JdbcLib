package by.htp.main;

import by.htp.service.ServiceImpl;

public class Main {

	public static void main(String[] args) {
		ServiceImpl service =new ServiceImpl();
		service.moreOneBook();
		service.lessTwoBooks();
		service.rename();
	}

}
