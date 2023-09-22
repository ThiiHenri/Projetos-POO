package br.com.questao1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Normal extends Ingresso {

    public Normal(double valorIngresso) {
        super(valorIngresso);
    }

    public void imprimeIngresso(){

        System.out.println("Ingresso normal - valor: " + getValorIngresso());

    }
}
