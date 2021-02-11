public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalGespeeld;

    Voetbalclub(String naam){
        if(naam == null || naam.equals("")){
            this.naam = "fc";
        } else {
            this.naam = naam;
        }
    }

    public void verwerkResultaat(char ch){
        if (ch == 'w'){
            aantalGewonnen++;
            aantalGespeeld++;
        } else if (ch == 'g'){
            aantalGelijk++;
            aantalGespeeld++;
        } else if (ch == 'v'){
            aantalVerloren++;
            aantalGespeeld++;
        } else{
            System.out.println("Foutief karakter");
        }
    }

    public String getNaam(){
        return this.naam;
    }

    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;
    }

    public int aantalGespeeld(){
        return aantalGespeeld;
    }

    @Override
    public String toString(){
        return "%-13s %d %d %d %d %d".formatted(
                this.naam,
                aantalGespeeld(),
                this.aantalGewonnen,
                this.aantalGelijk,
                this.aantalVerloren,
                aantalPunten()
                );
    }
}
