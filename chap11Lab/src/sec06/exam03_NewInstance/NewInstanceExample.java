package sec06.exam03_NewInstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class clazz = Class.forName("sec06.exam03_NewInstance.ReceiveAction");
			Class clazz = Class.forName(args[0]);
			
			Action action =(Action)clazz.newInstance();
			action.execute();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}
