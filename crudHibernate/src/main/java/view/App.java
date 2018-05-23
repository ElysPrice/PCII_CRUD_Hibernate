package view;

import controller.ClienteJpaDAO;
import model.Cliente;


public class App 
{
    public static void main( String[] args )
    {
        Cliente cliente = new Cliente();
        cliente.setCpf("431.828.321-60");
        cliente.setId(76);
        cliente.setNome("Tatiane dos Santos Pinheiro Gonsevski");
        cliente.setRg("38.528.321-0");
        ClienteJpaDAO.getInstance().merge(cliente);
        System.out.println("Objetos salvos com sucesso!");
    }
}
