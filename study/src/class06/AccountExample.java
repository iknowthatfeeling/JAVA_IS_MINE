package class06;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account(null, null, 0);
		
		account.setBalance(10000);
		System.out.println("���� �ܰ�"+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("���� �ܰ�: "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("���� �ܰ�: "+ account.getBalance());
		
		account.setBalance(300000);
		System.out.println("���� �ܰ�: "+ account.getBalance());

	}

}
