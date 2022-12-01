package main;

import provider.Provider;
import provider.RealProvider;
import proxy.InvoiceProxy;
import proxy.ProtectionProxy;

public class MainProxy {

	private static void run(Provider p) {
		p.service1();
		p.service2();
		p.service1();
		p.service4();
		p.service3();
	}

	public static void main(String[] args) {
		System.out.println(">>> Proxy facture <<<");
		InvoiceProxy invoiceProxy = new InvoiceProxy();
		run(invoiceProxy);
		System.out.println("Coût total : " + invoiceProxy.totalCost());
		System.out.println();
		System.out
				.println(">>> Proxy authentification requise (mdp=1234) pour les services 3 et 4 <<<");
		Provider protectionProxy = new ProtectionProxy(new RealProvider(),
				"1234");
		run(protectionProxy);
		System.out.println();
		System.out
				.println(">>> Proxy facture + authentification requise (mdp=0000) pour les services 3 et 4 <<<");
		Provider p = new ProtectionProxy(invoiceProxy, "0000");
		run(p);
		System.out.println("Coût total : " + invoiceProxy.totalCost());
	}

}
