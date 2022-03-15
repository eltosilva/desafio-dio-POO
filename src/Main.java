import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Conteudo> conteudosBootcamp = new ArrayList<>();
        conteudosBootcamp.add(new Curso("Java", "Descrição curso de Java", 8));
        conteudosBootcamp.add(new Curso("JS", "Descrição curso de Javascript", 4));
        conteudosBootcamp.add(new Mentoria("Java", "Descrição mentoria de Java", LocalDate.now()));

        Bootcamp bootcamp = new Bootcamp("Java Developer", "Descrição Bootcamp Java developer", conteudosBootcamp);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println();

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João" + devJoao.getConteudosConcluidos());
    }
}
