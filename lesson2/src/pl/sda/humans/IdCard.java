package pl.sda.humans;

/**
 * Kolejna część zadania 3 z listy D1
 * Rozszerzenie klasy IdentificationDocument reprezentujące dowód osobisty
 */
public class IdCard extends IdentificationDocument {
    private String series; // dodatkowe pole z serią dokumentu

    // gettery settery i toString wygenerowane automatycznie (pamiętacie jak?)
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "series='" + series + '\'' +
                ", type=" + type +
                ", number='" + number + '\'' +
                ", issueDate=" + issueDate +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
