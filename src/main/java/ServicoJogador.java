import java.util.List;

public class ServicoJogador {
    public Jogador findElderPerson(List<Jogador> jogadores, int year) {
        Jogador elderPerson = jogadores.get(0);

        for (int i = 0; i < jogadores.size(); i++) {
        if (jogadores.get(i).ageCalculator() > elderPerson.ageCalculator()) {
            elderPerson = jogadores.get(i);
            }
        }
        return elderPerson;
    }

    public Jogador findYoungestPlayer(List<Jogador> jogadores, int year) {
        Jogador youngestPlayer = jogadores.get(0);
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).ageCalculator() < youngestPlayer.ageCalculator()) {
                youngestPlayer = jogadores.get(i);
            }
        }
        return youngestPlayer;
    }

    public Jogador findFattestPerson(List<Jogador> jogadores) {
        Jogador fattestPerson = jogadores.get(0);
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getWeight() > fattestPerson.getWeight()) {
                fattestPerson = jogadores.get(i);
            }
        }
        return fattestPerson;
    }

    public Jogador findLightestPlayer(List<Jogador> jogadores) {
        Jogador lightestPerson = jogadores.get(0);
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getWeight() < lightestPerson.getWeight()) {
                lightestPerson = jogadores.get(i);
            }
        }
        return lightestPerson;
    }

    public Jogador findFartherPlayerFromRetirement(List<Jogador> jogadores) throws Exception {
        Jogador retirementPerson = jogadores.get(0);
        int year = 2024;
        int maxYearsUntilRetirement = -1;

        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);
            int retirementAge = retirementAgeCalculator(jogador);
            int age = retirementPerson.ageCalculator();
            int yearsUntilRetirement = year - retirementAge;

            if ( yearsUntilRetirement > maxYearsUntilRetirement ) {
                maxYearsUntilRetirement = yearsUntilRetirement;
                retirementPerson = jogador;
            }
        }
        return retirementPerson;
    }

    private int retirementAgeCalculator(Jogador jogador) throws Exception {
        String position = jogador.getPosition();

        int retirementAge;

        switch (position) {
            case "atacante":
                retirementAge = 35;
                break;
            case "meio-campo":
                retirementAge = 38;
                break;
            case "defesa":
                retirementAge = 40;
                break;
            default:
                throw new Exception("Informe uma posicao valida");
        }
        return retirementAge;
    }

    public Jogador findTallestPlayer(List<Jogador> jogadores) {
        Jogador tallestPlayer = jogadores.get(0);

        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);
            if ( jogador.getHeight() > tallestPlayer.getHeight() ) {
                tallestPlayer = jogador;
            }
        }
        return tallestPlayer;
    }

    public Jogador findShortestPlayer(List<Jogador> jogadores) {
        Jogador shortestPlayer = jogadores.get(0);
        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);
            if ( jogadores.get(i).getHeight() < shortestPlayer.getHeight() ) {
                shortestPlayer = jogador;
            }
        }
        return shortestPlayer;
    }
}