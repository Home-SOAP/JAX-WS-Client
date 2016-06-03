package com.javacodegeeks.ws.client;

public class WSClient {

	public static void main(String[] args) {
        WebServiceImplService webService = new WebServiceImplService();
        WebServiceInterface serviceInterface = webService.getWebServiceImplPort();

        System.out.println("JAX-WS > " + serviceInterface.getHelloWorldAsString("[Клиент-2] This is Java Code Geeks"));
    }

}
