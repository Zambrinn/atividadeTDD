import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ServicoJogadorTeste {
    @Test
        public void findElderPlayer() throws Exception {
        Jogador jogador1 = new Jogador("Nicolas Delacruz", 1997, "meio-campo", "uruguaio", 167, 65);
        Jogador jogador2 = new Jogador("Lionel Messi", 1987, "atacante", "argentino", 170, 72);
        Jogador jogador3 = new Jogador("Cristiano Ronaldo", 1983, "atacante", "português", 187, 83);
        Jogador jogador4 = new Jogador("Luka Modrić", 1985, "meio-campo", "croata", 172, 66);
        Jogador jogador5 = new Jogador("Kevin De Bruyne", 1991, "meio-campo", "belga", 181, 68);
        Jogador jogador6 = new Jogador("Sergio Ramos", 1986, "defesa", "espanhol", 172, 66);
        Jogador jogador7 = new Jogador("Manuel Neuer", 1986, "defesa", "alemão", 194, 92);
        Jogador jogador8 = new Jogador("Virgil van Dijk", 1991, "defesa", "holandês", 193, 92);
        Jogador jogador9 = new Jogador("Robert Lewandowski", 1988, "atacante", "polonês", 185, 82);
        Jogador jogador10 = new Jogador("Kylian Mbappé", 1998, "atacante", "francês", 178, 73);

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador1);
        jogadores.add(jogador2);
        jogadores.add(jogador3);
        jogadores.add(jogador4);
        jogadores.add(jogador5);
        jogadores.add(jogador6);
        jogadores.add(jogador7);
        jogadores.add(jogador8);
        jogadores.add(jogador9);
        jogadores.add(jogador10);

        ServicoJogador servicoJogador = new ServicoJogador();
        int year = 2024;
        Assert.assertEquals(jogador3.getName(), servicoJogador.findElderPerson(jogadores, year).getName());
        System.out.println("O jogador mais velho é " + jogador3.getName() + " e a sua idade é: " + jogador3.ageCalculator());
        System.out.println(jogador3.printAtributes());
    }

     @Test
     public void findNewestPlayer() throws Exception {
         Jogador jogador1 = new Jogador("Nicolas Delacruz", 1997, "meio-campo", "uruguaio", 167, 65);
         Jogador jogador2 = new Jogador("Lionel Messi", 1987, "atacante", "argentino", 170, 72);
         Jogador jogador3 = new Jogador("Cristiano Ronaldo", 1983, "atacante", "português", 187, 83);
         Jogador jogador4 = new Jogador("Luka Modrić", 1985, "meio-campo", "croata", 172, 66);
         Jogador jogador5 = new Jogador("Kevin De Bruyne", 1991, "meio-campo", "belga", 181, 68);
         Jogador jogador6 = new Jogador("Sergio Ramos", 1986, "defesa", "espanhol", 172, 66);
         Jogador jogador7 = new Jogador("Manuel Neuer", 1986, "defesa", "alemão", 194, 92);
         Jogador jogador8 = new Jogador("Virgil van Dijk", 1991, "defesa", "holandês", 193, 92);
         Jogador jogador9 = new Jogador("Robert Lewandowski", 1988, "atacante", "polonês", 185, 82);
         Jogador jogador10 = new Jogador("Kylian Mbappé", 1998, "atacante", "francês", 178, 73);

         List<Jogador> jogadores = new ArrayList<>();
         jogadores.add(jogador1);
         jogadores.add(jogador2);
         jogadores.add(jogador3);
         jogadores.add(jogador4);
         jogadores.add(jogador5);
         jogadores.add(jogador6);
         jogadores.add(jogador7);
         jogadores.add(jogador8);
         jogadores.add(jogador9);
         jogadores.add(jogador10);

         ServicoJogador servicoJogador = new ServicoJogador();
         int year = 2024;
         Assert.assertEquals(jogador10.getName(), servicoJogador.findYoungestPlayer(jogadores, year).getName());
         System.out.println("O jogador mais novo é " + jogador10.getName() + " e a sua idade é: " + jogador10.ageCalculator());
         System.out.println(jogador10.printAtributes());
     }


     @Test
     public void findFattestPerson() throws Exception {
         Jogador jogador1 = new Jogador("Nicolas Delacruz", 1997, "meio-campo", "uruguaio", 167, 65);
         Jogador jogador2 = new Jogador("Lionel Messi", 1987, "atacante", "argentino", 170, 72);
         Jogador jogador3 = new Jogador("Cristiano Ronaldo", 1983, "atacante", "português", 187, 83);
         Jogador jogador4 = new Jogador("Luka Modrić", 1985, "meio-campo", "croata", 172, 66);
         Jogador jogador5 = new Jogador("Kevin De Bruyne", 1991, "meio-campo", "belga", 181, 68);
         Jogador jogador6 = new Jogador("Sergio Ramos", 1986, "defesa", "espanhol", 172, 66);
         Jogador jogador7 = new Jogador("Manuel Neuer", 1986, "defesa", "alemão", 194, 92);
         Jogador jogador8 = new Jogador("Virgil van Dijk", 1991, "defesa", "holandês", 193, 94);
         Jogador jogador9 = new Jogador("Robert Lewandowski", 1988, "atacante", "polonês", 185, 82);
         Jogador jogador10 = new Jogador("Kylian Mbappé", 1998, "atacante", "francês", 178, 73);

         List<Jogador> jogadores = new ArrayList<>();
         jogadores.add(jogador1);
         jogadores.add(jogador2);
         jogadores.add(jogador3);
         jogadores.add(jogador4);
         jogadores.add(jogador5);
         jogadores.add(jogador6);
         jogadores.add(jogador7);
         jogadores.add(jogador8);
         jogadores.add(jogador9);
         jogadores.add(jogador10);

         ServicoJogador servicoJogador = new ServicoJogador();
         Assert.assertEquals(jogador8.getName(), servicoJogador.findFattestPerson(jogadores).getName());
         System.out.println("O jogador mais pesado é: " + jogador8.getName() + " e o seu peso é: " + jogador8.getWeight());
         System.out.println(jogador8.printAtributes());
     }

     @Test
     public void findLightestPlayer() throws Exception {
         Jogador jogador1 = new Jogador("Nicolas Delacruz", 1997, "meio-campo", "uruguaio", 167, 65);
         Jogador jogador2 = new Jogador("Lionel Messi", 1987, "atacante", "argentino", 170, 72);
         Jogador jogador3 = new Jogador("Cristiano Ronaldo", 1983, "atacante", "português", 187, 83);
         Jogador jogador4 = new Jogador("Luka Modrić", 1985, "meio-campo", "croata", 172, 66);
         Jogador jogador5 = new Jogador("Kevin De Bruyne", 1991, "meio-campo", "belga", 181, 68);
         Jogador jogador6 = new Jogador("Sergio Ramos", 1986, "defesa", "espanhol", 172, 66);
         Jogador jogador7 = new Jogador("Manuel Neuer", 1986, "defesa", "alemão", 194, 92);
         Jogador jogador8 = new Jogador("Virgil van Dijk", 1991, "defesa", "holandês", 193, 92);
         Jogador jogador9 = new Jogador("Robert Lewandowski", 1988, "atacante", "polonês", 185, 82);
         Jogador jogador10 = new Jogador("Kylian Mbappé", 1998, "atacante", "francês", 178, 73);

         List<Jogador> jogadores = new ArrayList<>();
         jogadores.add(jogador1);
         jogadores.add(jogador2);
         jogadores.add(jogador3);
         jogadores.add(jogador4);
         jogadores.add(jogador5);
         jogadores.add(jogador6);
         jogadores.add(jogador7);
         jogadores.add(jogador8);
         jogadores.add(jogador9);
         jogadores.add(jogador10);

         ServicoJogador servicoJogador = new ServicoJogador();
         Assert.assertEquals(jogador1.getName(), servicoJogador.findLightestPlayer(jogadores).getName());
         System.out.println("O jogador mais leve é " + jogador1.getName() + " e o seu peso é: " + jogador1.getWeight());
         System.out.println(jogador1.printAtributes());
     }

     @Test
     public void findFartherPlayerFromRetirement() throws Exception {
         Jogador jogador1 = new Jogador("Nicolas Delacruz", 1997, "meio-campo", "uruguaio", 167, 65);
         Jogador jogador2 = new Jogador("Lionel Messi", 1987, "atacante", "argentino", 170, 72);
         Jogador jogador3 = new Jogador("Cristiano Ronaldo", 1983, "atacante", "português", 187, 83);
         Jogador jogador4 = new Jogador("Luka Modrić", 1985, "meio-campo", "croata", 172, 66);
         Jogador jogador5 = new Jogador("Kevin De Bruyne", 1991, "meio-campo", "belga", 181, 68);
         Jogador jogador6 = new Jogador("Sergio Ramos", 1986, "defesa", "espanhol", 172, 66);
         Jogador jogador7 = new Jogador("Manuel Neuer", 1986, "defesa", "alemão", 194, 92);
         Jogador jogador8 = new Jogador("Virgil van Dijk", 1991, "defesa", "holandês", 193, 92);
         Jogador jogador9 = new Jogador("Robert Lewandowski", 1988, "atacante", "polonês", 185, 82);
         Jogador jogador10 = new Jogador("Kylian Mbappé", 1998, "atacante", "francês", 178, 73);

         List<Jogador> jogadores = new ArrayList<>();
         jogadores.add(jogador1);
         jogadores.add(jogador2);
         jogadores.add(jogador3);
         jogadores.add(jogador4);
         jogadores.add(jogador5);
         jogadores.add(jogador6);
         jogadores.add(jogador7);
         jogadores.add(jogador8);
         jogadores.add(jogador9);
         jogadores.add(jogador10);

         ServicoJogador servicoJogador = new ServicoJogador();
         Assert.assertEquals(jogador2.getName(), servicoJogador.findFartherPlayerFromRetirement(jogadores).getName());
         System.out.println("O jogador mais longe da aposentadoria é " + jogador1.getName() + " e o tempo até sua aposentadoria é: " + jogador1.retirementCalculator());
         System.out.println(jogador1.printAtributes());
     }

     @Test
    public void findPlayerWhoShouldBeRetired() throws Exception {
         Jogador jogador1 = new Jogador("Nicolas Delacruz", 1997, "meio-campo", "uruguaio", 167, 65);
         Jogador jogador2 = new Jogador("Lionel Messi", 1987, "atacante", "argentino", 170, 72);
         Jogador jogador3 = new Jogador("Cristiano Ronaldo", 1983, "atacante", "português", 187, 83);
         Jogador jogador4 = new Jogador("Luka Modrić", 1985, "meio-campo", "croata", 172, 66);
         Jogador jogador5 = new Jogador("Kevin De Bruyne", 1991, "meio-campo", "belga", 181, 68);
         Jogador jogador6 = new Jogador("Sergio Ramos", 1986, "defesa", "espanhol", 172, 66);
         Jogador jogador7 = new Jogador("Manuel Neuer", 1986, "defesa", "alemão", 194, 92);
         Jogador jogador8 = new Jogador("Virgil van Dijk", 1991, "defesa", "holandês", 193, 92);
         Jogador jogador9 = new Jogador("Robert Lewandowski", 1988, "atacante", "polonês", 185, 82);
         Jogador jogador10 = new Jogador("Kylian Mbappé", 1998, "atacante", "francês", 178, 73);

         List<Jogador> jogadores = new ArrayList<>();
         jogadores.add(jogador1);
         jogadores.add(jogador2);
         jogadores.add(jogador3);
         jogadores.add(jogador4);
         jogadores.add(jogador5);
         jogadores.add(jogador6);
         jogadores.add(jogador7);
         jogadores.add(jogador8);
         jogadores.add(jogador9);
         jogadores.add(jogador10);

         ServicoJogador servicoJogador = new ServicoJogador();
         Assert.assertEquals(jogador2.getName(), servicoJogador.findFartherPlayerFromRetirement(jogadores).getName());
         System.out.println("O jogador que já devia estar aposentado mais velho é " + jogador3.getName() + " e o tempo que ele está depois da aposentadoria é: " + jogador3.retirementCalculator() + " anos");
         System.out.println(jogador3.printAtributes());
     }

     @Test
    public void findTallestPlayer() throws Exception {
         Jogador jogador1 = new Jogador("Nicolas Delacruz", 1997, "meio-campo", "uruguaio", 167, 65);
         Jogador jogador2 = new Jogador("Lionel Messi", 1987, "atacante", "argentino", 170, 72);
         Jogador jogador3 = new Jogador("Cristiano Ronaldo", 1983, "atacante", "português", 187, 83);
         Jogador jogador4 = new Jogador("Luka Modrić", 1985, "meio-campo", "croata", 172, 66);
         Jogador jogador5 = new Jogador("Kevin De Bruyne", 1991, "meio-campo", "belga", 181, 68);
         Jogador jogador6 = new Jogador("Sergio Ramos", 1986, "defesa", "espanhol", 172, 66);
         Jogador jogador7 = new Jogador("Manuel Neuer", 1986, "defesa", "alemão", 194, 92);
         Jogador jogador8 = new Jogador("Virgil van Dijk", 1991, "defesa", "holandês", 193, 92);
         Jogador jogador9 = new Jogador("Robert Lewandowski", 1988, "atacante", "polonês", 185, 82);
         Jogador jogador10 = new Jogador("Kylian Mbappé", 1998, "atacante", "francês", 178, 73);

         List<Jogador> jogadores = new ArrayList<>();
         jogadores.add(jogador1);
         jogadores.add(jogador2);
         jogadores.add(jogador3);
         jogadores.add(jogador4);
         jogadores.add(jogador5);
         jogadores.add(jogador6);
         jogadores.add(jogador7);
         jogadores.add(jogador8);
         jogadores.add(jogador9);
         jogadores.add(jogador10);

         ServicoJogador servicoJogador = new ServicoJogador();
         Assert.assertEquals(jogador7.getName(), servicoJogador.findTallestPlayer(jogadores).getName());
         System.out.println("O jogador com a maior altura é " + jogador7.getName() + " e sua altura é: " + jogador7.getHeight() + " cm");
         System.out.println(jogador7.printAtributes());
     }

     @Test
     public void findShortestPlayer() throws Exception {
         Jogador jogador1 = new Jogador("Nicolas Delacruz", 1997, "meio-campo", "uruguaio", 169, 65);
         Jogador jogador2 = new Jogador("Lionel Messi", 1987, "atacante", "argentino", 166, 72);
         Jogador jogador3 = new Jogador("Cristiano Ronaldo", 1983, "atacante", "português", 187, 83);
         Jogador jogador4 = new Jogador("Luka Modrić", 1985, "meio-campo", "croata", 172, 66);
         Jogador jogador5 = new Jogador("Kevin De Bruyne", 1991, "meio-campo", "belga", 181, 68);
         Jogador jogador6 = new Jogador("Sergio Ramos", 1986, "defesa", "espanhol", 172, 66);
         Jogador jogador7 = new Jogador("Manuel Neuer", 1986, "defesa", "alemão", 194, 92);
         Jogador jogador8 = new Jogador("Virgil van Dijk", 1991, "defesa", "holandês", 193, 92);
         Jogador jogador9 = new Jogador("Robert Lewandowski", 1988, "atacante", "polonês", 185, 82);
         Jogador jogador10 = new Jogador("Kylian Mbappé", 1998, "atacante", "francês", 178, 73);

         List<Jogador> jogadores = new ArrayList<>();
         jogadores.add(jogador1);
         jogadores.add(jogador2);
         jogadores.add(jogador3);
         jogadores.add(jogador4);
         jogadores.add(jogador5);
         jogadores.add(jogador6);
         jogadores.add(jogador7);
         jogadores.add(jogador8);
         jogadores.add(jogador9);
         jogadores.add(jogador10);

         ServicoJogador servicoJogador = new ServicoJogador();
         Assert.assertEquals(jogador2.getName(), servicoJogador.findShortestPlayer(jogadores).getName());
         System.out.println("O jogador mais baixo é " + jogador2.getName() + " e sua altura é: " + jogador2.getHeight() + " cm");
         System.out.println(jogador2.printAtributes());

     }
}