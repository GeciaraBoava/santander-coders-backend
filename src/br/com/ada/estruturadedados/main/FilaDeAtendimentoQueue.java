package br.com.ada.estruturadedados.main;

import br.com.ada.estruturadedados.estruturas.Queue;
import java.util.Random;

public class FilaDeAtendimentoQueue {
    public static void main(String[] args) {
        int n = 5; //quantidade de clientes
        var random = new Random();
        int cliente = random.nextInt(101);
        Queue queue = new Queue(cliente);

        //simula a chegada do cliente
        System.out.println("Chegou o cliente: " + cliente);
        for(int i = 2; i <= n; i++) {
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente: " + cliente);
            queue.enqueue(cliente);
        }

        //Atendimento dos clientes
        var node = queue.dequeue();
        while (node != null) {
            System.out.println("Atendido o cliente: " + node.getValue());
            node = queue.dequeue();
        }
    }
}