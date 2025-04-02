package models;
public class patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double glucose;
    private double bloodPressure;
    private double skinThickness;
    private double insulin;
    private double bmi;
    private boolean diabetesPrediction;

    public patient(String name, int age, String gender, double glucose, double bloodPressure,
                   double skinThickness, double insulin, double bmi, boolean diabetesPrediction)
    {

    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public boolean isDiabetic()
    {
        return diabetesPrediction;
    }

    public String toString()
    {
        return "Patient: " + name + ", Age: " + age + ", Diabetes: " + (diabetesPrediction ? "Positive" : "Negative");
    }

}
