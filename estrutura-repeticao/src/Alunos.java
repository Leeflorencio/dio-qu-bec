public class Alunos {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "AMANDA"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //forma abreviada

        //for(String aluno : alunos){
        //System.out.println("Nome do aluno é: + aluno);
        //}
    }
}
