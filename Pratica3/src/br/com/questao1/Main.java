import br.com.questao1.Camarote;
import br.com.questao1.Ingresso;
import br.com.questao1.Normal;
import br.com.questao1.Vip;

public class Main {

    public static void main(String[] args) {

        Normal n1 = new Normal(100);
        n1.imprimeIngresso();

        Vip v1 = new Vip(100,50);
        v1.imprimeIngresso();

        Camarote c1 = new Camarote(100,100,"Ala B");
        c1.imprimeIngresso();



    }
}