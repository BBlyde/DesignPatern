package proxy;

import java.util.Scanner;

import provider.Provider;

public class ProtectionProxy implements Provider {

	private Provider provider;
	private String password;
	private Scanner sc;

	public ProtectionProxy(Provider provider, String password) {
		this.provider = provider;
		this.password = password;
	}

	@Override
	public void service1() {
		this.provider.service1();
	}

	@Override
	public void service2() {
		this.provider.service2();
	}

	@Override
	public void service3() {
		if (authorizedAccess()) {
			this.provider.service3();
		} else {
			System.out.println("Service 3 non utilisé.");
		}
	}

	@Override
	public void service4() {
		if (authorizedAccess()) {
			this.provider.service4();
		} else {
			System.out.println("Service 4 non utilisé.");
		}
	}

	private boolean authorizedAccess() {
		boolean ok = false;
		System.out.println("Mot de passe : ");
		sc = new Scanner(System.in);
		if (sc.nextLine().equals(this.password)) {
			ok = true;
		} else {
			System.out.println("Mot de passe invalide !");
		}
		// sc.close();
		return ok;
	}

}
