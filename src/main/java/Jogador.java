public class Jogador {
    private String name;
    private int birthDate;
    private String position;
    private String nationality;
    private int height;
    private int weight;

    public Jogador(String name, int birthDate, String position, String nationality, int height, int weight) {
        this.name = name;
        this.birthDate = birthDate;
        this.position = position;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    public Jogador() {

    }

    public String getName() {
        return name;
    }
    public int getBirthDate() {
        return birthDate;
    }
    public String getPosition() {
        return position;
    }
    public String getNationality() {
        return nationality;
    }
    public int getHeight() {
        return height; }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int ageCalculator() {
        int year = 2024;
        return year - this.birthDate;
    }

    public String printAtributes() throws Exception {
        System.out.println("Nome: " + name);
        System.out.println("Posição: " + position);
        System.out.println("Data de Nascimento: " + birthDate);
        System.out.println("Nacionalidade: " + nationality);
        System.out.println("Altura: " + height);
        System.out.println("Peso: " + weight);
        System.out.println("Idade: " + ageCalculator());
        System.out.println("Anos até aposentadoria: " + retirementCalculator());
        return "";
    }

    public int retirementCalculator() throws Exception {
        int age = ageCalculator();
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
        return retirementAge - age;
    }
}





