import java.util.ArrayList;

public class Crud {
    public static void main(String[] args){
        ArrayList<String> nomeAlunos = new ArrayList<String>();
        nomeAlunos.add("Lucas");
        nomeAlunos.add("Daniel");
        nomeAlunos.add("Carlos");
        nomeAlunos.add("Herveton");

        System.out.println("Alunos matriculados para 2022:");

        for (int index = 0; index < nomeAlunos.size(); index++){
            System.out.println(nomeAlunos.get(index));
        }

        System.out.println("Alunos matriculados para o ano de 2023");
        nomeAlunos.remove(2);

        for(int index = 0; index < nomeAlunos.size(); index++){
            System.out.println(nomeAlunos.get(index));
        }

}}
