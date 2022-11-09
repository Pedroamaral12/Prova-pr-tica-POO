package Evento;


public class Participantes {
    private String cpf;
    private String name;
    private String age;
    private String passwordContainer;
    private String institution;
    private String academicTtle;
    private String key;
    public Participantes() {
    }
    public Participantes(String cpf, String name, String age, String institution, String academicTtle, String passwordContainer, String key) {
        setAcademicTtle(academicTtle);
        setAge(age);
        setCpf(cpf);
        setName(name);
        setInstitution(institution);
        setPasswordContainer(passwordContainer);
        setKey(key);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPasswordContainer() {
        return passwordContainer;
    }

    public void setPasswordContainer(String passwordContainer) {
        this.passwordContainer = passwordContainer;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getAcademicTtle() {
        return academicTtle;
    }

    public void setAcademicTtle(String academicTtle) {
        this.academicTtle = academicTtle;
    }

    void listar(){
        System.out.println(this.name);
    }



}
