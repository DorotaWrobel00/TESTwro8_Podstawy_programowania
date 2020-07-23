// pakiet w której znajduje się klasa Human. Pakiety tworzymy: prawy przycisk myszy na src -> new -> package -> nazwa pakietu ciągi liter (mogą być też cyfry) rozdzielone .
package pl.sda.humans;

import java.util.List;

/**
 * Klasa human wykonana w ramach zadania 1 Klasa Human z listy D1
 *
 */
public class Human {
    // pola klasy
    protected final long id; // pole id jest finalne - inicjalizacja musi być wykonana wraz utworzeniem obiektu. dlatego też nie będzie miało settera
    protected String name; // pole imienia
    protected String surname; // pole nazwiska
    protected String personalIdentityNumber; // pole peselu
    protected List<IdentificationDocument> documents;
    /**
     * Metoda konstruktora parametryzowana wymaganym parametrem id
     * @param id - wymagany parametr konstruktora
     *
     * metoda została wygenerowana. Pamiętajcie alt+insert (prawy przycisk myszy i wybór Generate)
     * następnie wybór Constructor. Wybór id jako parametru konstruktora i "ok"
     */
    public Human(long id) {
        super();
        this.id = id;
    }

    //gettery i settery wygenerowane: alt+insert getter and setter oraz wybór wszystkich pól
    /**
     * getter do pola imię
     * @return imię
      */
    public String getName() {
        return name; // skład gettera tradycyjny - po prostu zwracamy wartość pola
    }

    /**
     * setter do pola imię
     * @param name - imię
     */
    public void setName(String name) {
        this.name = name; // wartość settera również tradycyjna this.name to pole które przyjmie wartość z parametru metody (name)
    }

    /**
     * getter do pola nazwisko
     * @return nazwisko
     */
    public String getSurname() {
        return surname; // skład gettera tradycyjny - po prostu zwracamy wartość pola
    }

    /**
     * setter do pola nazwisko
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname; // wartość settera również tradycyjna this.surname to pole które przyjmie wartość z parametru metody (surname)
    }

    /**
     * getter to pola pesel
     * @return pesel
     */
    public String getPersonalIdentityNumber() {
        return personalIdentityNumber; // skład gettera tradycyjny - po prostu zwracamy wartość pola
    }

    /**
     * setter do peselu
     * @param personalIdentityNumber - pesel
     */
    public void setPersonalIdentityNumber(String personalIdentityNumber) {
        this.personalIdentityNumber = personalIdentityNumber; // wartość settera również tradycyjna this.personalIdentityNumber to pole które przyjmie wartość z parametru metody (personalIdentityNumber)
    }

    /**
     * getter do pola id
     * @return id
     */
    public long getId() {
        return id; // skład gettera tradycyjny - po prostu zwracamy wartość pola
    }

    public List<IdentificationDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(List<IdentificationDocument> documents) {
        this.documents = documents;
    }

    // metoda to string została wygenerowana poprzez alt+insert -> toString -> wybranie wszystkich pól
    /**
     * metoda to string to specjalna metoda do konwersji wartości klasy do stringa
     * @return konkatenacja wszystkich parametrów + elementy ładnego wyświetlania (nazwa klasy, nazwy pól, separatory)
     */
    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalIdentityNumber='" + personalIdentityNumber + '\'' +
                ", documents=" + documents +
                '}';
    }
}
