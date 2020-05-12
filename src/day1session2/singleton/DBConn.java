package day1session2.singleton;

public class DBConn {

	private static DBConn instance = new DBConn();

	private DBConn() {
	}
	
	public static DBConn getInstance() {
		return instance;
	}
	
	public void test() {
		
		System.out.println("Inside test() of DBConn");
	}
	
	public static void main(String[] args) {
		DBConn dbConn = DBConn.getInstance();
		dbConn.test();
	}

}
