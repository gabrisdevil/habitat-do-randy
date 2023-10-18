package main.java.br.nassau.floresta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AcoesEcossistema {
    private List<Animal> animals = new ArrayList<>();
    private List<Planta> plantas = new ArrayList<>();
    private Terreno terreno;
    private Scanner sc = new Scanner(System.in);

    public AcoesEcossistema() {
        terreno = new Terreno(10);
        criarAnimaisEPlantas();
        System.out.println("Iniciando Ecossistema...");
    }

    private void criarAnimaisEPlantas() {
        String[] tiposAnimais = { "Leão", "Tigre", "Coelho", "Roedor", "Cervo" };
        String[] tiposPlantas = { "Carvalho", "Moita" };

        for (String tipo : tiposAnimais) {
            System.out.println("Digite quantos " + tipo.toLowerCase() + " você quer que tenha no terreno: ");
            int quantidade = sc.nextInt();

            for (int i = 0; i < quantidade; i++) {
                int x = (int) (Math.random() * 10);
                int y = (int) (Math.random() * 10);
                switch (tipo) {
                    case "Leão":
                        animals.add(new Leao(x, y));
                        break;
                    case "Tigre":
                        animals.add(new Tigre(x, y));
                        break;
                    case "Coelho":
                        animals.add(new Coelho(x, y));
                        break;
                    case "Roedor":
                        animals.add(new Esquilo(x, y));
                        break;
                    case "Cervo":
                        animals.add(new Veado(x, y));
                        break;
                }
            }
        }

        for (String tipo : tiposPlantas) {
            System.out.println("Digite quantos " + tipo.toLowerCase() + " você quer que tenha no terreno: ");
            int quantidade = sc.nextInt;

            for (int i = 0; i < quantidade; i++) {
                int x = (int) (Math.random() * 10);
                int y = (int) (Math.random() * 10);
                switch (tipo) {
                    case "Carvalho":
                        plantas.add(new Carvalho(x, y));
                        break;
                    case "Moita":
                        plantas.add(new Arbusto(x, y));
                        break;
                }
            }
        }
    }

    public void iniciarEcossistema() {
        terreno.exibirTerreno(animals, plantas);

        while (true) {
            // Lógica de interação entre animais e plantas aqui

            terreno.exibirTerreno(animals, plantas);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
