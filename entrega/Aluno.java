public class Aluno {

    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: o nome não pode ser vazio.");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (!matricula.isEmpty()) {
            this.matricula = matricula;
        } else {
            System.out.println("Erro: a matrícula não pode ser vazia.");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (!curso.isEmpty()) {
            this.curso = curso;
        } else {
            System.out.println("Erro: o curso não pode ser vazio.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}