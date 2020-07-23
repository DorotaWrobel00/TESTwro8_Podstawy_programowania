package pl.sda.humans;

/**
 * Kolejna część zadania 3 z listy D1
 * Rozszerzenie klasy IdentificationDocument reprezentujące paszport
 */
public class Passport extends IdentificationDocument{
    private String series; // dotatkowe pole reprezentujące serię dokumentu
    private boolean biometric; // informacja czy dokument biometryczny

    // wygenerowane gettery, settery i toString
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public boolean isBiometric() {
        return biometric;
    }

    public void setBiometric(boolean biometric) {
        this.biometric = biometric;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "series='" + series + '\'' +
                ", number='" + number + '\'' +
                ", biometric=" + biometric +
                ", type=" + type +
                ", issueDate=" + issueDate +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
