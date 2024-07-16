package br.com.ada.designpatterns.comportamentais.templatemethod.solucao;

import br.com.ada.designpatterns.comportamentais.templatemethod.VeiculoParaReparo;

public abstract class ReparoVeiculoService {

    public void reparaVeiculo() {
        entradaOficina();
        analisarDanos();

        if (veiculoParaReparo()) {
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    protected abstract boolean veiculoParaReparo();

    private void notificarPerdaTotalParaSeguradora() {System.out.println("Notificando perda total para seguradora...");}

    private void notificarReparoParaSeguradora() {System.out.println("Notificando reparo para a seguradora...");}

    private void repararVeiculo() {System.out.println("Reparando veiculo...");}

    private void analisarDanos() {System.out.println("Analisando danos...");}

    protected void entradaOficina() {System.out.println("Veículo entrando na oficina...");}

}
