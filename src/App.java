public class App {
    public static void main(String[] args) throws Exception {
        AgenciaViagem agencia = new AgenciaViagem();

        agencia.setViagem(new ViagemPraia());

        agencia.organizar_viagem();
    }
}
