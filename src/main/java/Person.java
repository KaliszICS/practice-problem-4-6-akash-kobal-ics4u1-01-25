import java.util.Arrays;

/**
 * Represents a person with basic identifying information and sibling tracking.
 * 
 * By: Akash K.
 */
public class Person {

    /** The person's first name. */
    private String firstname;

    /** The person's last name. */
    private String lastname;

    /** Birth day (1–31). */
    private int birthDay;

    /** Birth month (1–12). */
    private int birthMonth;

    /** Birth year (e.g., 2000). */
    private int birthYear;

    /** Social Security Number. */
    private String ssn;

    /** Number of siblings this person has. */
    private int numberOfSiblings = 0;

    /** Array of sibling Person objects. */
    private Person[] siblings;

    /**
     * Constructs a Person with identifying information and birth date.
     *
     * @param firstname the first name
     * @param lastname the last name
     * @param birthDay the day of birth
     * @param birthMonth the month of birth
     * @param birthYear the year of birth
     * @param ssn the social security number
     */
    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.siblings = new Person[0];
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the first name.
     *
     * @param firstname the new first name
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Sets the last name.
     *
     * @param lastname the new last name
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the birthday formatted as "day/month/year".
     *
     * @return the formatted birthday string
     */
    public String getBirthday() {
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }

    /**
     * Adds a sibling to this person's sibling list.
     *
     * @param p the sibling to add
     */
    public void addSibling(Person p) {
        Person[] newArr = Arrays.copyOf(siblings, siblings.length + 1);
        newArr[siblings.length] = p;
        siblings = newArr;
        numberOfSiblings++;
    }

    /**
     * Returns an array of this person's siblings.
     *
     * @return the sibling array (never null)
     */
    public Person[] getSiblings() {
        return siblings;
    }
}
